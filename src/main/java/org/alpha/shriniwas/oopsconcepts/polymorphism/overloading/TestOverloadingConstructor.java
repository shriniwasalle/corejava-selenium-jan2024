package org.alpha.shriniwas.oopsconcepts.polymorphism.overloading;

public class TestOverloadingConstructor {

    public TestOverloadingConstructor(int age) {
        System.out.println("I am in int param constructor: " +age);
    }

    public TestOverloadingConstructor(String name) {
        System.out.println("I am in String param constructor: " +name);
    }

    public static void main(int [] ar) {
        System.out.println("I am in int array main method" +ar);
        // main(new String[] {"Shri1", "Shri2"});
    }

    public static void main(String[] args) {
        new TestOverloadingConstructor(100);
        new TestOverloadingConstructor("Shriniwas");

        main(new int[] {10, 20, 30});
    }
}
