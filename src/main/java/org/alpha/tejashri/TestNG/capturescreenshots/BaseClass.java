package org.alpha.tejashri.TestNG.capturescreenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseClass {

    static public WebDriver driver;
    @BeforeMethod
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
//        1. Capture Screenshot on failure by using Dependency Injection in after method

/*         Test status from ITestResult Interface
        int CREATED = -1;
        int SUCCESS = 1;
        int FAILURE = 2;
        int SKIP = 3;
        int SUCCESS_PERCENTAGE_FAILURE = 4;
        int STARTED = 16;

        here for failure = 2
          result.getStatus() = 2
          ITestResult.FAILURE  = 2
          if condition is true
 */

        if(result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(result.getMethod().getMethodName());
        }
        driver.close();
    }

    public void captureScreenshot(String fileName) throws IOException {
        try {
            Date currentDateTime = new Date();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss"); //2024-04-16-21-45-39

            String dateTime = simpleDateFormat.format(currentDateTime);

            TakesScreenshot ts = (TakesScreenshot) driver;

            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            File destFile = new File( System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\tejashri\\TestNG\\capturescreenshots\\screenshots\\"+fileName +"_"+ dateTime+".jpg");

            FileUtils.copyFile(srcFile, destFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}