package org.alpha.tejashri.assignments.AssignmentNo9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPageFromToTimes {

    private final WebDriver driver;
    private final By resultHead = By.xpath("(//div[contains(@class,'top-header hidden-lg')])[1]");
    private final By trainsPath = By.xpath("(//div[contains(@class,'col-sm-5 col-xs-11')])/strong");
    private final By toPath = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[3]/div[1]/span[1]/strong");
    private final By fromPath = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[3]/div[2]/span[2]/strong");

    //created parametrised constructor
    public ResultPageFromToTimes(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyResultPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement resultHeading = driver.findElement(resultHead);
        System.out.println(resultHeading.getText());

        List<WebElement> trainsList = driver.findElements(trainsPath);
        System.out.println("Total Number of Available Trains : " + trainsList.size());

        List<String> trainNames = trainsList.stream().map(WebElement::getText).toList();

                //OR use this
//        List<String> trainNames = new ArrayList<>();
//        for (int i = 0; i <= trainsList.size() - 1; i++) {
//            trainNames.add(trainsList.get(i).getText());
//        }

        List<WebElement> toTimings = driver.findElements(toPath);
        System.out.println("Total Number of To Timings : " + toTimings.size());

        List<String> toTimes = toTimings.stream().map(WebElement::getText).toList();

        List<WebElement> fromTimings = driver.findElements(fromPath);
        System.out.println("Total Number of from Timings : " + toTimings.size());

        List<String> fromTimes = fromTimings.stream().map(WebElement::getText).toList();

        for (int i = 0; i < trainNames.size(); i++) {
            System.out.println(trainNames.get(i));
            System.out.println(toTimes.get(i) + " \t  \t " + fromTimes.get(i));
            System.out.println();
        }
    }
}