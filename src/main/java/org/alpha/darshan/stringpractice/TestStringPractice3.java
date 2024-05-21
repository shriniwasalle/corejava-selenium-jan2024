package org.alpha.darshan.stringpractice;

public class TestStringPractice3 {


    public static void main(String[] args) {

        String name = "darshan";

        System.out.println(name.indexOf("r"));
        System.out.println(name.replace("r", "a"));
        System.out.println(name.replace("dar", "pri"));
        System.out.println(name.substring(0, 4));

        //String with single spaces
        String name1 = "I am in String Class";
        String[] strarr = name1.split(" ");
        System.out.println(strarr);
        for (String str1 : strarr) {
            System.out.println(str1);
        }
        //String with multiple spaces
        String str1 = "I am in              Automation    testing";
        String[] strsplit = str1.split("\\s+");
        for (String strsplit1 : strsplit) {
            System.out.println(strsplit1);
            //if we want to convert multiple spaces into single space then
            // we use \\s+

        }
        //iterating
        char[] chrr = name.toCharArray();

        for (int i = 0; i <= chrr.length - 1; i++) {
            System.out.println(chrr[i]);
        }

    }
}