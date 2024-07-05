package org.alpha.sanjeevani.assignment.assignment11.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CentralRailwayPage {
   private final WebDriver driver;
    private final By btnHoliday = By.linkText("Holiday Packages");

    public CentralRailwayPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyCentralRailway(){
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
       driver.findElement(btnHoliday).click();
       //Switch to alert box
        Alert alert=driver.switchTo().alert();
        alert.accept();

        String parentTabWindow=driver.getWindowHandle();
        Set<String> tabWindows=driver.getWindowHandles();

        for (String tabWindow:tabWindows){
            if (!parentTabWindow.equals(tabWindow)){
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window
            }
        }
    }
}
