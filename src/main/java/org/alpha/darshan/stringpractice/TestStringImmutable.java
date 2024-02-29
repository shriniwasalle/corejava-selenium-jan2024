package org.alpha.darshan.stringpractice;

public class TestStringImmutable {




    public static void main(String[] args) {
        String s1="Darshan";
        s1.concat("gaikwad");
        s1= s1.concat("gaikwad");
        System.out.println(s1);

    }
}


//o/p- Darshan
//bcz we created a string by usint string literal and object will get created in
//SCP so that once the value is set we can not chanaget that value.
//here another string will get created and to get that value we need to strore that value by giving same
//refrence to that concat method and then pring