package org.alpha.tejashri.selenium.assignments.AssignmentNo11.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CentralRailwayPage {

    private final WebDriver driver;
    private final By btnHoliday = By.xpath("//a[@title='Holiday Packages']");

    //created parametrised constructor
    public CentralRailwayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verityCentralRailwayPage() {

        System.out.println("Central Railway Page Title : " + driver.getTitle());

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(btnHoliday).click();

        //Switch to Alert Box
        Alert al = driver.switchTo().alert();
        al.accept();

        String parentTabWindow = driver.getWindowHandle();

        Set<String> tabWindows = driver.getWindowHandles();

        for (String tabWindow : tabWindows) {

            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window

            }
        }
    }
}
