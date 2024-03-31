package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class MobileFeatureWithMethodParam {
    String name;
    int price;
    static String name1="Samsung";
    public void mobileInfo(){
        name="Samsung12";
        price=12000;
        System.out.println("Name of mobile is :"+name);
        System.out.println("price of mobile is :"+price);
        System.out.println("name1 of mobile is :"+name1);
    }
    public void mobileInfo1(){
        name="Samsung13";
        price=12500;
        System.out.println("Name of mobile is :"+name);
        System.out.println("price of mobile is :"+price);
        System.out.println("name1 of mobile is :"+name1);
    }
    public static void main(String[] args) {
        MobileFeatureWithMethodParam mob=new MobileFeatureWithMethodParam();
        mob.mobileInfo();
        System.out.println("                                   ");
        mob.mobileInfo1();

    }
}
