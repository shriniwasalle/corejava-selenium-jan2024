package org.alpha.tejashri.blocks.staticblocks;

public class TestStaticBlocks {
// Static Block - these blocks executes without creating any objects
// bcoz these links with class not with objects

    static {
        System.out.println("I am in Static Block 1");
    }

    static {
        System.out.println("I am in Static Block 2");
    }

    // Instance Block
    {
        System.out.println("I am in Instance Block ");
    }

    // Constructor
    TestStaticBlocks() { //excess specifier is default so default constructor

        System.out.println("I am in No-arg Constructor");
    }

    public static void main(String[] args) {
//        TestStaticBlocks obj1 = new TestStaticBlocks();
//        System.out.println("---------------------");
//
//        TestStaticBlocks obj2= new TestStaticBlocks();
//        System.out.println("---------------------");
//
//        TestStaticBlocks obj3 = new TestStaticBlocks();

    }
}
