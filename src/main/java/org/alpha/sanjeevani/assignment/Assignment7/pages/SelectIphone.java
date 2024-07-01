package org.alpha.sanjeevani.assignment.Assignment7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SelectIphone {
    private final WebDriver driver;
    private final By productBtn=By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    public SelectIphone(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSelectedPhone() {
        driver.findElement(productBtn).click();
    }

    public void windowHandle(){
       String parentWindow=driver.getWindowHandle();

        Set<String> windows=driver.getWindowHandles();

        for(String window:windows){
            if(!parentWindow.equals(window)){
                driver.switchTo().window(window);
                System.out.println("child window title is:"+driver.getTitle());
            }

        }
    }
}

