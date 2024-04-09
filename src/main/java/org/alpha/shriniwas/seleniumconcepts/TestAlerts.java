package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestAlerts extends BaseTest {

    @Test
    public void handleAlerts() throws InterruptedException {
        WebDriver driver = initBrowser("https://the-internet.herokuapp.com/javascript_alerts", "chrome");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert al = driver.switchTo().alert();

        /*dismiss :
        accept :
        sendKeys :
        getText :*/

        al.sendKeys("Welcome Shriniwas!");
        al.accept(); // Press on OK Button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        al.dismiss(); // Press on Cancel button

        Thread.sleep(2000);


    }
}
