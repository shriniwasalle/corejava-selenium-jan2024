package org.alpha.sanjeevani.methods;

public class TestMethodWithReturnValueFromDiffMethod1 {
    public String getName(){
        return "sanjeevani"+"sutar";

    }
    public int getNameLength(){
        System.out.println(getName());
        return getName().length();
    }

    public static void main(String[] args) {
        TestMethodWithReturnValueFromDiffMethod1 obj=new TestMethodWithReturnValueFromDiffMethod1();
        System.out.println(obj.getNameLength());
    }

}
