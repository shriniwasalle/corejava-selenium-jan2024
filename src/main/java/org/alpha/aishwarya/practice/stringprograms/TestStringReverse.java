package org.alpha.aishwarya.practice.stringprograms;

public class TestStringReverse {
    public static void main(String[] args) {

        String str = "Aishwarya";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


        //Using StringBuffer
         StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.reverse());

    }
}
/**
 * --Output--
 * ayrawhsiA
 */

