package org.alpha.sanjeevani.testngconcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListenerMethodsClass implements ITestListener {

   public void onTestStart(ITestResult result) {
        System.out.println("inside onTestStart Method");
    }

      public void onTestSuccess(ITestResult result) {
          System.out.println("inside onTestSuccess Method");
      }
    public void onTestFailure(ITestResult result) {
        System.out.println("inside onTestFailure Method");
    }

     public void onTestSkipped(ITestResult result) {
         System.out.println("inside onTestSkipped Method");
     }
    public void onStart(ITestContext context) {
        System.out.println("inside onStart Method");
    }
    public void onFinish(ITestContext context) {
        System.out.println("inside onFinish Method");

    }
}

