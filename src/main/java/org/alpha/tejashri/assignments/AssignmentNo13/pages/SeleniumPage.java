package org.alpha.tejashri.assignments.AssignmentNo13.pages;

import org.alpha.tejashri.assignments.AssignmentNo13.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumPage {

    private final WebDriver driver;
    private final By linkSelenium = By.linkText("org.openqa.selenium");
    private final By btnInterface = By.id("class-summary-tab1");
    private final By btnWebElement = By.linkText("WebElement");
    private final By methodsPath = By.xpath("//div/div/code");
    PageActions actions;

    //created parametrised constructor
    public SeleniumPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifySeleniumPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        actions.clickOnElement(linkSelenium);
        actions.clickOnElement(btnInterface);
        actions.clickOnElement(btnWebElement);

        List<WebElement> methods = driver.findElements(methodsPath);
        System.out.println("Total No of Elements : " +methods.size());

        for (int i = 0; i <= methods.size() - 1; i = i + 2) {
            System.out.println(methods.get(i).getText() +" : " +methods.get(i+1).getText());
        }
    }
}