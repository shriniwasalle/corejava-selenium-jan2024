package beta.org.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;
    @Given("User opens the application")
    public void user_opens_the_application() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        }
    @When("users enters the username")
    public void users_enters_the_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        }

    @When("users enters the {string} username")
    public void users_enters_the_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    @When("users enter the password")
    public void users_enter_the_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("users enter the {string} password")
    public void users_enter_the_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("users clicks on the login button")
    public void users_clicks_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("users_logged_in_successful")
    public void users_logged_in_successful() {
        String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
        String expectedTitle = "Products";
        Assert.assertEquals(actualTitle, expectedTitle);}
}
