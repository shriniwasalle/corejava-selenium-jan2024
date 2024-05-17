package org.alpha.tejashri.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SuccessPage {

    private final WebDriver driver;
    private final By heading = By.xpath("//span[@class='base']");
    private final By btnDropdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    private final By bntSignOut = By.linkText("Sign Out");

    PageActions actions;

    //created parametrised constructor
    public SuccessPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifySuccessPage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Success Page
        Thread.sleep(5000);
        System.out.println("Heading : " +driver.findElement(heading).getText());

        Thread.sleep(5000);
        actions.clickOnElement(btnDropdown);
        actions.clickOnElement(bntSignOut);
    }
}
