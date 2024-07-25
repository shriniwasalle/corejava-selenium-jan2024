package org.alpha.sanjeevani.assignment.assignment15.pages;
import org.alpha.sanjeevani.assignment.assignment15.pageaction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class WristWatchesPage {
    WebDriver driver;
    PageActions actions;
    private final By fifthElement = By.xpath("//img[@data-image-index='5']");
    private final By watchName = By.id("productTitle");
    private final By watchPrice = By.xpath("//*[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[3]/span[2]");
    public WristWatchesPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }
    public void getWristWatches() {
        actions.clickOnElement(fifthElement);
    }
    public void verifyWindowHandle() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window :" + parentWindow);

        Set<String> tabWindows = driver.getWindowHandles();
        for (String tabWindow : tabWindows) {
            if (!parentWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window
                System.out.println("child window title:" + driver.getTitle());

                WebElement name = driver.findElement(watchName);
                System.out.println("watchName is :" + name.getText());
                WebElement price = driver.findElement(watchPrice);
                System.out.println("watchPrice is:" + driver.findElement(watchPrice).getText());
            }
        }
    }
}
