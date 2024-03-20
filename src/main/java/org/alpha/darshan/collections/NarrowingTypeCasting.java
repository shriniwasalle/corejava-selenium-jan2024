package org.alpha.darshan.collections;

public class NarrowingTypeCasting {

    public static void main(String[] args) {

        double d=10.0;
        //converting double into int

        int i=(int)d;

        //converting int into byte

        byte b= (byte)i;


        System.out.println("before converting double value="+d);
        System.out.println("after converting int value="+i);
        System.out.println("after converting byte value="+b);
    }
}
