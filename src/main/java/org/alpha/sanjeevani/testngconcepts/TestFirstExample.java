package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstExample {
    //BeforeMethod-->Test1-->AfterMethod
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am in before Method ");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am in after Method ");
    }
    @Test
    public void test1(){
        System.out.println("I am in test1 method");
    }
    @Test
    public void test2(){
        System.out.println("I am in  test2 method");
    }
    @Test
    public void test3(){
        System.out.println("I am in test3 method");
    }
    @Test(priority=1)
    public void test4(){
        System.out.println("I am in test4 method");
    }
    @Test(priority=-1)
    public void test5(){
        System.out.println("I am in test5 method");
    }
}
