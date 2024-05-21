package org.alpha.darshan.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertions {

    @Test
    public void hardAssert(){

        Assert.assertEquals("darshan123","darshan456");
        Assert.assertEquals("1023","1023");
    }

    @Test
    public void softAssert(){

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("1234","4567");
        softAssert.assertEquals("12345","12345");
        softAssert.assertAll();
    }
}
