package org.alpha.sanjeevani.testngconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider1 {
    @Test(dataProvider = "getIteratorObjectArrayData")
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (type.equals("valid")) {
            String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
            String expectedTitle = "Products";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else if (type.equals("locked_out")) {
            String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedError = "Epic sadface: Sorry, this user has been locked out.";
            Assert.assertEquals(error, expectedError);
        } else if (type.equals("invalid")) {
            String errorInvalid = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedInvalidError = "Epic sadface: Username and password do not match any user in this service";
            Assert.assertEquals(errorInvalid, expectedInvalidError);
        }
        driver.close();
    }
    /*@DataProvider(name = "getObject2DArrayData")
    public Object [][] getObject2DArrayData(){

        Object [][] objArr= {
                {"standard_user", "secret_sauce", "valid"},
                {"locked_out_user", "secret_sauce", "locked_out"},
                {"standard_user123", "secret_sauce123", "invalid"}
        };
                   return objArr;
    }
*/


    @DataProvider(name = "getIteratorObjectArrayData")
    public Iterator<Object[]> getIteratorObjectArrayData() {

        Object[] objArr1 = {"standard_user", "secret_sauce", "valid"};
        Object[] objArr2 = {"locked_out_user", "secret_sauce", "locked_out"};
        Object[] objArr3 = {"standard_user123", "secret_sauce123", "invalid"};

        List<Object[]> list = new ArrayList<>();
        list.add(objArr1);
        list.add(objArr2);
        list.add(objArr3);

       Iterator<Object[]>itr = list.iterator();
       return itr;
    }

}
