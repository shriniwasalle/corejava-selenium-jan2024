package org.alpha.tejashri.corejava.collections.wrapperclasses;

public class TestWrapperClasses {

    public static void main(String[] args) {

        //Creating Wrapper class objects
        Integer i = 123456789;
        Character ch = 'K';
        Float f = 99.9f;

        //Used value() method on wrapper objects
        System.out.println("Used Value() method on wrapper objects");
        System.out.println(i.intValue());//123456789
        System.out.println(ch.charValue());//K
        System.out.println(f.floatValue());//99.9

        //Used toString() method on wrapper objects
        System.out.println("Used toString() method on wrapper objects");
        String str = i.toString();
        System.out.println("Length of int String : " +str.length());//9
        System.out.println("character at index 6: " +str.charAt(6));//7

        String str1 = f.toString();
        System.out.println("Length of float String : " +str1.length());//4
        System.out.println("character at index 2: " +str1.charAt(2));// .
        System.out.println("character at index 3: " +str1.charAt(3));//9

        String s = ch.toString();
        System.out.println("Length of char String : " +s.length());//1

    }
}
