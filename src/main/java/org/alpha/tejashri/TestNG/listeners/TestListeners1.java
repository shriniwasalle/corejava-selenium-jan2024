package org.alpha.tejashri.TestNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testListenerMethodsClass.class)
public class TestListeners1 {
/*
onStart--> onTestStart-->test1-->onTestSuccess//If Test case pass
           onTestStart-->test2-->onTestFailure//If Test Fails
           onTestStart-->test3-->onTestSkipped//bcz test3 depends on test2(failed) so this Test ignored
-->onFinish
 */

    @Test
    public void  test1(){
        System.out.println("Inside test1 method");
    }

    @Test
    public void  test2(){
        System.out.println("Inside test2 method");
        Assert.assertEquals("Test","Testing");
    }

    @Test(dependsOnMethods = "test2")
    //test3 depends on test2
    //if test2 pass, test3 executed & gives onTestSuccess
    //if test2 fails, test3 Test ignored & gives onTestSkipped
    public void  test3(){
        System.out.println("Inside test3 method");
    }

}
