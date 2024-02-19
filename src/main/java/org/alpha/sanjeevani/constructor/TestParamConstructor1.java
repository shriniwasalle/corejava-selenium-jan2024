package org.alpha.sanjeevani.constructor;

public class TestParamConstructor1 {
    int studentId;
    String studentName;
    TestParamConstructor1(int studentId,String studentName){
       this.studentId=studentId;
        this.studentName=studentName;
    }
    public static void main(String[] args) {
        TestParamConstructor1 obj=new TestParamConstructor1(10,"anita");
        System.out.println(obj.studentId);
        System.out.println(obj.studentName);
        TestParamConstructor1 obj1=new TestParamConstructor1(20,"sunita");
        System.out.println(obj1.studentId);
        System.out.println(obj1.studentName);

    }
}
