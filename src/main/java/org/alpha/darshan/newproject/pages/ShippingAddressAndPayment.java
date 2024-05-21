package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressAndPayment {
    WebDriver driver;
    public ShippingAddressAndPayment(WebDriver driver){
        this.driver=driver;
    }

    public void shippingAddressDetails() throws InterruptedException {
        Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@name=\"firstname\"]")).click();
       driver.findElement(By.xpath("//input[@name=\"lastname\"]")).click();
       driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("xyzInfoTech");
       driver.findElement(By.xpath("//input[@name=\"street[0]\"]")).sendKeys("flat no.905");
       JavascriptExecutor js=  (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 700)");
       driver.findElement(By.xpath("//input[@name=\"street[1]\"]")).sendKeys("Pune");
       driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("XYZcity");
       WebElement ddl= driver.findElement(By.xpath("//select[@name=\"region_id\"]"));
       Select select= new Select(ddl);
       select.selectByIndex(5);
       driver.findElement(By.xpath("//input[@name=\"postcode\"]")).sendKeys("12345");
        WebElement ddl2= driver.findElement(By.xpath("//select[@name=\"country_id\"]"));
        Select select1= new Select(ddl2);
        select1.selectByIndex(5);
        driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("888888888");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

    }
}
