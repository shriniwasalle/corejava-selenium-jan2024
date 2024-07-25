package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodPractice {
    static String companyName="microsoft";
    public void emp(String empName,int empId,int empSalary,int empExperience){
        System.out.println("empName :"+empName);
        System.out.println("empId  :"+empId);
        System.out.println("empSalary :"+empSalary);
        System.out.println("empExperience  :"+empExperience);
        System.out.println("company Name :"+companyName);
    }
    public static void main(String[] args) {
        TestMethodPractice ref=new TestMethodPractice();
        ref.emp("priya",10,1000,2);
        System.out.println("                                 ");
        ref.emp("manisha",11,2000,3);
        System.out.println("                                 ");
        ref.emp("anita",12,3000,3);
        System.out.println("                                 ");
        ref.emp("pooja",13,4000,4);
    }
}
