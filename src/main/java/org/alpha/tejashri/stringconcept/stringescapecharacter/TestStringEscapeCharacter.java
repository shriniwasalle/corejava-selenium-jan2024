package org.alpha.tejashri.stringconcept.stringescapecharacter;

public class TestStringEscapeCharacter {
    public static void main(String[] args) {
        //String str = "Testing "String" in java"; // Throw an error - Not a statement
        //This is not valid string, if we want to add a special character in string have to use \ backslash escape character

        String str1 = "Testing \"String\" in java"; // valid string - "String"
        String str2 = "The character \\ is called backslash"; // \
        String str3 = "It\'s alright."; // It's
        String str4 = "Testing \'Escape Characters\' in Java"; // 'Escape Characters'

        // \n New Line - prints to new line
        String str5 = "Hello \n World"; // Hello
                                        // World
        // \r Carriage Return - gives only after that values
        String str6 = "Hello \r New World"; // New World

        // \t Tab - gives tab
        String str7 = "Hello \t World"; //Hello 	 World

        // \b Backspace - before that anything will remove/delete character,space,number anything
        String str8 = "Hello ABCD\bEFGH World"; //Hello ABCEFGH World - removed character D
        String str10 = "Hello \bWorld"; //HelloWorld - removed space

        /* \f Form Feed or page break -// It is used to insert a form feed into a string literal.
        // The form feed character is used to start a new page in a printed document*/

        String str9 = "Hello \f World";
        //Hello
                // World
        String str11 = "Hello, World \f welcome to java examples";
        //Hello, World
                       // welcome to java examples

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);

    }
}

//-------Output------
//Testing "String" in java
//The character \ is called backslash
//It's alright.
//Testing 'Escape Characters' in Java
//Hello
// World
// New World
//Hello 	 World
//Hello ABCEFGH World
//Hello
        // World
//HelloWorld
//Hello, World
                // welcome to java examples