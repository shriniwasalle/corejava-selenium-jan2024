package org.alpha.tejashri.selenium.concepts.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestExplicitWait {

    @Test
    public void verifyExplicitWait() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Explicit Wait added
        //Explicit wait applicable for particular web element only
        //create the object of WebDriverWait
        //WebDriverWait extends FluentWait, so same mechanism
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Log in to Account
        //with storing in another variable
        WebElement texUserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        texUserName.sendKeys("Admin");//Enter username

        //without storing in another variable
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");//Enter password

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        //driver.close();
    }
}
