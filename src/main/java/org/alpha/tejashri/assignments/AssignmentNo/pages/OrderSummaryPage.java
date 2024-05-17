package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderSummaryPage {
    By btnDropDownPath = By.xpath("//*[@id='opc-sidebar']/div[1]/div/div[1]");
    By productsNamesPath = By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/aside/div[2]/div/div/div[1]/div/div[2]/div/ol/li/div/div/div/div/strong");
    By productQuantitiesPath = By.xpath("//*[@id='opc-sidebar']/div[1]/div/div[2]/div/ol/li/div/div/div/div/div");
    By productPricesPath = By.xpath("//*[@id='opc-sidebar']/div[1]/div/div[2]/div/ol/li/div/div/div/div/span/span/span");
    PageActions actions;
    WebDriver driver;

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void orderSummary() throws InterruptedException {
        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Thread.sleep(5000);
        actions.clickOnElement(btnDropDownPath);

        Thread.sleep(2000);
        List<WebElement> listOfProductsNames = driver.findElements(productsNamesPath);
        System.out.println("Total Product Names  : " + listOfProductsNames.size());
        List<String> productsNames = listOfProductsNames.stream().map(WebElement::getText).toList();

        List<WebElement> listOfProductQuantities = driver.findElements(productQuantitiesPath);
        System.out.println("Total Product Quantities  : " + listOfProductQuantities.size());
        List<String> productQuantities = listOfProductQuantities.stream().map(WebElement::getText).toList();

        List<WebElement> listOfProductPrices = driver.findElements(productPricesPath);
        System.out.println("Total Product Prices  : " + listOfProductPrices.size());
        List<String> productPrices = listOfProductPrices.stream().map(WebElement::getText).toList();

        System.out.println("----- Order Summary -----");
        for (int i = 0; i < productQuantities.size(); i++) {
            System.out.println(productsNames.get(i));
            System.out.println(productQuantities.get(i));
            System.out.println(productPrices.get(i));
        }
    }
}



