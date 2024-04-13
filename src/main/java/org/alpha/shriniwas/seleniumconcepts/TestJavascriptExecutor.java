package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestJavascriptExecutor extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @Test
    public void jsExecutor() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. To get the title

        String title = js.executeScript("return document.title").toString();
        System.out.println("Title: " +title);

        // 2. To get the URL
        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL: " +url);

        // 3. To click an Element
        // js.executeScript("document.getElementById('login-button').click()");

        // Click on Element by using xpath in js
        WebElement btnLogin = driver.findElement(By.xpath("//input[@data-test='login-button']"));

        js.executeScript("arguments[0].click()", btnLogin);

        // 4. To refresh
        js.executeScript("location.reload()");

        // 5. To go back to the prev page
        js.executeScript("history.back()");

        // 6. To go to the next page
        js.executeScript("history.forward()");

        // 7. To Enter value in Input
        js.executeScript("document.getElementById('user-name').value='Shriniwas'");

        // 8. To navigate to new url
        js.executeScript("window.location='https://www.google.com/'");

        // 9. To apply the border for an element
        js.executeScript("document.getElementById('user-name').style.border='1px solid blue'");


    }
}
