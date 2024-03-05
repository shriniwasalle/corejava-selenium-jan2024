package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloadingWithTypePromotion {

    public void m1(int id){ // method creating
        System.out.println(id); // method output logic
    }

    //public void m1(char ch) { // method creating
       // System.out.println(ch);
    // }

    public void m1(char ch , int age) { // method creating
        System.out.println(ch);
        System.out.println(age);
    }


    public void m1(String str){
        System.out.println(str);

    }
    public static void main(String[] args) {
        TestOverloadingWithTypePromotion obj = new TestOverloadingWithTypePromotion();
        obj.m1('A'); // Type Promotion zal ahe char --->int
        obj.m1("Jay Shree Ram");
        obj.m1('A'); // if Matching parameter found then type promotion not take place as it will print Expected output
        obj.m1('s', 20); // if same parameter get then No type promotion.
    }
}

/**----OutPut----
 * 65 -----> ASCII Number print of char
 * Jay Shree Ram
 * 65 ---> ASCII Number print of char
 * s ---> same parameter get that's why No type promotion
 * 20---> same parameter get that's why No type promotion
 */
