package org.alpha.akash.methods;

public class MethodWithReturnValueFromDiffMethod {
    public String getName() {
        String name = "Akash";
        name = name + "Automation Tester";
        return  name;
    }
    public int getNameLength1() {
        String str = getName();//AkashAutomation
        System.out.println(str);
        return str.length();

    }
    public  int getNameLength2() { return getName().length();}

    public static void main(String[] args) {
        MethodWithReturnValueFromDiffMethod obj = new MethodWithReturnValueFromDiffMethod();
        System.out.println(obj.getName());
        int len1 = obj.getNameLength1();
        int len2 = obj.getNameLength2();

        System.out.println(len1);//22
        System.out.println(len2);//22
    }
}
