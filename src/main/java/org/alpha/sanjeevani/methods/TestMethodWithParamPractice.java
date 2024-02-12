package org.alpha.sanjeevani.methods;

public class TestMethodWithParamPractice {
    static String collegeName="SK college";
    public void studentInfo(String name,int rollNo,String division){
        System.out.println("Student name is :"+name);
        System.out.println("Student rollNo is :"+rollNo);
        System.out.println("Student division is :"+division);
        System.out.println("Student collegeName is :"+collegeName);
    }
    public static void main(String[] args) {
        TestMethodWithParamPractice ref=new TestMethodWithParamPractice();
        ref.studentInfo("sonia",10,"A");
        System.out.println("                                ");
        ref.studentInfo("manisha",11,"B");
        System.out.println("                                ");
        ref.studentInfo("pallavi",13,"C");
    }
}
