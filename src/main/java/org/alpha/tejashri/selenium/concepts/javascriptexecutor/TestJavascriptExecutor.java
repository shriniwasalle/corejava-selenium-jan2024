package org.alpha.tejashri.selenium.concepts.javascriptexecutor;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJavascriptExecutor extends BaseCodeTest {

    WebDriver driver;

    @BeforeMethod

    public void init() {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void jsExecutor() {
        //Type casting--> object into string
        //String str = (Object) obj;

        //Same Type casting--> driver into JSE

        //JavascriptExecutor is an interface in selenium
        //then we cnt create an object of interface
        //so type casting the driver instance & covert into JSE
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //now driver is converted into JSE with return type JSE so stored in that

        //1. To get the title
        String title = js.executeScript("return document.title").toString();
        System.out.println("Title : " + title);

        //2. To get the current url
        String url = js.executeScript("return document.URL").toString();
        System.out.println("Current URL : " + url);

        //3. To click on element by using id in js
        js.executeScript("document.getElementById('login-button').click()");

        //4. To click on element by using xpath in js
        //WebElement btnLogin = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        //js.executeScript("arguments[0].click()", btnLogin);
        //Here--> js.executeScript("script", Arguments);

        //5. To Refresh the web page
        js.executeScript("location.reload()");

        //6. To go back to the previous web page
        js.executeScript("history.back()");

        //7. To go to the next web page
        js.executeScript("history.forward()");

        //8. To enter value in input
        //js.executeScript("document.getElementById('user-name').value = 'standard_user'" );

        //9. To enter value in input using xpath in js
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        js.executeScript("arguments[0].value='standard_user'", userName);

        //10. To navigate to new url / open new Web Page
        js.executeScript("window.location='https://www.google.co.in/'");

        js.executeScript("history.back()");

        //11. To apply the border for an element
        js.executeScript("document.getElementById('user-name').style.border='2px dotted red'");

        //12. To apply the background for an element
        js.executeScript("document.getElementById('password').style.background='yellow'");

    }
}
