package org.alpha.tejashri.corejava.blocks.instanceblocks;

public class TestInstanceBlocks {
    // Instance Block
    {
        System.out.println("I am in Instance Block : 2");
    }

    {
        System.out.println("I am in Instance Block : 1");
    }

    public TestInstanceBlocks() {
        int a = 100;
        int b = 200;
        System.out.println("Addition: " + (a + b));
    }

    {
        System.out.println("I am in Instance Block : 3");
    }

    public TestInstanceBlocks(int a, int b) {
        System.out.println("Multiplication: " + a * b);
    }

    public static void main(String[] args) {
        TestInstanceBlocks obj1 = new TestInstanceBlocks(); // Addition
        System.out.println("----------------------");
        TestInstanceBlocks obj2 = new TestInstanceBlocks(10, 20); // Multiplication
    }
}

//Output
//I am in Instance Block : 2
//I am in Instance Block : 1
//I am in Instance Block : 3
//Addition: 300
//----------------------
//I am in Instance Block : 2
//I am in Instance Block : 1
//I am in Instance Block : 3
//Multiplication: 200