package org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages;
import org.openqa.selenium.*;

public class LoginPage {

    private final WebDriver driver;
    private final By boxFrom = By.xpath("//input[contains(@class,'ng-tns-c57-8')]");
    private final By boxTo = By.xpath("//input[contains(@class,'ng-tns-c57-9')]");
    private final By btnSearch = By.xpath("//button[@type='submit']");

    //Created the Parameterized Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToApplication(String enterFrom, String enterTo) {

        WebElement txtFrom = driver.findElement(boxFrom);
        txtFrom.sendKeys(enterFrom);
        txtFrom.sendKeys(Keys.TAB);

        WebElement txtTo = driver.findElement(boxTo);
        txtTo.sendKeys(enterTo);
        txtTo.sendKeys(Keys.TAB);

        driver.findElement(btnSearch).click();
    }
}