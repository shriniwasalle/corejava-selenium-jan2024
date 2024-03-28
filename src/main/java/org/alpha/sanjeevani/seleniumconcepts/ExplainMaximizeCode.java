package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainMaximizeCode {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//creating object of ChromeDriver class

        //open website
        driver.get("https://www.amazon.in/");
        String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);

        String pageSource=driver.getPageSource();//it will get all html code regarding page
        System.out.println(pageSource);


        // get() it is present in web-driver interface,
        //And it is implements by RemoteWebDriver(class),and actually implementation of get() its present here.

        /*RemoteWebDriver implements WebDriver
        ChromeDriver extends RemoteWebDriver
        EdgeDriver extends RemoteWebDriver
        FireFoxDriver extends RemoteWebDriver
         RemoteWebDriver implements WebDriver

*/

        //driver.manage().window().maximize();

        //maximize the window
        WebDriver.Options options = driver.manage();//Options is an interface present in WebDriver interface
        WebDriver.Window win = options.window();// window() present in Window interface it is present in WebDriver interface
        win.maximize();
       // driver.manage().window().fullscreen();// It will open the browser in full-screen mode(minimize,maximize and close etc. controls won't be visible)
        driver.close();
    }
}
