package org.alpha.darshan.blocks;

public class StaticBlockPractice {

    static{
        System.out.println("i am in static block");
    }
    /*static block are run at the time of class loading
    static block is executed before the instance block and constructor
    static block is executed only once for all the object,bcz static are linked with
    the class not with the object
    static block does not need to create an object
    a static block executes code before the object initialization*/

    static{
        System.out.println("i am in static block 2");
    }

    //class can have multiple static block they can execute according to the sequence

    public static void main(String[] args) {

        //without creating an object we directly execute static block
        System.out.println("i am in main method");
    }

}

//o/p i am in static block