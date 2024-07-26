package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.*;

public class TestAnnotation2 {
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
    public void test3(){
        System.out.println("Inside test3 method ");
    }
    @Test
    public void test4(){
        System.out.println("Inside test4 method ");}

}
