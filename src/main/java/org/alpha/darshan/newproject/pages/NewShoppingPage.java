package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewShoppingPage {


    WebDriver driver;

    public NewShoppingPage(WebDriver driver){
        this.driver=driver;
    }
    public void newShoppingMens(){
        // Navigate to Men -> Tops
        WebDriverWait wait1= new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]/span[2]")));
       WebElement menMenu= driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(menMenu).perform();

        // Select New Shopping Options Filter and choose 'Yes'
        driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]")).click();
        WebElement newShoppingOptionsFilter=  driver.findElement(By.xpath("//div[text()=\"New\"]"));
        newShoppingOptionsFilter.click();
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[9]/div[2]/ol/li[1]/a")).click();
    }
}
