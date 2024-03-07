package org.alpha.shriniwas.blocks.staticblock;

public class TestStaticBlocks {

    static {
        System.out.println("I am in Static Block-1");
    }

    static {
        System.out.println("I am in Static Block-2");
    }

    {
        System.out.println("I am in Instance Block");
    }

    TestStaticBlocks() {
        System.out.println("I am in No-arg Constructor");
    }

    public static void main(String[] args) {

    }
}
