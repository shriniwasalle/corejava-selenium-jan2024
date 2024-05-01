package org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPage {

    private final WebDriver driver;
    private final By resultHead = By.xpath("(//div[contains(@class,'top-header hidden-lg')])[1]");
    private final By trainsPath = By.xpath("(//div[contains(@class,'col-sm-5 col-xs-11')])/strong");
    private final By to_FromPath = By.xpath("//*[@id='divMain']/div/app-train-list/div[4]/div/div[5]/div/div/app-train-avl-enq/div/div[3]/div/span/strong");

    //created parametrised constructor
    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getResultHeading() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement resultHeading = driver.findElement(resultHead);
        System.out.println(resultHeading.getText());

        List<WebElement> trains = driver.findElements(trainsPath);
        System.out.println("Total Number of Available Trains : " + trains.size());

        System.out.println("-----List of Available Trains-----");
        for (WebElement train : trains) {
            System.out.println(train.getText());
        }

        System.out.println();

        List<WebElement> to_FromTimings = driver.findElements(to_FromPath);
        System.out.println("Total Number of To-From Timings : " + to_FromTimings.size());

        System.out.println("----List of To-From Timings of Available Trains-----");
        for (WebElement to_FromTiming : to_FromTimings) {
            System.out.println(to_FromTiming.getText());
        }
    }
}
