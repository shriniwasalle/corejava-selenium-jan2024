package org.alpha.sanjeevani.assignment.assignment16.pages;
import org.alpha.sanjeevani.assignment.assignment16.pageAction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class ProductsPage {
private final WebDriver driver;
private final By searchBox = By.name("q");
private final By submitSearch = By.xpath("//button[@type='submit']");
private final By priceDD = By.xpath("//div[@class='tKgS7w']//select[1]");
private final By mobilePricePaths = By.xpath("//a/div[2]/div[2]/div[1]/div[1]/div[1]");
private final By mobileNamePaths = By.xpath("//a/div[2]/div[1]/div[1]");
PageActions actions;
public ProductsPage(WebDriver driver) {
    this.driver = driver;
    actions = new PageActions(driver);
}
public void getProductsPageSearch(String enterProduct) throws InterruptedException {
    //Implicit Wait added
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

    //Product Page Related Actions
    WebElement element= driver.findElement(searchBox);
    actions.enterText(element, enterProduct);

    actions.clickOnElement(submitSearch);

    WebElement priceDropDown = driver.findElement(priceDD);
    Select select = new Select(priceDropDown);
    select.selectByIndex(0);

    List<WebElement> mobileNamesList = driver.findElements(mobileNamePaths);
    List<String> mobileNames = mobileNamesList.stream().map(WebElement::getText).toList();

    List<WebElement> mobilePricesList = driver.findElements(mobilePricePaths);
    List<String> mobilePrices = mobilePricesList.stream().map(WebElement::getText).toList();

    for (int i = 0; i <= mobilePrices.size() - 1; i++) {
        System.out.println(mobileNames.get(i));
        System.out.println(mobilePrices.get(i));
    }
}
}

