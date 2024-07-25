package org.alpha.sanjeevani.assignment.assignment12.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WidgetsPage {
    WebDriver driver;
    //By btnWidget=By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]/div/div[3]/h5");
    private final By btnWidgets = By.xpath("//div[@class='card mt-4 top-card'][4]");
    private final By btnToolsTip=By.xpath("//span[text()='Tool Tips']");
    //[id="toolTipButton"]
    private final By btn=By.id("toolTipButton");//toolTipTextField
    private final By btnHoverText=By.id("toolTipTextField");
    public WidgetsPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyWidgets(){
       //Implicit Wait

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement widgets=driver.findElement(btnWidgets);
        //To scroll down page with JavascriptExecutor
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);",widgets);
    widgets.click();

      WebElement toolsTips=driver.findElement(btnToolsTip);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",toolsTips);
        toolsTips.click();

        WebElement btnHover=driver.findElement(btn);
        Actions actions=new Actions(driver);
        actions.moveToElement(btnHover).perform();

        WebElement HoverText=driver.findElement(btnHoverText);
        System.out.println("Hover me to see :"+HoverText.getText());

    }
}
