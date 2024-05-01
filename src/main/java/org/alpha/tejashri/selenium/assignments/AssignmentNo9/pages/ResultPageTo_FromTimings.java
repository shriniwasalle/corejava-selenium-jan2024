package org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPageTo_FromTimings {

    private final WebDriver driver;
    private final By resultHead = By.xpath("(//div[contains(@class,'top-header hidden-lg')])[1]");
    private final By trainsPath = By.xpath("(//div[contains(@class,'col-sm-5 col-xs-11')])/strong");
    private final By toPath = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[3]/div[1]/span/strong");
    private final By fromPath = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[3]/div[2]/span[2]/strong");

    //created parametrised constructor
    public ResultPageTo_FromTimings(WebDriver driver) {
        this.driver = driver;
    }

    public void getResultHeading() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement resultHeading = driver.findElement(resultHead);
        System.out.println(resultHeading.getText());

        List<WebElement> trains = driver.findElements(trainsPath);
        System.out.println("Total Number of Available Trains : " + trains.size());

        System.out.println("-----List of Available Trains-----");
        for (int i = 0; i <= trains.size() - 1; i++) {
            System.out.println("Train Name : " + trains.get(i).getText());
        }

        List<WebElement> toTimings = driver.findElements(toPath);
        System.out.println("Total Number of To Timings : " + toTimings.size());

        for (WebElement toTiming : toTimings) {
            System.out.println("To :" + toTiming.getText());
        }

        List<WebElement> fromTimings = driver.findElements(fromPath);
        System.out.println("Total Number of from Timings : " + toTimings.size());

        for (WebElement fromTiming : fromTimings) {
            System.out.println("From :" + fromTiming.getText());

        }
    }

}