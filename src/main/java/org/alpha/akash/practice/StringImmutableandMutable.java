package org.alpha.akash.practice;

public class StringImmutableandMutable {
    public static void main(String[] args) {

        // String SCP Immutable
        String name ="Akash";
        name.concat("Tester");
        System.out.println(name);

        // String object Immutable
        String name1 = new String("Akki");
        name1.concat("Tester");
        System.out.println(name1);

        // StringBuffer Mutable
        StringBuffer name2 = new StringBuffer("Akki");
        name2.append("Tester");
        System.out.println(name2);

        // StringBuilder Mutable
        StringBuilder name3 = new StringBuilder("Akash");
        name3.append("Tester");
        System.out.println(name3);
    }
}
