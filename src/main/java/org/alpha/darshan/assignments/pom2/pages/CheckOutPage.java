package org.alpha.darshan.assignments.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver= driver;
    }
    public String verifycheckOutPageTitle(){
      return driver.findElement(By.xpath("//span[text()=\"Checkout: Your Information\"]")).getText();

    }

    public void yourInformaton(String firstName,String lastName,String postalCode){
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        driver.findElement(By.id("continue")).click();
    }
}
