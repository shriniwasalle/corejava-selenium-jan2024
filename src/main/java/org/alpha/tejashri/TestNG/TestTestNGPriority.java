package org.alpha.tejashri.TestNG;

import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestNGPriority {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Inside Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Inside After Method");
    }

    //-3, -2, -1, 0, 1, 2, 3
    //Default Sequence of Test is in Ascending, Alphabetically order only
    //By Default Priority value is 0
    //Priority can be -ve integer value, but not is decimal bcz it accepts int value only

    @Test(priority = 1)
    public void test1() {
        System.out.println("Inside Test1 Method :: with priority 1");//4th
    }

    @Test
    public void test2() {
        System.out.println("Inside Test2 Method :: Default priority/ 0 Priority");//3rd
    }

    @Test(priority = -1)
    public void test3() {
        System.out.println("Inside Test3 Method :: with priority -1");//2nd
    }

    @Test(priority = 2)
    public void test4() {
        System.out.println("Inside Test4 Method :: with priority 2");//5th
    }

    @Test(priority = -2)
    public void test5() {
        System.out.println("Inside Test5 Method :: with priority -2");//1st
    }
}
