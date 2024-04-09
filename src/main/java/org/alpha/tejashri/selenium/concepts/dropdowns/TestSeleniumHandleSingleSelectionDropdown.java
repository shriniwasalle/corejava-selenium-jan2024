package org.alpha.tejashri.selenium.concepts.dropdowns;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class TestSeleniumHandleSingleSelectionDropdown extends BaseCodeTest {

    @Test
    public void verifySingleSelectionDropdown() throws InterruptedException {

        WebDriver driver = initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html", "chrome");

        //ddl : dropdown list
        WebElement ddlCourseName = driver.findElement(By.xpath("//select[@id='course']"));

        //The Select tagName is used to create the Course Name dropdown in given url
        //So Created the object of Select class
        Select courseName = new Select(ddlCourseName);
        //Select is a class in selenium

        System.out.println("Get First Selected Option  : " + courseName.getFirstSelectedOption().getText());
        //getFirstSelectedOption() method gives the First Selected Option

        //3 methods to select the options in Single Selection Dropdown

        //1. By selectByIndex() method
        courseName.selectByIndex(2);//Dot Net
        //courseName.selectByIndex(1);//Java

        Thread.sleep(2000);

        //2. By selectByVisibleText() method
        courseName.selectByVisibleText("Javascript");//Javascript
        //courseName.selectByVisibleText("Dot Net");//Dot Net

        Thread.sleep(2000);

        //3. By selectByValue() method
        courseName.selectByValue("python");//Python
        //courseName.selectByValue("net");//Dot Net

        // Iterating the all/total options of Course Name dropdown
        List<WebElement> courses = courseName.getOptions();

        System.out.println("Total Options: " + courses.size());

        System.out.println("Iterating the all/total options of Course Name dropdown : ");
        System.out.println("----- Iterate using for each loop -----");
        for (WebElement course : courses) {
            System.out.println(course.getText());
        }

        System.out.println("----- Iterate using for loop -----");
        for (int i = 0; i <= courses.size() - 1; i++) {
            WebElement course = courses.get(i);
            System.out.println(course.getText());
        }

        System.out.println("----- Iterate using Iterator with while loop -----");
        Iterator<WebElement> itr = courses.iterator();

        while (itr.hasNext()) {
            WebElement course = itr.next();
            System.out.println(course.getText());
        }

        System.out.println("Is this multi selection dropdown ? : " + courseName.isMultiple());//false

        driver.close();
    }
}
