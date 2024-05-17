package org.alpha.tejashri.TestNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testListenerMethodsClass implements ITestListener {

    //This will run before each & every Method present in that @test
    public void onTestStart(ITestResult result) {
        System.out.println("Inside onTestStart method");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Inside onTestSuccess method");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Inside onTestFailure method");
        //Capture Screenshot codes
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Inside onTestSkipped method");
    }

    //This will run once at the start/before the @test
    public void onStart(ITestContext context) {
        System.out.println("Inside onStart method");
        //Reports Configurations
        //Database Connections/Configurations
    }

    //This will run once at the end/after the @test
    public void onFinish(ITestContext context) {
        System.out.println("Inside onFinish method");
        //Reports Close
        //Database Connections close
    }

}
