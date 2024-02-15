package org.alpha.shriniwas.methods;

public class TestMethodsWithReturnValueFromDiffMethod {

    public String getName() {
        String name = "Shriniwas";
        name = name + "Automation";
        return name; // ShriniwasAutomation
    }

    public int getNameLength1() {
        String str = getName(); // ShriniwasAutomation
        System.out.println(str); // ShriniwasAutomation
        return str.length();
    }

    public int getNameLength2() {
        return getName().length();
    }

    public static void main(String[] args) {
        TestMethodsWithReturnValueFromDiffMethod obj = new TestMethodsWithReturnValueFromDiffMethod();
        int len1 = obj.getNameLength1();
        int len2 = obj.getNameLength2();

        System.out.println(len1);
        System.out.println(len2);
    }
}
