package org.alpha.darshan.assignment7.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductTitle {

    private final By productBtn= By.xpath("//span[text()=\"Apple iPhone 15 (128 GB) - Black\"]");
    WebDriver driver;

    public ProductTitle(WebDriver driver){
        this.driver=driver;
    }
    public  String verifyPageTitle(){

       WebElement pageTitle= driver.findElement(productBtn);
        return pageTitle.getText();
    }
}
