package org.alpha.tejashri.cucumber.stepdefinitions;

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
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    //With Hardcoded values
    @When("User enters the username")
    public void user_enter_the_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @When("User enters the password")
    public void user_enter_the_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    //With Dynamic values
    @When("User enters the {string} username")
    public void user_enter_the_username(String userName) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
    }

    @When("User enters the {string} password")
    public void user_enter_the_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
        driver.close();
    }

    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {
        String actualHeading = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actualHeading, "Products");
        driver.close();
    }

    @Then("Logged is successfully or unsuccessfully with {string}")
    public void logged_is_successfully_or_unsuccessfully_with(String type) {
        switch (type) {
            case "valid" -> {

                String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedHeading = "Products";
                Assert.assertEquals(actualHeading, expectedHeading);
            }
            case "locked_out" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
            case "invalid" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
        }
        driver.close();
    }

}
