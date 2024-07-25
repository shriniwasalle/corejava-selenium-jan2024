package org.alpha.sanjeevani.testngconcepts;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAndHardAssertions {
    //boolean isEnabled=true;
    //Assert.assertTrue(isEnabled);
    // Assert.assertTrue(true); test case will pass when actual value is true otherwise it will fail
    //Assert.assertFalse(false);test case will pass when actual value is false otherwise it will fail
@Test
    public void hardAssertion(){
        Assert.assertEquals("sanju","raje");
        Assert.assertEquals("123","321");
    }
    @Test
    public void softAssertion(){
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals("vedu","raje");
        softAssert.assertEquals("123","321");
        softAssert.assertAll();
        }
}
