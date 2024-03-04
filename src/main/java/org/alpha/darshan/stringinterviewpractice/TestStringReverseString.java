package org.alpha.darshan.stringinterviewpractice;

public class TestStringReverseString {

    //program to reverse the given string using toCharArray method
    String name = "darshan";

    public void reverseString() {
        char[] chr = name.toCharArray();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(chr[i]);
        }
        for (char ch : chr) {
            System.out.println(ch);
        }
    }


    public static void main(String[] args) {
        TestStringReverseString t1 = new TestStringReverseString();
        t1.reverseString();
    }
}
