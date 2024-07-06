package org.alpha.sanjeevani.assignment.assignment13.test;

import org.alpha.sanjeevani.assignment.assignment13.pages.InterfacesPage;
import org.alpha.sanjeevani.assignment.assignment13.pages.MethodsPage;
import org.alpha.sanjeevani.assignment.assignment13.pages.SeleniumPackagePage;
import org.alpha.sanjeevani.assignment.assignment13.pages.WebElementPage;
import org.alpha.sanjeevani.assignment.assignment13.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestListOfMethods extends BaseTestAssign13{
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
       driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verifyListOfMethods(){
        SeleniumPackagePage seleniumPackagePage=new SeleniumPackagePage(driver);
        seleniumPackagePage.verifySeleniumPackagePage();

        InterfacesPage interfacesPage=new InterfacesPage(driver);
        interfacesPage.verifyInterfacesPage();

        WebElementPage webElementPage=new WebElementPage(driver);
        webElementPage.verifyWebElementPage();

        MethodsPage methodsPage=new MethodsPage(driver);
        methodsPage.verifyMethodsPage();

        String actualTitle=driver.getTitle();
        //System.out.println(actualTitle);
        //String expectedTitle="WebElement";
        Assert.assertEquals(actualTitle,"WebElement");
    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
    }
}
