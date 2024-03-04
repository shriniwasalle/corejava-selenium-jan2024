package org.alpha.akash.blocks.staticblock;

public class StaticBlocks {

    static {
        System.out.println("I am Static Block :- 1");
    }
    static {
        System.out.println("I am Static Block :- 2");
    }

    {
        System.out.println("I am Instance Block ");
    }

    StaticBlocks(){
        System.out.println("I am in No- arg Constructor");
    }

    public static void main(String[] args) {
        //Static Block Are Whenever class run then its call
        // Instance Block are Whenever Object created then its call
    }
}
