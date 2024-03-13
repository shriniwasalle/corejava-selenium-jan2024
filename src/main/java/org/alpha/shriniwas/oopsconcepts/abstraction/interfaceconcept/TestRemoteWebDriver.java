package org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept;

public class TestRemoteWebDriver implements TestWebDriver {

    @Override
    public void get() {
        System.out.println("Inside get method");
    }

    @Override
    public void getTitle() {
        System.out.println("Inside getTitle method");
    }
}
