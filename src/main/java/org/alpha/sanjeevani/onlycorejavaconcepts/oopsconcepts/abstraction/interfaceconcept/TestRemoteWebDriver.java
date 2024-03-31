package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.interfaceconcept;

public class TestRemoteWebDriver implements TestWebDriver{
    @Override
    public void get() {
        System.out.println("I am in get method");

    }

    @Override
    public void getTitle() {
        System.out.println("I am in getTitle method");

    }
}
