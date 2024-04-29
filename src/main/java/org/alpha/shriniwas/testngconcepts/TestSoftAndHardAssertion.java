package org.alpha.shriniwas.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAndHardAssertion {

    @Test
    public void hardAssert() {
        Assert.assertEquals("Shri123", "Shri456");
        Assert.assertEquals(10, 100);

        Assert.assertTrue(true); // Test Case will pass if the value is actual value is true otherwise it will fail
        Assert.assertFalse(false); // Test Case will pass if the value is actual value is false otherwise it will fail
    }

    @Test
    public void softAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("Shri123", "Shri456", "Condition Failed");
        softAssert.assertEquals(10, 10);
        softAssert.assertTrue(false);

        softAssert.assertAll();
    }
}
