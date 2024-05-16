package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.*;

public class TestAnnotations1 {

    // Suite
    // Test
    // Class
    // Method
    // @Test

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Inside BeforeSuite method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Inside AfterSuite method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(" Inside BeforeTest method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(" Inside AfterTest method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("  Inside BeforeClass method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("  Inside AfterClass method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("      Inside BeforeMethod method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("      Inside AfterMethod method");
    }

    @Test
    public void test1() {
        System.out.println("            Inside Test1 method");
    }

    @Test
    public void test2() {
        System.out.println("            Inside Test2 method");
    }
}
