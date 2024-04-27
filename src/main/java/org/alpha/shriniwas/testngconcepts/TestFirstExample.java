package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstExample {

    // beforeMethodTest -> test1 -> afterMethodTest
    // beforeMethodTest -> test2 -> afterMethodTest

    @BeforeMethod
    public void beforeMethodTest() throws InterruptedException {
        System.out.println("Inside Before method");
    }

    @AfterMethod
    public void afterMethodTest() {
        System.out.println("Inside After method");
    }

    // -2, -1 , 0 , 1, 2

    @Test(priority = -1)
    public void test1() {
        System.out.println("I am in Test1 method");
    }

    @Test(priority = -2)
    public void test2() {
        System.out.println("I am in Test2 method");
    }

    @Test
    public void test3() {
        System.out.println("I am in Test3 method");
    }

    @Test(priority = 1)
    public void test4() {
        System.out.println("I am in Test4 method");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("I am in Test5 method");
    }
}
