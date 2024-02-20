package org.alpha.shriniwas.blocks.instance;

public class TestInstanceBlock {

    String name;

    {
        name = "Shriniwas";
        System.out.println("I am in Instance Block - 1");
    }

    {
        System.out.println("I am in Instance Block - 2");
    }

    public TestInstanceBlock() {
        int a = 100;
        int b = 200;
        System.out.println(a+b);
    }

    {
        System.out.println("I am in Instance Block - 3");
    }

    public TestInstanceBlock(int a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        TestInstanceBlock obj1 = new TestInstanceBlock(); // Addition

        System.out.println("-------------------");

        TestInstanceBlock obj2 = new TestInstanceBlock(10, 20); // Multiplication
    }
}
