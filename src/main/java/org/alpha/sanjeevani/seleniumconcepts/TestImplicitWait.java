package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestImplicitWait extends BaseTest{
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver=initBrowser("https://www.flipkart.com/","chrome");
    }
    @Test
    public void verifyImplicitWait(){
     driver.findElement(By.xpath("//img[@alt='Cart']")).click();

    }
}
