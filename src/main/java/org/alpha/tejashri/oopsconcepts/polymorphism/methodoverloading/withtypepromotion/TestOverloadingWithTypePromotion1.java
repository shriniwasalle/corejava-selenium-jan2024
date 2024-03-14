package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.withtypepromotion;

public class TestOverloadingWithTypePromotion1 {
    public void m1(double d) {
        System.out.println(d);
    }

    public void m1(String str) {
        System.out.println(str);
    }
    // These above 2 m1 methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) {
        TestOverloadingWithTypePromotion1 obj = new TestOverloadingWithTypePromotion1();
        obj.m1(20.E10d); //double
        obj.m1("String m1 Method" +'\n'); // Escape sequence -\n Newline

        System.out.println("---Type Promotion/Widening Type Casting(Automatically) char,byte,short,int,long,float to double---");
        //Type Promotion also called as Type Casting, This type of casting is called as Widening Casting(Automatically)
        // converting smaller type to larger type size i.e. byte->short->char->int->long->float->double

        obj.m1('A'); //converting Automatically char->double
        obj.m1(126); //converting Automatically byte->double
        obj.m1(32766); //converting Automatically short->double
        obj.m1(214747683); //converting Automatically int->double
        obj.m1(923372034396678L); //converting Automatically long->double
        obj.m1(12.e4f); //converting Automatically float->double

        System.out.println("---Type Promotion/Type Casting(Manually) double to char,short,int,long,float,byte---");
        //Type Promotion also called as Type Casting, This type of casting is called as Narrowing Casting(Manually)
        // converting larger type to smaller type size i.e. double->float->long->int->char->short->byte

        double dd = 98.E9d;

        int i = (int) dd; //converting manually double->int
        System.out.println(i);

        char ch = (char) dd; //converting manually double->char
        System.out.println(ch);

        float f = (float) dd; //converting manually double->float
        System.out.println(f);

        byte b = (byte) dd; //converting manually double->byte
        System.out.println(b);

        short s = (short) dd;//converting manually double->short
        System.out.println(s);

        long l = (long) dd; //converting manually double->long
        System.out.println(l);
    }
}


//----------Output-----------
//2.0E11
//String m1 Method
//
//---Type Promotion/Widening Type Casting(Automatically) char,byte,short,int,long,float to double---
//65.0
//126.0
//32766.0
//2.14747683E8
//9.23372034396678E14
//120000.0
//---Type Promotion/Type Casting(Manually) double to char,short,int,long,float,byte---
//2147483647
//￿
//9.8000003E10
//-1
//-1
//98000000000