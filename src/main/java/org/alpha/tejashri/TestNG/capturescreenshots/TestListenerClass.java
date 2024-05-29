package org.alpha.tejashri.TestNG.capturescreenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListenerClass extends BaseClass implements ITestListener {

    //2. Capture Screenshot on failure by using Listener class
    @Override
    public void onTestFailure(ITestResult result) {//ITestResult result->this is dependency injection, it listens the test result
        try {
            //captureScreenshot("File1");
            captureScreenshot(result.getMethod().getMethodName());//Made Dynamic, it will take file name as a method name
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}