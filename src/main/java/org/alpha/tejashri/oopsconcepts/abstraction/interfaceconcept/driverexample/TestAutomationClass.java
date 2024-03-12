package org.alpha.tejashri.oopsconcepts.abstraction.interfaceconcept.driverexample;

public class TestAutomationClass {
    public static void main(String[] args) {
        TestWebDriver driver1 = new TestChromeDriver();
        driver1.get(); //called from TestRemoteWedDriver
        driver1.getTitle(); //called from TestRemoteWedDriver

        TestWebDriver driver2 = new TestFirefoxDriver();
        driver2.get(); //called from TestRemoteWedDriver
        driver2.getTitle(); //called from TestRemoteWedDriver
    }
}
