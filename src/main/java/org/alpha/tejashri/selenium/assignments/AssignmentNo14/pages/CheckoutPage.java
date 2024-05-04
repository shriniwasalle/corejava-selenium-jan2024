package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckoutPage {

    private final WebDriver driver;

    private final By txtAddress = By.name("street[0]");
    private final By txtCity = By.name("city");
    private final By txtRegion = By.name("region_id");
    private final By txtPostCode = By.name("postcode");
    private final By txtPhone = By.name("telephone");
    private final By txtFixed = By.name("ko_unique_1");
    private final By btnNext = By.xpath("//button[@class=\"button action continue primary\"]");

    private final By txtPrice = By.xpath("//div[2]/div[1]/span[2]");
    private final By btnPlaceOrder = By.xpath("//button[@class=\"action primary checkout\"]");

    //created parametrised constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutPage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Checkout Page

//        driver.findElement(txtAddress).sendKeys("street No. 1, Luma Building");
//        driver.findElement(txtCity).sendKeys("Luma");
//
//        WebElement btnRegionID = driver.findElement(txtRegion);
//        Select regionID = new Select(btnRegionID);
//        regionID.selectByVisibleText("California");
//
//        driver.findElement(txtPostCode).sendKeys("12345-6789");
//        driver.findElement(txtPhone).sendKeys("1234567890");

        Thread.sleep(5000);
        driver.findElement(txtFixed).click();
        driver.findElement(btnNext).click();

        Thread.sleep(5000);
        WebElement price = driver.findElement(txtPrice);
        System.out.println(price.getText());

        Thread.sleep(2000);
        driver.findElement(btnPlaceOrder).click();

    }
}
