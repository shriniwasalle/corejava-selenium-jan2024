package org.alpha.tejashri.selenium.assignments.AssignmentNo11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HolidayPackagePage {

    private final WebDriver driver;
    private final By searchCity = By.xpath("//input[@placeholder='Enter Origin/Destination City']");
    private final By selectCity = By.xpath("//span[text()='BLISSFUL TIRUPATI']");
    private final By txtHeading = By.xpath("//h5[text()='BLISSFUL TIRUPATI']");
    private final By txtDetails = By.xpath(" //div[@class='packages-list-wrap']");
    private final By txtPrice = By.xpath("//strong[text()='₹ 14800 ']");

    //created parametrised constructor
    public HolidayPackagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHolidayPackagePage(String destinationCity) throws InterruptedException {

        System.out.println("Holiday Package Page Title : " + driver.getTitle());

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(searchCity).sendKeys(destinationCity);

        Thread.sleep(2000);

        driver.findElement(selectCity).click();

        System.out.println(driver.findElement(txtHeading).getText());

        List<WebElement> details = driver.findElements(txtDetails);

        for (WebElement detail : details) {
            System.out.println(detail.getText());
        }
        System.out.println(driver.findElement(txtPrice).getText());
    }
}
