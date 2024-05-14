package org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPageFromToTimesWithDuration {

    private final WebDriver driver;
    private final By resultHead = By.xpath("(//div[contains(@class,'top-header hidden-lg')])[1]");
    private final By trainsPath = By.xpath("(//div[contains(@class,'col-sm-5 col-xs-11')])/strong");
    private final By to_FromPath = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div/div/app-train-avl-enq/div[1]/div[3]");

    //created parametrised constructor
    public ResultPageFromToTimesWithDuration(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyResultPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement resultHeading = driver.findElement(resultHead);
        System.out.println(resultHeading.getText());

        List<WebElement> trains = driver.findElements(trainsPath);
        System.out.println("Total Number of Available Trains : " + trains.size());
        List<String> trainNames = trains.stream().map(WebElement::getText).toList();

        List<WebElement> to_FromTimings = driver.findElements(to_FromPath);
        System.out.println("Total Number of To-From Timings : " + to_FromTimings.size());
        List<String> to_FromTimes = to_FromTimings.stream().map(WebElement::getText).toList();

        for (int i = 0; i < trainNames.size(); i++) {
            System.out.println(trainNames.get(i));
            System.out.println(to_FromTimes.get(i) + "\n");
        }
    }
}
