package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestJavaScriptExecutor extends BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }
    @Test
    public void jsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Get the title
        String title = js.executeScript("return document.title").toString();
        System.out.println("Title: " + title);

        // 2. Get the URL
        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL: " + url);

        // 3. Click an element by using xpath
        WebElement btnLogin = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        js.executeScript("arguments[0].click()", btnLogin);

        // 4. Refresh the page
        js.executeScript("location.reload()");

        // 5. Go to the previous page
        js.executeScript("history.back()");

        // 6. Go to the next page
        js.executeScript("history.forward()");

        // 7. Enter value in input
        js.executeScript("document.getElementById('user-name').value='Sanjeevani'");

        // 8. Navigate to a new URL
        js.executeScript("window.location='https://www.google.co.in/'");

        // Navigate back
        js.executeScript("history.back()");

        // 9. Apply border to the element
        js.executeScript("document.getElementById('user-name').style.border='2px dotted red'");
        js.executeScript("document.getElementById('password').style.background='yellow'");

    }
}
