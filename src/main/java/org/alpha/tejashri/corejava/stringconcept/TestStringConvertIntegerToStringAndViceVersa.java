package org.alpha.tejashri.corejava.stringconcept;

public class TestStringConvertIntegerToStringAndViceVersa {

    public static void main(String[] args) {

        // Convert int to String
        int i = 100;
        String str1 = Integer.toString(i);
        System.out.println(str1);

        // Convert int to String using valueOf
        int j = 1000;
        String str2 = String.valueOf(j);
        System.out.println(str2);

        // Convert String to int
        String str3 = "10000";
        int k = Integer.parseInt(str3);
        System.out.println(k);
    }
}
