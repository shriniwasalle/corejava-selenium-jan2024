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
    public void search(){
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");

       List<WebElement> searchResults= driver.findElements(By.xpath("//div[@class='wM6W7d'][1]/span/b"));

       for (WebElement result:searchResults){
           System.out.println(result);
       }
    }
}
