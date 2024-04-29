package org.alpha.tejashri.selenium.concepts.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestImplicitWait {

    @Test
    public void verifyImplicitWait() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Implicit Wait added
        //Implicit wait applicable for all web elements in this web page
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement texBox = driver.findElement(By.xpath("//span[text()='My Account']"));
        texBox.click();

        WebElement texLogin = driver.findElement(By.linkText("Login"));
        texLogin.click();

        WebElement btnCont1 = driver.findElement(By.linkText("Continue"));
        btnCont1.click();

        WebElement texFirstname = driver.findElement(By.name("firstname"));
        texFirstname.sendKeys("Abc");//Enter First Name

        WebElement texLastName = driver.findElement(By.name("lastname"));
        texLastName.sendKeys("Xyz");//Enter Last Name

        WebElement texEmail = driver.findElement(By.name("email"));
        texLastName.sendKeys("abc123xyz@example.com");//Enter Email

        WebElement texPassword = driver.findElement(By.name("password"));
        texPassword.sendKeys("abc123");//Enter Email

        WebElement btnCont2 = driver.findElement(By.xpath("//button[@type='submit']"));
        btnCont2.click();

        //driver.close();
    }
}
