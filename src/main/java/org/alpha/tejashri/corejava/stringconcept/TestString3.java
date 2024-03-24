package org.alpha.tejashri.corejava.stringconcept;

public class TestString3 {

    public static void main(String[] args) {
        String str1 = "Tejashri"; // str1= Tejashri
        str1 = str1.concat("Boppa"); // created new copy of str1= TejashriBoppa, not update in previous str1, bcoz strings are immutable
        System.out.println(str1);
    }
}
