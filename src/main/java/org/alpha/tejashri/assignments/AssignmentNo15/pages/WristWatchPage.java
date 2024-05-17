package org.alpha.tejashri.assignments.AssignmentNo15.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WristWatchPage {

    private final WebDriver driver;
    private final By fifthElement = By.xpath("//img[@data-image-index='5']");
    private final  By watchName = By.id("productTitle");
    private final  By watchPrice = By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[3]/span[2]");
    //created parametrised constructor
    public WristWatchPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getFifthResult() {
        WebElement fSearch = driver.findElement(fifthElement);
        fSearch.click();
    }

    public void verifyWindowHandle() {
        String parentTabWindow = driver.getWindowHandle();

        System.out.println("Parent Window Title : " + driver.getTitle());

        Set<String> tabWindows = driver.getWindowHandles();

        for (String tabWindow : tabWindows) {
            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window

                System.out.println("Child Window Title : " + driver.getTitle());

                System.out.println("Product Name : " +driver.findElement(watchName).getText());
                System.out.println("Product Price : " +driver.findElement(watchPrice).getText());

            }
        }
    }
}
