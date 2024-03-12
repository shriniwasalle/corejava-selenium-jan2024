package org.alpha.sanjeevani.oopsconcepts.abstraction.interfaceconcept;

public class TestAutomationClass {
    public static void main(String[] args) {
        TestWebDriver obj=new TestChromeDriver();
        obj.get();
        obj.getTitle();
        TestWebDriver obj1=new TestFireFoxDriver();
        obj1.get();
        obj1.getTitle();

    }
}
