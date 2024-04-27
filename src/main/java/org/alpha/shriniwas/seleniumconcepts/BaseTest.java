package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    public WebDriver initBrowser(String url, String browser) {

        ChromeOptions options = new ChromeOptions();

        // 1. To disable the Info Bar
        // options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        // options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        String [] strArr = {"enable-automation"};
        options.setExperimentalOption("excludeSwitches", strArr);
        // options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

        // Headless : Execute Script without opening the browser window
        // Headed : Execute Script with opening the browser window

        // 2. Headless Mode
        // options.addArguments("headless");

        // 3. Incognito Code
        options.addArguments("incognito");

        // 4. Maximize Window
        // options.addArguments("--start-maximized");

        // 5. To change the location of downloaded file

//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);
//        ChromeDriver driver = new ChromeDriver(options);



        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        // URL link = new URL(url);

        // driver.navigate().to(link);
        // driver.navigate().to(url);
        driver.get(url);
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
