package org.alpha.sanjeevani.assignment.assignment10.test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestAssign10 {
   WebDriver driver;
    public WebDriver initBrowser(String url, String browser){

        ChromeOptions options=new ChromeOptions();
        String[] strArr={"enable-automation"};
        options.setExperimentalOption("excludeSwitches",strArr);

        if(browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver(options);
        }
        if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
           driver.get(url);
           driver.manage().window().maximize();
           return driver;
    }
}
