package org.alpha.sanjeevani.onlycorejavaconcepts.variables;

public class TestVariables3 {
    int a=20;
    static int b=30;

    public static void main(String[] args) {
        TestVariables3 ref=new TestVariables3();
        int c=40;
        System.out.println(c); //local variable
        System.out.println(b); //static variable (direct access)
        System.out.println(TestVariables3.b);//with (class name.variable name) also
        System.out.println(ref.a);
    }

}
