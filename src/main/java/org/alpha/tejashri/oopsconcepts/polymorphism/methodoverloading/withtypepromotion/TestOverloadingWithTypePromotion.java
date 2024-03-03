package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.withtypepromotion;

public class TestOverloadingWithTypePromotion {


    public void m1(int age){
        System.out.println(age);

    }

    public void m1(String str){
        System.out.println("String str = " +str);

    }

    public static void main(String[] args) {
        TestOverloadingWithTypePromotion obj =new TestOverloadingWithTypePromotion();
        System.out.println("Type Promotion char to int");
       // These all are called type Promotion, char->int  converted
        obj.m1('A'); //A=65- Type Promotion, char->int, ASCII code of upper case letter A, char converted in int
        obj.m1('$'); //$=36
        obj.m1('+'); //+=43
        obj.m1('9'); //9=57
        obj.m1('{'); //{=123
        obj.m1(';'); //;=59
        obj.m1('f'); //f=102
        obj.m1(100);// No promotion
        obj.m1("Anshu");
        obj.m1(String.valueOf("String value of Double : " +0.5));
    }
}
