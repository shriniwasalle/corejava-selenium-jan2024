package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.alpha.tejashri.assignments.AssignmentNo.utils.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class CheckoutPage {

    private final WebDriver driver;

    private final By txtAddress = By.name("street[0]");
    private final By txtCity = By.name("city");
    private final By txtRegion = By.name("region_id");
    private final By txtPostCode = By.name("postcode");
    private final By txtPhone = By.name("telephone");
    private final By txtFixed = By.xpath("//input[@value='tablerate_bestway']");
    private final By btnNext = By.xpath("//button[@class='button action continue primary']");
    private final By txtPrice = By.xpath("//span[@data-bind='text: getValue()' and @class='price']");
    private final By btnPlaceOrder = By.xpath("//button[@class='action primary checkout']");

    PageActions actions;

    //created parametrised constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifyCheckoutPage(String add, String city, String post, String phone, String address_Type) throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Thread.sleep(2000);
        //Checkout Page

        switch (address_Type) {
            case "oldAddress" -> {
                actions.clickOnElement(txtFixed);
                actions.clickOnElement(btnNext);

            }
            case "newAddress" -> {
                actions.enterText(txtAddress, add);
                actions.enterText(txtCity, city);

                WebElement btnRegionID = driver.findElement(txtRegion);
                Select regionID = new Select(btnRegionID);
                regionID.selectByVisibleText("California");

                actions.enterText(txtPostCode, post);
                actions.enterText(txtPhone, phone);

                Thread.sleep(5000);
                actions.clickOnElement(txtFixed);
                actions.clickOnElement(btnNext);
            }
        }

        String actualPrice = driver.findElement(txtPrice).getText();
        System.out.println("Order Total Price : " +actualPrice);

        String expectedPrice = "$210.40";

        //Assertions
        Assert.assertEquals(actualPrice, expectedPrice);

        Thread.sleep(5000);
        actions.clickOnElement(btnPlaceOrder);
    }
}
