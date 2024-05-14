package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckOutProducts {

    WebDriver driver;
    public CheckOutProducts(WebDriver driver){
        this.driver=driver;
    }

    public void checkout() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(2500, 0)");
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
        driver.findElement(By.id("top-cart-btn-checkout")).click();
    }
}
