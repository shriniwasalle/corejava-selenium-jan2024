package org.alpha.darshan.assignment7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iphoneDetails {
    private final By iphoneHeading = By.xpath("//span[@id='productTitle']");
    private final By priceDetails = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='centerCol']/div[@id='apex_desktop']/div[1]/div[1]/div[4]/div[1]/span[3]/span[2]/span[2]");

    By numberOfRows = By.xpath("//*[@id=\"productOverview_feature_div\"]/div/table/tbody/tr");

    By numberOfColumns = By.xpath("//*[@id=\"productOverview_feature_div\"]/div/table/tbody/tr[1]/td");
    WebDriver driver;

    public iphoneDetails(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyIphoneDetails() {

        //model name
        String modelDetails = driver.findElement(iphoneHeading).getText();
        System.out.println("iphone model details::" + modelDetails);
        //iphone price
        String priceDetail = driver.findElement(priceDetails).getText();
        System.out.println("iphone 15 price:: " + priceDetail);
        //fetching all details

        //find the number of rows present in table

        List<WebElement> rowElements = driver.findElements(numberOfRows);
        System.out.println("row size::" + rowElements.size());
        int rowSize = rowElements.size();

        //number of columns
        List<WebElement> columElements = driver.findElements(numberOfColumns);

        System.out.println("column size::" + columElements.size());
        int columnSize = columElements.size();

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= columnSize; j++) {
                System.out.print(driver.findElement(By.xpath("//*[@id=\"productOverview_feature_div\"]/div/table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + " ");
            }
            System.out.println();
        }
    }
}
