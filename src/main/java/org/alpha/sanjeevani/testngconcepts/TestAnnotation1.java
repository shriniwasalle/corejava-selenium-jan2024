package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.*;

//suit
//Test
//class
//method
//@Test

public class TestAnnotation1 {
   @BeforeSuite
    public void beforeSuite(){
        System.out.println("Inside BeforeSuite method ");
    }
   @AfterSuite
    public void afterSuite(){
        System.out.println("Inside afterSuite method ");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside BeforeTest method ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Inside AfterTest method ");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Inside BeforeClass method ");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Inside AfterClass method ");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("*--------Inside BeforeMethod method --------------*");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("*======Inside AfterMethod method ==========*");
    }
   @Test
    public void test1(){
       System.out.println("Inside test1 method ");
   }
   @Test
    public void test2(){
        System.out.println("Inside test2 method ");
    }


}
