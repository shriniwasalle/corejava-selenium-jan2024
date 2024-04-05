package org.alpha.tejashri.selenium.practic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSignIn {
    @Test
    public void verifySignIn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //Log in to Account
        WebElement texUserName = driver.findElement(By.name("username"));
        texUserName.sendKeys("Admin");//Enter username

        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("admin123");//Enter password

        WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        btnSubmit.click();

    }
}
