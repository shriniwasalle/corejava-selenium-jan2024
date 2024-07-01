package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class BaseTest {
    WebDriver driver;

    public WebDriver initBrowser(String url, String browser) throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();

        //1.To disable infoBar

        // options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        // options.setExperimentalOption("excludeSwitches",new String [] {"enable-automation"});

        String[] strArr = {"enable-automation"};
        options.setExperimentalOption("excludeSwitches", strArr);

        //Headless=execute script without opening the browser window
        //2.Headed=execute script with opening the browser window
        // options.addArguments("headless");

        //3.Incognito Mode
        options.addArguments("incognito");

        //4.to maximize window
        options.addArguments("--start-maximized");

        //5.to change the location of Downloaded file
        //Map<String, Object> prefs = new HashMap<String, Object>();
        //prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("prefs", prefs);
        //ChromeDriver driver = new ChromeDriver(options);

        if (browser.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
           /* URL link=new URL(url);
           driver.navigate().to(link);
*/
        //driver.navigate().to(url);
        driver.get(url);
        // driver.manage().window().maximize();
        return driver;
    }
}
