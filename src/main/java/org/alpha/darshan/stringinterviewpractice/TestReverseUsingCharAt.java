package org.alpha.darshan.stringinterviewpractice;

public class TestReverseUsingCharAt {

    String name= "Darshan";
    public void reverseString(){
        for (int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }
    }

    public static void main(String[] args) {
        TestReverseUsingCharAt T1= new TestReverseUsingCharAt();
        T1.reverseString();
    }
}
