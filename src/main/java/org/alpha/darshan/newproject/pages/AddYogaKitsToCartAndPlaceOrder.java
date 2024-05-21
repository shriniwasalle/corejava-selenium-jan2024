package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddYogaKitsToCartAndPlaceOrder {

    WebDriver driver;
    public AddYogaKitsToCartAndPlaceOrder(WebDriver driver){
        this.driver=driver;
    }

    public void selectYogaKits(){
        WebDriverWait wait1= new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Gear\"]")));
      WebElement gearBtn= driver.findElement(By.xpath("//span[text()=\"Gear\"]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(gearBtn).perform();
        driver.findElement(By.xpath("//span[text()=\"Bags\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"Activity\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[1]/a")).click();

        List<WebElement> itoms= driver.findElements(By.xpath("//li[@class=\"item product product-item\"]"));

        for(WebElement elements:itoms){
            Actions actions1= new Actions(driver);
            actions1.moveToElement(elements).perform();
            driver.findElement(By.xpath("//span[text()=\"Add to Cart\"]")).click();
        }
    }

}
