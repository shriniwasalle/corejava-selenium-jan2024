package org.alpha.sanjeevani.assignment.assignment16.test;
import org.alpha.sanjeevani.assignment.assignment16.pages.ProductsPage;
import org.alpha.sanjeevani.assignment.assignment16.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
public class TestFlipKartProduct extends BaseTestAssign16 {
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verifyFlipKartProduct() throws IOException, InterruptedException {
        ProductsPage productPage=new ProductsPage(driver);
        productPage.getProductsPageSearch(ReadPropertiesFile.getPropertyValues("enter_product"));
    }
}
