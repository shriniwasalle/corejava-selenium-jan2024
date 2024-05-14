package org.alpha.darshan.dropdownpractice;

import org.alpha.darshan.selenium.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlertsExample extends BaseTest {


   @Test
    public void init() throws InterruptedException {
        WebDriver driver= browserInit("https://the-internet.herokuapp.com/javascript_alerts","chrome");
        driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
        Alert al= driver.switchTo().alert();
        al.accept();
//       WebDriverWait wait= new WebDriverWait(driver,10);
//       wait.wait(1000);
       driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();

    }


}
