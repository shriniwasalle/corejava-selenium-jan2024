package org.alpha.akash.methods;

public class MethodWithReturnType {


    int c = 30;
    int d = 40;
    public int addition1() {
        int a = 10;
        int b = 20;
        int c = a+b;//30
        return c; //30
    }
    public int addition2() {
        int a = 100;
        int b = 200;
        return a+b; //300
    }

    public int addition3() {return 400+200;}//600

    public int multi1() {
        int c = 10;
        int d = 20;
        return this.c * this.d;//20*20
    }
    public int multi2() {
        int c = 10;
        int d = 20;
        return c*d;//10*20
    }
    public String getname(){return "Akash"+"Deepak"+"Vaitala";}

    public static void main(String[] args) {
        MethodWithReturnType obj =new MethodWithReturnType();
        int add1 = obj.addition1();
        int add2 = obj.addition2();
        int add3 = obj.addition3();

        System.out.println("Addition1 :- " +add1);
        System.out.println("Addition1 :- " +add2);
        System.out.println("Addition1 :- " +add3);

        System.out.println("Multiplication1 :- " +obj.multi1());
        System.out.println("Multiplication2 :- " +obj.multi2());

        String name =obj.getname();//AkashDeepakVaitala
        System.out.println("Name is :" +name);
        System.out.println("Length of Name is :- " +name.length());
    }
}
