package org.alpha.darshan.selenium.assignment;

import org.alpha.darshan.selenium.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownVerifyExample extends BaseTest {

    @Test
    public void dropDownVerification(){

       WebDriver driver= browserInit("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html","chrome");

        WebElement ddlCourse= driver.findElement(By.xpath("//select[@id=\"course\"]"));

        driver.manage().window().maximize();

        Select courseName= new Select(ddlCourse);

        courseName.selectByIndex(1);

        courseName.selectByVisibleText("Select");

        courseName.selectByValue("java");

        //courseName.deselectByVisibleText("Java");
    }
}
