package org.alpha.tejashri.selenium.concepts.alerts;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestAlerts extends BaseCodeTest {

    @Test
    public void handleAlerts() throws InterruptedException {
        WebDriver driver = initBrowser("https://the-internet.herokuapp.com/javascript_alerts", "chrome");

        //Instead of storing in another variable (WedElement), can perform next operation on that directly (ie can apply next other methods on that directly)
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert al = driver.switchTo().alert();

        /*
        Alert is an interface in selenium.
        In that 4 methods are there :
        1. dismiss() : To click on cancel button
        2. accept() : To press on ok button
        3. getText() : To get text of Alert box
        4. sendKeys() : To write input massage

        switchTo() is the method in WebDriver interface.
        In WebDriver interface in that TargetLocator interface in that alert() method is present with return type Alert
        */

        Thread.sleep(2000);

        System.out.println("Text of Alert box :  " + al.getText());
        al.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(2000);

        System.out.println("Text of Confirm box :  " + al.getText());
        al.dismiss();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Thread.sleep(2000);

        System.out.println("Text of Prompt box :  " + al.getText());

        Thread.sleep(2000);

        al.sendKeys("Welcome To Automation");

        Thread.sleep(2000);

        al.accept();

        driver.close();
    }
}
