package org.alpha.tejashri.assignments.AssignmentNo12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ToolsQAPage {

    private final WebDriver driver;

    private final By btnWidgets = By.xpath("//div[@class='card mt-4 top-card'][4]");
    private final By btnToolsTips = By.xpath("//span[text()='Tool Tips']");
    private final By btn = By.id("toolTipButton");
    private final By btnHoverText = By.xpath("//div[@class='tooltip-inner']");

    //created parametrised constructor
    public ToolsQAPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyToolsQAPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement widgets = driver.findElement(btnWidgets);

        //To scroll down page with JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widgets);
        widgets.click();

        WebElement toolsTips = driver.findElement(btnToolsTips);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", toolsTips);
        toolsTips.click();

        WebElement bntHover = driver.findElement(btn);

        Actions actions = new Actions(driver);

        //moveToElement() method used for move to that Element /used for mouse hover on that element with mouse
        actions.moveToElement(bntHover).perform();

        System.out.println("Hover me to see : " + driver.findElement(btnHoverText).getText());

    }
}