package org.alpha.tejashri.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstExample {
    //Execution Steps
    //BeforeMethod-->Test1-->AfterMethod
    //BeforeMethod-->Test2-->AfterMethod

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Inside Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Inside After Method");
    }

    //@Test
    // if commenting @Test, it will not execute this test method
    public void test() {
        System.out.println("Inside Test1 Method");
    }

    @Test
    public void test1() {
        System.out.println("Inside Test1 Method");
    }

    @Test
    public void test2() {
        System.out.println("Inside Test2 Method");
    }

}
