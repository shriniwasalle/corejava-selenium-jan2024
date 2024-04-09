package org.alpha.tejashri.selenium.concepts.dropdowns;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;

public class TestSeleniumHandleMultiSelectionDropdown extends BaseCodeTest {

    @Test
    public void verifyDropdowns() throws InterruptedException {

        WebDriver driver = initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html", "chrome");

        WebElement ddlIde = driver.findElement(By.id("ide"));

        //The Select tagName is used to create the IDE Name dropdown in given url
        //So Created the object of Select class
        Select ide = new Select(ddlIde);

        System.out.println("Is this multi selection dropdown ? :" + ide.isMultiple());//true

        ide.selectByValue("ec");
        ide.selectByVisibleText("IntelliJ IDEA");
        ide.selectByIndex(2);
        ide.selectByIndex(3);

        // Iterating the All Selected Options from the Multi Selection IDE Name dropdown
        List<WebElement> options = ide.getAllSelectedOptions();

        System.out.println("----- Iterate using for each loop -----");

        System.out.println("Get All Selected Options Text : ");

        for (WebElement option : options)
            System.out.println(option.getText());

        Thread.sleep(2000);

        //4 methods to deselect the options in Multi Selection Dropdown
        ide.deselectByValue("ij"); //deselect by value

        Thread.sleep(2000);

        ide.deselectByIndex(2); //deselect by index

        Thread.sleep(2000);

        ide.deselectByVisibleText("Eclipse"); //deselect by visible text

        Thread.sleep(2000);

        ide.deselectAll(); //deselect all

        driver.close();
    }
}
