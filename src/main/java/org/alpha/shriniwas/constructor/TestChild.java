package org.alpha.shriniwas.constructor;

public class TestChild extends TestParent {

    public TestChild() {
        super("Shriniwas");
        System.out.println("Inside TestChild");
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();
    }
}
