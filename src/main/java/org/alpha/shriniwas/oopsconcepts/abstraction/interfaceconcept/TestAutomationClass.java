package org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept;

public class TestAutomationClass {

    public static void main(String[] args) {
        TestWebDriver driver1 = new TestChromeDriver();
        driver1.get();
        driver1.getTitle();

        TestWebDriver driver2 = new TestFirefoxDriver();
        driver2.get();
        driver2.getTitle();
    }
}
