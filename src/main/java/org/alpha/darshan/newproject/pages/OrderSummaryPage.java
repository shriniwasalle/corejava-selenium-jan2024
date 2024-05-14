package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderSummaryPage {

    By numberOfRows=  By.xpath("//table[@class=\"data table table-totals\"]/tbody/tr");
    By numberOfColumns=By.xpath("//table[@class=\"data table table-totals\"]/tbody/tr/td");
    WebDriver driver;
    public OrderSummaryPage(WebDriver driver){
        this.driver=driver;
    }

    public void orderSummary() throws InterruptedException {
        Thread.sleep(1000);
       List<WebElement> rowElements= driver.findElements(numberOfRows);
        System.out.println(rowElements.size());
        int rowSize=  rowElements.size();
       List<WebElement> columnElements= driver.findElements(numberOfColumns);
        System.out.println(columnElements.size());
        int columnSize= columnElements.size();

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= columnSize; j++) {
                System.out.print(driver.findElement(By.xpath("//table[@class=\"data table table-totals\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText() + " ");
            }
            System.out.println();
        }
    }
}
