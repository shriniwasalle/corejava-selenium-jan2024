package org.alpha.tejashri.TestNG.annotations;

import org.testng.annotations.*;

public class TestAnnotationsSequence1 {
//Suite-> for DataBase Connections use this
// Test->
// Class->
// Method->
// @Test
//BeforeSuite->BeforeTest->BeforeClass->BeforeMethod->Test1->AfterMethod->BeforeMethod->Test2->AfterMethod->AfterClass->AfterTest->AfterSuite

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Inside TestAnnotationsSequence1 :: BeforeSuite Method");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println("Inside TestAnnotationsSequence1 :: AfterSuite Method");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("  Inside TestAnnotationsSequence1 :: BeforeTest Method");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("  Inside TestAnnotationsSequence1 :: AfterTest Method");
    }


    @BeforeClass
    public  void beforeClass(){
        System.out.println("   Inside TestAnnotationsSequence1 :: BeforeClass Method");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("   Inside TestAnnotationsSequence1 :: AfterClass Method");
    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("     Inside TestAnnotationsSequence1 :: BeforeMethod Method");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("     Inside TestAnnotationsSequence1 :: AfterMethod Method");
    }

    @Test
    public void test1(){
        System.out.println("         Inside TestAnnotationsSequence1 :: Test1 Method");
    }

    @Test
    public void test2(){
        System.out.println("         Inside TestAnnotationsSequence1 :: Test2 Method");
    }
}
