package org.alpha.tejashri.methods;

public class TestMethodWithReturnValuesFromDiffMethod {
    public String getName() {
        String name = "Tejashri";
        name = name + "Automation";
        return name; // TejashriAutomation
    }

    public int getNameLength1() {
        String str = getName(); // direct called // TejashriAutomation
        System.out.println(str); // TejashriAutomation
        return str.length();
    }

    public int getNameLength2() {
        //  String str = getName(); // direct called // TejashriAutomation
        //  System.out.println(str); // TejashriAutomation
        //  without this direct called in return
        return getName().length();
    }

    public static void main(String[] args) {
        TestMethodWithReturnValuesFromDiffMethod obj = new TestMethodWithReturnValuesFromDiffMethod();
        int len1 = obj.getNameLength1();
        int len2 = obj.getNameLength2();
        System.out.println(len1);
        System.out.println(len2);
    }
}
