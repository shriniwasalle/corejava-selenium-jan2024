package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreateAccountPage {
    private final WebDriver driver;
    private final By linkCreate = By.linkText("Create an Account");
    private final By firstName = By.id("firstname");
    private final By lastName = By.id("lastname");
    private final By email = By.id("email_address");
    private final By password = By.id("password");
    private final By confirmPassword = By.id("password-confirmation");
    private final By btnSubmit = By.xpath("//button[@class='action submit primary']");
    private final By txtSuccessMssg = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    private final By txtUnsuccessMssg = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    PageActions actions;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verityCreateAccountPage(String firstname, String lastname, String txtEmail, String txtPass, String confPass, String type) {

        actions.clickOnElement(linkCreate);

        //Personal Information page
        actions.enterText(firstName, firstname);
        actions.enterText(lastName, lastname);

        //Sign-in Information
        actions.enterText(email, txtEmail);
        actions.enterText(password, txtPass);
        actions.enterText(confirmPassword, confPass);
        actions.clickOnElement(btnSubmit);

        switch (type) {
            case "Successful" -> {

                String actualSuccessMssg = driver.findElement(txtSuccessMssg).getText();
                System.out.println("Heading : " + actualSuccessMssg);

                String expectedSuccessMssg = "Thank you for registering with Main Website Store.";

                //Assertions
                Assert.assertEquals(actualSuccessMssg, expectedSuccessMssg);

            }
            case "Unsuccessful" -> {
                String actualUnsuccessMssg = driver.findElement(txtUnsuccessMssg).getText();
                System.out.println("Heading : " + actualUnsuccessMssg);

                String expectedUnsuccessMssg = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";

                //Negative Assertions
                Assert.assertEquals(actualUnsuccessMssg, expectedUnsuccessMssg);
            }
        }
    }
}
