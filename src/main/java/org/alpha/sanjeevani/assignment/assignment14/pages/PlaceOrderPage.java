package org.alpha.sanjeevani.assignment.assignment14.pages;
import org.alpha.sanjeevani.assignment.assignment14.pageaction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
    WebDriver driver;
    PageActions actions;
    private final By txtOrder=By.xpath("//span[@data-bind=i18n: 'Place Order']");
    public PlaceOrderPage(WebDriver driver){
        this.driver=driver;
        actions=new PageActions(driver);
    }
    public void verifyPlaceOrder(){
        driver.findElement(txtOrder);
        actions.clickOnElement(txtOrder);
    }

}
