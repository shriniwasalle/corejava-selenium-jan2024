package org.alpha.sanjeevani.Assignment7.test;

import org.alpha.sanjeevani.Assignment7.pages.FetchingProductDetails;
import org.alpha.sanjeevani.Assignment7.pages.ProductTitlePage;
import org.alpha.sanjeevani.Assignment7.pages.SelectIphone;
import org.alpha.sanjeevani.Assignment7.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestClass extends BaseTestAss7 {
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));}
    @Test
    public void iPhoneProductDetails() {
        ProductTitlePage productTitlePage = new ProductTitlePage(driver);
        productTitlePage.TitlePageOfProduct();

        SelectIphone selectIphone=new SelectIphone(driver);
        selectIphone.windowHandle();
        selectIphone.clickSelectedPhone();

        FetchingProductDetails fetchingProductDetails=new FetchingProductDetails(driver);
        fetchingProductDetails.verifyIphoneDetails();

        String actualTitle=driver.getTitle();
        System.out.println("Actual Title is :"+actualTitle);
        Assert.assertEquals(actualTitle, "Amazon.in : iphone");

    }
}
// driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"), ReadPropertiesFile.getPropertyValues("browser"));