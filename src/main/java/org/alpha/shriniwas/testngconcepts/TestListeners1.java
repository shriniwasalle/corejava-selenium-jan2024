package org.alpha.shriniwas.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// @Listeners(TestListenerMethodsClass.class)
public class TestListeners1 {

    // onStart -> onTestStart -> Test1 -> onTestStart -> Test2 > onFinish

    @Test
    public void test1() {
        System.out.println("Inside test1 method");
        Assert.assertEquals("Test", "Testing");
    }

    // if test1 is pass, test2 will be executed.
    // if test1 is fail, test2 will be skipped/ignored.
    @Test(dependsOnMethods = "test1")
    public void test2() {
        System.out.println("Inside test2 method");
        // Assert.assertEquals("Test", "Testing");
    }

    @Test
    public void test3() {
        System.out.println("Inside test3 method");
    }
}
