package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumHandleMultiDropdown extends BaseTest {

    @Test
    public void verifyDropdowns() throws InterruptedException {

        WebDriver driver = initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html", "chrome");

        WebElement ddlIde = driver.findElement(By.id("ide"));

        Select ide = new Select(ddlIde);

        System.out.println("Is Multiple? :" +ide.isMultiple()); // True

        ide.selectByValue("ec");
        ide.selectByVisibleText("IntelliJ IDEA");
        ide.selectByIndex(2);

//        ide.deselectByVisibleText("Eclipse");
//        ide.deselectByIndex(2);
//        ide.deselectByValue("ij");

       // ide.deselectAll();

        List<WebElement> options = ide.getAllSelectedOptions();

        for (WebElement option : options)
            System.out.println(option.getText());
    }
}
