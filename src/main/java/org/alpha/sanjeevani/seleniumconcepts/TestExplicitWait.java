package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestExplicitWait extends BaseTest{
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver=initBrowser("https://www.flipkart.com/","chrome");
    }
    @Test
    public void verifyExplicitWait(){
        visibilityOfElementLocated(By.xpath("//img[@alt='Cart']"));
        WebElement btnClk=driver.findElement(By.xpath("//img[@alt='Cart']"));
        btnClk.click();

       visibilityOfElementLocated(By.xpath("//*[@id='container']/div/div[2]/div/div/div/div/div/div/div[1]"));
        WebElement loginBtnClk=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div/div/div/div/div[1]"));
        loginBtnClk.getText();
    }
    public void visibilityOfElementLocated(By locator){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
