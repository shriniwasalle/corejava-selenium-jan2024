package org.alpha.tejashri.corejava.stringconcept;

public class TestStringReversInSentence {
    public static void main(String[] args) {
        String str = new String("My name is Tejashri Boppa");
        String[] strArr = str.split(" ");

        for (int i = strArr.length - 1; i >= 0; i--) {

            System.out.print(strArr[i]);// BoppaTejashriisnameMy

            // System.out.println(strArr[i]);
            //with println output is-
            // Boppa
            //Tejashri
            //is
            //name
            //My
        }

    }
}
