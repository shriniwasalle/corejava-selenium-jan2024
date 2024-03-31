package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithReturnType {
    int a=25;
    int b=25;
    public int addition(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public int addition1(){
        int a=100;
        int b=200;
        return a+b;
    }
    public int addition2(){
        return 100+200;
    }
    public int multi(){
        return this.a*this.b;
    }
    public int multi1() {
        int a = 20;
        int b = 20;
        return a * b;
    }
    public String getName(){
        return "Sanjeevani";
    }
        public static void main(String[] args) {
        TestMethodWithReturnType obj=new TestMethodWithReturnType();
        int c=obj.addition();
        System.out.println("Addition is "+c );
        System.out.println("Addition1 is "+ obj.addition1());
        int add=obj.addition2();
        System.out.println("Addition2 is "+ add);
        System.out.println("multiplication is : "+obj.multi());
        System.out.println("multiplication1 is : "+obj.multi1());
        String name=obj.getName();
        System.out.println("Name is :"+name);
        System.out.println("length of name is : "+name.length());
    }
}
