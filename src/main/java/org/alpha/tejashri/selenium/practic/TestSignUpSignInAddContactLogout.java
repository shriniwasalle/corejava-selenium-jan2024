package org.alpha.tejashri.selenium.practic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSignUpSignInAddContactLogout {
    @Test
    public void verifySignup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.manage().window().maximize();

        //To Sign Up to Account
        WebElement btnSignup = driver.findElement(By.id("signup"));
        btnSignup.click();

        WebElement txtFirstName = driver.findElement(By.id("firstName"));
        txtFirstName.sendKeys("Abc");

        WebElement txtLastName = driver.findElement(By.id("lastName"));
        txtLastName.sendKeys("Xyz");

        WebElement textEmail = driver.findElement(By.id("email"));
        textEmail.sendKeys("abcxyz@example.com");

        WebElement textPassword = driver.findElement(By.id("password"));
        textPassword.sendKeys("abc123xyz");

        WebElement btnSubmit = driver.findElement(By.id("submit"));
        btnSubmit.click();

        WebElement btnCancel = driver.findElement(By.id("cancel"));
        btnCancel.click();

        //To Sign in to Account
        WebElement enterEmail = driver.findElement(By.id("email"));
        enterEmail.sendKeys("abcxyz@example.com");//Enter email

        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("abc123xyz");//Enter password

        WebElement btnSubmit1 = driver.findElement(By.id("submit"));
        btnSubmit1.click();

        Thread.sleep(2000);

        WebElement btnAdd = driver.findElement(By.id("add-contact"));
        btnAdd.click();

        Thread.sleep(2000);

        // Adding Contact Details
        WebElement enterFirstName = driver.findElement(By.id("firstName"));
        enterFirstName.sendKeys("Abc");

        WebElement enterLastName = driver.findElement(By.id("lastName"));
        enterLastName.sendKeys("Xyz");

        WebElement enterDate = driver.findElement(By.id("birthdate"));
        enterDate.sendKeys("1900-12-30");//Enter Date of birth

        WebElement enterEmail1 = driver.findElement(By.id("email"));
        enterEmail1.sendKeys("abcxyz@example.com");

        WebElement enterAdds1 = driver.findElement(By.id("street1"));
        enterAdds1.sendKeys("Flat No. 00");//Enter Address line 1

        WebElement enterAdds2 = driver.findElement(By.id("street1"));
        enterAdds2.sendKeys("Any Road");//Enter Address line 2

        WebElement enterCity = driver.findElement(By.id("city"));
        enterCity.sendKeys("MyCity");//Enter city

        WebElement enterState = driver.findElement(By.id("stateProvince"));
        enterState.sendKeys("AB");//Enter State

        WebElement enterCode = driver.findElement(By.id("postalCode"));
        enterCode.sendKeys("123456");//Enter Code

        WebElement enterCou = driver.findElement(By.id("country"));
        enterCou.sendKeys("MyCountry");//Enter country

        WebElement btnSub = driver.findElement(By.id("submit"));
        btnSub.click();

        Thread.sleep(2000);

        WebElement btnLog = driver.findElement(By.id("logout"));
        btnLog.click();// Logout

    }
}
