package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Iphone15BlackPage {


    private final WebDriver driver;
    private final By iphone15Heading = By.xpath("//*[@id='productTitle']");
    private final By iphone15BlackPrice = By.xpath("//*[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[3]/span[2]/span[2]");
    private final By rowsPath = By.xpath("//*[@id='productOverview_feature_div']/div/table/tbody/tr");
    private final By columnsPath = By.xpath("//*[@id='productOverview_feature_div']/div/table/tbody/tr[1]/td");

    //created parametrised constructor
    public Iphone15BlackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyIphone15Details() {

        System.out.println("Product Name : " +driver.findElement(iphone15Heading).getText());
        System.out.println("Product Price : " +driver.findElement(iphone15BlackPrice).getText());

        //Locate all rows of the table
        List<WebElement> rows = driver.findElements(rowsPath);
        int rowsSize = rows.size();
        System.out.println("Total Number of rows  : " +rowsSize );

        //To get table values
        List<WebElement> columns = driver.findElements(columnsPath);
        int columnsSize = columns.size();

        System.out.println("Total Number of columns :  " +columnsSize);

        //Iterating each row
        System.out.println("---- Product Details ----");
        for (int i = 1; i <= rowsSize; i++) {

            //Iterating each column
            for (int j = 1; j <= columnsSize; j++) {
                System.out.print(driver.findElement(By.xpath("//*[@id='productOverview_feature_div']/div/table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + " : ");
            }
            System.out.println();
        }
    }
}


