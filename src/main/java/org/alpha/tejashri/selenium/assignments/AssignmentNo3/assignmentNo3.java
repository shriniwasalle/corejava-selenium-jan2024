package org.alpha.tejashri.selenium.assignments.AssignmentNo3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignmentNo3 {
    @Test
    public void verifySignIn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        //To Sign in the Account
        WebElement texBox = driver.findElement(By.xpath("//span[text()='My Account']"));
        texBox.click();

        Thread.sleep(5000);

        WebElement texLogin = driver.findElement(By.linkText("Login"));
        texLogin.click();

        Thread.sleep(5000);

        WebElement btnCont1 = driver.findElement(By.linkText("Continue"));
        btnCont1.click();

        Thread.sleep(5000);

        WebElement texFirstname = driver.findElement(By.name("firstname"));
        texFirstname.sendKeys("Abc");//Enter First Name

        WebElement texLastName = driver.findElement(By.name("lastname"));
        texLastName.sendKeys("Xyz");//Enter Last Name

        WebElement texEmail = driver.findElement(By.name("email"));
        texLastName.sendKeys("abc123xyz@example.com");//Enter Email


        WebElement texPassword = driver.findElement(By.name("password"));
        texPassword.sendKeys("abc123");//Enter Email

        Thread.sleep(5000);

        WebElement btnCont2 = driver.findElement(By.xpath("//button[@type='submit']"));
        btnCont2.click();

        Thread.sleep(5000);

        WebElement texLoginPage = driver.findElement(By.linkText("login page"));
        texLoginPage.click();
    }
}