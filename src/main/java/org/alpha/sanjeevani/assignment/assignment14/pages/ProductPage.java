package org.alpha.sanjeevani.assignment.assignment14.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class ProductPage {
    WebDriver driver;
    private final By btnSearch = By.id("search");
   // private final By clkItem=By.id("*[@id='qs-option-0']/span[1]");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyProductPage(String product_name){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement search=driver.findElement(btnSearch);
                search.click();
                search.sendKeys(product_name);
                search.sendKeys(Keys.ENTER);
    }
}
