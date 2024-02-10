package org.alpha.sanjeevani.variables;

public class Company {
    String empName;
    int empID;
    static String companyName="microsoft";
    public void getemp(){
        empName="anita";
        empID=10;
        System.out.println(empName);
        System.out.println(empID);
        System.out.println(Company.companyName);
    }
    public void getemp1(){
        empName="manisha";
        empID=20;
        System.out.println(empName);
        System.out.println(empID);
        System.out.println(Company.companyName);
    }
    public static void main(String[] args) {
        Company emp=new Company();
        emp.getemp();
        System.out.println("-----------------------");
        Company emp1=new Company();
        emp1.getemp1();
    }
}
