package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class TestFluentWait extends BaseTest{
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver=initBrowser("https://www.flipkart.com/","chrome");
    }
    @Test
    public void verifyFluentWait(){
        FluentWait<WebDriver>fluentWait=new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(20));
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Cart']"))).click();
    }

}
