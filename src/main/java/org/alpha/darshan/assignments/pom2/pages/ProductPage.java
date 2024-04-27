package org.alpha.darshan.assignments.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public String verifyTitle(){

        WebElement productTitle= driver.findElement(By.xpath("//span[text()=\"Products\"]"));
        return productTitle.getText();
    }

    public void addToCartProduct(){
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//a[@data-test=\"shopping-cart-link\"]")).click();
    }


}
