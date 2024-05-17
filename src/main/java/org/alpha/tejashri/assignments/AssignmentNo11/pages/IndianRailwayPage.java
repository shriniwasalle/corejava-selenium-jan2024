package org.alpha.tejashri.assignments.AssignmentNo11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IndianRailwayPage {

    private final WebDriver driver;
    private final By btnZonal = By.xpath("//a[text()='Zonal Railways']");
    private final By btnCentral = By.xpath("//li[4]/div/ul/li[1]/a");

    //created parametrised constructor
    public IndianRailwayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyIndianRailwayPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("Home Page Title : " + driver.getTitle());

        WebElement zonal = driver.findElement(btnZonal);

        //Create the object of Actions class
        Actions actions = new Actions(driver);

        //Mouse Hover action perform on that element
        actions.moveToElement(zonal).perform();

        driver.findElement(btnCentral).click();

        String parentTabWindow = driver.getWindowHandle();

        Set<String> tabWindows = driver.getWindowHandles();

        for (String tabWindow : tabWindows) {

            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window

            }
        }
    }
}