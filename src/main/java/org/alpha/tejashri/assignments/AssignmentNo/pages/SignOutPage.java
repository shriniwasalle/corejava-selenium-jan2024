package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignOutPage {

    private final WebDriver driver;
    private final By heading = By.xpath("//span[@class='base']");
    private final By btnDropdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    private final By bntSignOut = By.linkText("Sign Out");

    PageActions actions;

    //created parametrised constructor
    public SignOutPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifySignOut() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Success Page
        Thread.sleep(5000);
        String actualHeading = driver.findElement(heading).getText();
        System.out.println("Heading : " +actualHeading);

        String expectedHeading = "Thank you for your purchase!";

        //Assertions
        Assert.assertEquals(actualHeading, expectedHeading);

        Thread.sleep(5000);
        actions.clickOnElement(btnDropdown);
        actions.clickOnElement(bntSignOut);
    }
}
