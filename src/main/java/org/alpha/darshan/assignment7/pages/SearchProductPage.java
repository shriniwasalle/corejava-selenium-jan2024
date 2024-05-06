package org.alpha.darshan.assignment7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

    private final By searchBtn=  By.id("twotabsearchtextbox");
    private final By searchBox= By.id("nav-search-submit-button");
    WebDriver driver;

    public SearchProductPage(WebDriver driver){
        this.driver= driver;
    }
    public void searchProduct(){

        driver.findElement(searchBtn).sendKeys("iphone");
        driver.findElement(searchBox).click();
    }
}
