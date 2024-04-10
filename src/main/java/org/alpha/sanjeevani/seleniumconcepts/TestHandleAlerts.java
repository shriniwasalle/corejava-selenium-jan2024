package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestHandleAlerts extends BaseTest {
    @Test
    public void handleAlerts() throws InterruptedException {
        WebDriver driver = initBrowser("https://the-internet.herokuapp.com/javascript_alerts", "chrome");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert alert = driver.switchTo().alert();

        //dismiss
        //accept()
        //sendKeys()
        //getText()

        alert.sendKeys("Welcome Sanjeevani To Automation Course");

        alert.accept();  //press on accept button

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(2000);

        alert.accept();  //press on accept button

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        alert.dismiss(); //press on cancel button

        driver.close();
    }
}
