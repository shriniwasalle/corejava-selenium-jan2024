package org.alpha.akash.practice;

public class StringReverseSentence {


    public static void main(String[] args) {

        String str = new String("My Name is Akash Vaitala");
        String[] strarr = str.split(" ");
        for (int i = strarr.length - 1; i >= 0; i--) {
            System.out.println(strarr[i]);

        }
    }
}
