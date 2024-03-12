package org.alpha.tejashri.oopsconcepts.abstraction.interfaceconcept.driverexample;

public class TestRemoteWedDriver implements TestWebDriver {
    @Override
    public void get() {
        System.out.println("Inside get method");
    }

    @Override
    public void getTitle() {
        System.out.println("Inside getTitle method");
    }

    @Override
    public void close() {
        System.out.println("Inside close method");
    }

    @Override
    public void quit() {
        System.out.println("Inside quit method");
    }

    @Override
    public void getCurrentURL() {
        System.out.println("Inside getCurrentURL method");
    }

    @Override
    public void switchTo() {
        System.out.println("Inside switchTo method");
    }

    @Override
    public void navigate() {
        System.out.println("Inside navigate method");
    }

    @Override
    public void manage() {
        System.out.println("Inside manage method");
    }

    @Override
    public void getWindowHandle() {
        System.out.println("Inside getWindowHandle method");
    }

    @Override
    public void findElement() {
        System.out.println("Inside findElement method");
    }
}
