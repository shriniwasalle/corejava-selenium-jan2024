package org.alpha.sanjeevani.Assignment7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductTitlePage {
    private final WebDriver driver;
   private final By txtProductTitle=By.id("twotabsearchtextbox");
    private final By btnSubmit= By.id("nav-search-submit-button");
   public ProductTitlePage(WebDriver driver){
       this.driver=driver;
   }
    public void TitlePageOfProduct() {
        driver.findElement(txtProductTitle).sendKeys("iphone");
        driver.findElement(btnSubmit).click();
    }
}
