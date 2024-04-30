package org.alpha.tejashri.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAndHardAssertions {

    @Test
    public void verifyHardAssertions() {
        System.out.println("Inside verifyHardAssertions Method");
        //1. Hard Assertions
        //If assertion fails then stop the execution at that assertion, will not go to the next assertions

        Assert.assertEquals("Mahi123", "Mahi456", "Check Equality : ");
        Assert.assertEquals(100, 10);

        Assert.assertTrue(true);//Test case will pass if the actual value is true otherwise it will fail
        Assert.assertTrue(false);//Test case will pass if the actual value is false otherwise it will fail
    }

    @Test
    public void verifySoftAssertions() {
        System.out.println("Inside verifySoftAssertions Method");

        //1. Soft Assertions
        //Create the object of SoftAssert
        SoftAssert softAssert = new SoftAssert();

        //If even any assertion fails then also it will continue to go to the next assertions
        softAssert.assertEquals("Anshu", "Anshu111", "Check Condition");
        softAssert.assertEquals(20, 20);
        softAssert.assertTrue(true);
        softAssert.assertTrue(false);

        softAssert.assertAll();

    }
}
