package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumHandleDropdown extends BaseTest {

    @Test
    public void verifyDropdowns() throws InterruptedException {

        WebDriver driver = initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html", "chrome");

        WebElement ddlCourseName = driver.findElement(By.xpath("//select[@id='course']"));

        Select courseName = new Select(ddlCourseName);

        System.out.println("Get First Selected Option  : " +courseName.getFirstSelectedOption().getText());

        Thread.sleep(2000);

        courseName.selectByIndex(2); // Dot Net

        Thread.sleep(2000);

        courseName.selectByVisibleText("Javascript"); // Javascript

        Thread.sleep(2000);

        courseName.selectByValue("python"); // Python

        List<WebElement> courses = courseName.getOptions();
        System.out.println("Total Options: " +courses.size());

        for (WebElement course : courses) {
            System.out.println(course.getText());
        }

        System.out.println("Is this multi selection dropdown ? : " +courseName.isMultiple());

    }
}
