package org.alpha.akash.oopconcepts.abstractconcepts.interfaceconcept;

public class AutomationClass {
    public static void main(String[] args) {
        WebDriver obj1 = new ChromeDriver();
        obj1.get();
        obj1.getTitle();

        WebDriver obj2 = new FirefoxDriver();
        obj2.get();
        obj2.getTitle();
    }
}
