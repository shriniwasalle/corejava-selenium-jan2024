package org.alpha.darshan.stringpractice;


public class TestStringPractice2 {

    public static void main(String[] args) {

        String name = "darshan";


        String s1 = "darshan";

        String s2 = "Darshan";

        String s4 = "      Automation          ";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(name.charAt(0));
        System.out.println(name.contains("d"));
        System.out.println(name.replace("d", "D"));
        System.out.println(name.replace("dar", "pri"));
        System.out.println(name.startsWith("dars"));
        System.out.println(s4.trim());
        System.out.println(name.substring(0, 4));
    }
}
