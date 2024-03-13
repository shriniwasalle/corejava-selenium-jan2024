package org.alpha.akash.oopconcepts.abstractconcepts.interfaceconcept;

public class RemoteWebDriver implements WebDriver{

    @Override
    public void get() {
        System.out.println("Inside get method");
    }

    @Override
    public void getTitle() {
        System.out.println("Inside getTitle method");
    }
}
