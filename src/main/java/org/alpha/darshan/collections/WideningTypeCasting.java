package org.alpha.darshan.collections;

public class WideningTypeCasting {

    //converting from lower data type into higher data type
    //implicit conversion or casting down

    public static void main(String[] args) {

        int x=10;

        //converting int into long
        long l=x;
        //automatically convert the long type into float
        float f= l;

        System.out.println("before conversion int value="+x);
        System.out.println("after conversion long value="+l);
        System.out.println("after conversion float value="+f);
    }
}
