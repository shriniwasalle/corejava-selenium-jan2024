package org.alpha.tejashri.stringconcept;

public class TestStringWithWithoutReplaceAllMethod {
    public static void main(String[] args) {

        // Using replaceAll Method
        String str1 = "My name is Tejashri Boppa";

        String str1WithoutSpace = str1.replaceAll("\\s", "");// removed all spaces
        System.out.println("Using replaceAll method Without Space: " + str1WithoutSpace);

        String str1WithComma = str1.replaceAll("\\s", ",");// replaced all spaces to ,
        System.out.println("Using replaceAll method With Comma: " + str1WithComma);

        // Without using replaceAll Method

        String str2 = "Tejashri Boppa is my name";
        char ch[] = str2.toCharArray(); //[T, e, j, a, s, h, r, i,  , B, o, p, p, a,  , i, s,  , m, y,  , n, a, m, e]
        System.out.println("Length of ch is : " +ch.length);// 25, 4-spaces also considered in that
        StringBuffer strBuff = new StringBuffer();

        for (int i = 0; i < ch.length; i++)
        {
            if ((ch[i] != ' ' ) && (ch[i] != '\t')) // && : both conditions must be full-fill, 1st for blank/empty, 2nd for space
            {
                strBuff.append(ch[i]); // append- to add to end something extra
            }
        }
        System.out.println("Without using replaceAll method : " + strBuff);
    }
}

//Output
//Using replaceAll method Without Space: MynameisTejashriBoppa
//Using replaceAll method With Comma: My,name,is,Tejashri,Boppa
//Length of ch is : 25
//Without using replaceAll method : TejashriBoppaismyname