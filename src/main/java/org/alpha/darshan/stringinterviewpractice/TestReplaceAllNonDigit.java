package org.alpha.darshan.stringinterviewpractice;

public class TestReplaceAllNonDigit {

    public  void replaceNonDigit(){
        String s1="helloThisIsA1234Sample";
        s1=s1.replaceAll("\\D","");
        System.out.println("Only Number:"+s1);
    }

    public static void main(String[] args) {
        TestReplaceAllNonDigit nond= new TestReplaceAllNonDigit();
        nond.replaceNonDigit();
    }
}
