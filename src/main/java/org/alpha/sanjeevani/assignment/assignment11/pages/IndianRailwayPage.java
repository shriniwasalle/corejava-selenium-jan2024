package org.alpha.sanjeevani.assignment.assignment11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IndianRailwayPage {
    private final WebDriver driver;
    By btnZonal=By.xpath("//a[text()='Zonal Railways']");
    By btnCentral= By.xpath("//a[@title='Central Railway']");
    public IndianRailwayPage(WebDriver driver){
         this.driver=driver;
    }
    public void verifyIndianRailway(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Home page title :"+driver.getTitle());
        Actions actions=new Actions(driver);

        WebElement zonal = driver.findElement(btnZonal);
        actions.moveToElement(zonal).perform();
        driver.findElement(btnCentral).click();

        String parentTabWindow=driver.getWindowHandle();
        Set<String>tabWindows =driver.getWindowHandles();

        for (String tabWindow:tabWindows){
            if (!parentTabWindow.equals(tabWindow)){
                driver.switchTo().window(tabWindow);
            }
        }
        }
}
