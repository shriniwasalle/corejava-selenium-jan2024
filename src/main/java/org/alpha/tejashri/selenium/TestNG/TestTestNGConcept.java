package org.alpha.tejashri.selenium.TestNG;

import org.testng.annotations.*;

public class TestTestNGConcept {
    //Execution Steps
    //@BeforeMethod--> @Test1 --> @AfterMethod
    //@BeforeMethod--> @Test2 --> @AfterMethod

    @BeforeMethod
    public void init() {
        System.out.println("Open Browser");
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Close Browser");
        System.out.println("------------------------");
    }

    @Test
    public void verifyLogin1() {
        System.out.println("Inside Login 1 method");
    }

    @Test
    public void verifyLogin2() {
        System.out.println("Inside Login 2 method");
    }
}
