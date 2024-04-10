package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestHandleAlertsForPractice extends BaseTest {
    @Test
    public void handleAlerts() throws InterruptedException {
        WebDriver driver=initBrowser("https://the-internet.herokuapp.com/javascript_alerts","chrome");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello Sanjeevani");
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alert.dismiss();
        Thread.sleep(3000);

        driver.close();

    }
}

