package org.alpha.darshan.stringinterviewpractice;

public class TestReverseStringSentance {

    public void sentanceReverseUsingStringLiteral() {
        String str = "my name is Darshan";//using string litereal

        String[] st = str.split(" ");

        for (int i = st.length - 1; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }

    public void sentenceReverseUsingStringObject() {
        System.out.println("======usint string object=======");
        String str1 = new String("I am in string object");
        String[] st1 = str1.split(" ");
        for (int i = st1.length - 1; i >= 0; i--) {
            System.out.println(st1[i]);
        }
    }

    public static void main(String[] args) {
        TestReverseStringSentance t1 = new TestReverseStringSentance();
        t1.sentanceReverseUsingStringLiteral();
        t1.sentenceReverseUsingStringObject();
    }
}
