package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Iphone15BlackPage {


    private final WebDriver driver;
    private final By iphone15Heading = By.xpath("//*[@id='productTitle']");
    private final By iphone15BlackPrice = By.xpath("//*[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[3]/span[2]/span[2]");
    private final By tablePath = By.xpath("//*[@id='productOverview_feature_div']/div/table");
    private final By rowsPath = By.xpath("//*[@id='productOverview_feature_div']/div/table/tbody/tr");
    private final By cellsPath = By.xpath("//*[@id='productOverview_feature_div']/div/table/tbody//td");

    //created parametrised constructor
    public Iphone15BlackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyIphone15Details() {

        System.out.println("Product Name : " + driver.findElement(iphone15Heading));
        System.out.println("Product Price : " + driver.findElement(iphone15BlackPrice).getText());

        //Locate the table element
        WebElement table = driver.findElement(tablePath);

        //Locate all rows of the table
        List<WebElement> rows = table.findElements(rowsPath);
        //System.out.println("Table Rows Size : " + rows.size());

        //Iterating each row
        System.out.println("Product Details : ");
        for (WebElement row : rows) {

            //To get table values
            List<WebElement> cells = row.findElements(cellsPath);
            //System.out.println("Total Number of Table cells :  " + cells.size());

            //Iterating each value
            for (WebElement cell : cells) {
                System.out.println(cell.getText());
            }
            break;
        }
    }
}


