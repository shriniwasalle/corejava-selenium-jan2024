package org.alpha.shriniwas.testngconcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerMethodsClass implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Inside onTestStart method");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Inside onTestSuccess method");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Inside onTestFailure method");
        // Capture Screenshot
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Inside onTestSkipped method");
    }

    public void onStart(ITestContext context) {
        System.out.println("Inside onStart method");
        // Reports Config
        // Database Connection
    }

    public void onFinish(ITestContext context) {
        System.out.println("Inside onFinish method");
        // Reports Close
        // Database connection close
    }

}
