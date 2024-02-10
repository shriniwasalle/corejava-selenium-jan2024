package org.alpha.sanjeevani.methods;

public class TestMethodWithParam {
    public void arithmatic(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public static void main(String[] args) {
        TestMethodWithParam obj=new TestMethodWithParam();
        obj.arithmatic(15,5);
    }
}
