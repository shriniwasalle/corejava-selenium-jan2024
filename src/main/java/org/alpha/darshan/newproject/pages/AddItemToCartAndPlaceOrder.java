package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddItemToCartAndPlaceOrder {

    WebDriver driver;

    By addTocartBtn=By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");

    public AddItemToCartAndPlaceOrder(WebDriver driver){
        this.driver=driver;
    }

    public void addItom() throws InterruptedException {
        WebElement productName=  driver.findElement(By.linkText("Sinbad Fitness Tank"));
        Actions actions= new Actions(driver);
        actions.moveToElement(productName).perform();

        WebElement addtoCartBtn=  driver.findElement(addTocartBtn);
        addtoCartBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-167\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-50\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 4500)");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
    }

    public String verifyItomAddedToCart() throws InterruptedException {
        /*WebDriverWait wait= new WebDriverWait(driver,5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")));*/
        Thread.sleep(2000);
        WebElement addedProduct= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
        return addedProduct.getText();
    }
}
