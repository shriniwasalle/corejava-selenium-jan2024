package org.alpha.sanjeevani.methods;

public class TestMethodWithReturnValueFromDiffMethod {
    public String getName(){
        String name="sanjeevani"+"Sutar";
        return name;

    }
    public int getNameLength(){
        String str=getName();
        System.out.println(str);
        return str.length();
    }
    public static void main(String[] args) {
        TestMethodWithReturnValueFromDiffMethod obj=new TestMethodWithReturnValueFromDiffMethod();
        int len=obj.getNameLength();
        System.out.println(len);
    }
    }