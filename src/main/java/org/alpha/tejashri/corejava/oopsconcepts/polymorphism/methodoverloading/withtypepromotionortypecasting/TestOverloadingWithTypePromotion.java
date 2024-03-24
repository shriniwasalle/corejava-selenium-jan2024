package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverloading.withtypepromotionortypecasting;

public class TestOverloadingWithTypePromotion {

    public void m1(int age) {
        System.out.println(age);
    }

    public void m1(String str) {
        System.out.println("String str = " + str);
    }
    // These above 2 m1 methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) {
        TestOverloadingWithTypePromotion obj = new TestOverloadingWithTypePromotion();
        System.out.println("------- No Type Promotion ----------");
        obj.m1(100);// No promotion

        System.out.println("-------Type Promotion char to int----------");
        // These all are called type Promotion, char->int  converted
        obj.m1('A'); //char uppercase A=65- Type Promotion, char->int, ASCII code of upper case letter A, char converted in int
        obj.m1('e'); //symbol lowercase e=102
        obj.m1('9'); //Number 9=57
        obj.m1('$'); //symbol $=36
        obj.m1('+'); //symbol +=43
        obj.m1('{'); //symbol {=123
        obj.m1(';'); //symbol ;=59

        System.out.println("--------m1 String method-------");
        obj.m1("Anshu");
        obj.m1(String.valueOf("String value of Object : " + 1000));
    }
}

//---------Output-----------
//------- No Type Promotion ----------
//100
//-------Type Promotion char to int----------
//65
//101
//57
//36
//43
//123
//59
//--------m1 String method-------
//String str = Anshu
//String str = String value of Object : 1000