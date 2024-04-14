package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IphonePage {


    private final WebDriver driver;
    private final By iphoneHeading = By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']");


    //created parametrised constructor
    public IphonePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getIphoneHeading() {
        System.out.println("Iphone Heading : " + driver.findElement(iphoneHeading).getText());
    }

}

