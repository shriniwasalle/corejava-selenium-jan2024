package org.alpha.darshan.assignment8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage {

    WebDriver driver;
    public GoogleSearchPage(WebDriver driver){
        this.driver=driver;
    }
    public void search() throws InterruptedException {
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        Thread.sleep(1000);
       List<WebElement> searchResults= driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));

       for (WebElement result:searchResults){
           System.out.println(result.getText());
       }
    }
}
