package org.alpha.darshan.assignment7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class VerifyProductDetails {
    private final By productBtn= By.xpath("//span[text()=\"Apple iPhone 15 (128 GB) - Black\"]");
    WebDriver driver;

    public  VerifyProductDetails(WebDriver driver){
        this.driver=driver;
    }
    public  void verifyProductDetails(){

        driver.findElement((productBtn)).click();
    }

    public void windowHandles(){

       String parentWindow= driver.getWindowHandle();// to get unique if of the window


        Set<String> windows= driver.getWindowHandles();

        for (String window:windows){
            //System.out.println(window);
            if(!parentWindow.equals(window)){
                driver.switchTo().window(window);
                System.out.println("child Window Title::"+ driver.getTitle());
                System.out.println("------------------------");
            }
        }

    }
}
