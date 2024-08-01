package org.alpha.sanjeevani.assignment.assignment14.pages;
import org.alpha.sanjeevani.assignment.assignment14.pageaction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class ShippingAddressPage {
    WebDriver driver;
    PageActions actions;
    private final By txtEmail= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input");
    private final By txtFirstName= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input");
    private final By txtLastName= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input");
    private final By txtCompanyName= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input");
    private final By txtAddress= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input");
    private final By txtCityName= By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input");
    private final By txtStateName= By.xpath("//*[@name='region_id']");
    private final By postalCode= By.xpath("html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input");
    private final By TxtCountryName=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select");
    private final By contactNo=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input");
    private final By btnNext=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span");
    public ShippingAddressPage(WebDriver driver){
        this.driver= driver;
        actions=new PageActions(driver);
    }
    public void verifyShippingAddress(String email,String first_name,String last_name,String company_name,String street_address,String city_name,String zip_code,String country_name, String contact_no)throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        actions.enterText(txtEmail,email);
        actions.enterText(txtFirstName,first_name);
        actions.enterText(txtLastName,last_name);
        actions.enterText(txtCompanyName,company_name);
        actions.enterText(txtAddress,street_address);
        actions.enterText(txtCityName,city_name);

        WebElement btnStateName=driver.findElement(txtStateName);
//        Select enterStateName=new Select(btnStateName);
//        enterStateName.selectByIndex(5);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].click();",btnStateName);

        actions.enterText(postalCode,zip_code);

        WebElement btnCountryName=driver.findElement(TxtCountryName);
        Select selectCountry=new Select(btnCountryName);
        selectCountry.selectByVisibleText(country_name);

        actions.enterText(contactNo,contact_no);

        actions.clickOnElement(btnNext);
    }
}
