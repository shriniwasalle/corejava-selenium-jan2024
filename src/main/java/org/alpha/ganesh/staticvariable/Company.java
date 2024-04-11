package org.alpha.ganesh.staticvariable;

public class Company {
    String empName;
    int empId;

    static String companyName = "Microsoft";

    public void getEmp1() {
        empName = "Shri";
        empId = 100;

        System.out.println(empName);
        System.out.println(empId);
        System.out.println(companyName);
        System.out.println(Company.companyName);
    }

    public void getEmp2() {
        empName = "Anjali";
        empId = 200;

        System.out.println(empName);
        System.out.println(empId);
        System.out.println(Company.companyName);
    }

    public static void main(String[] args) {
        Company obj1 = new Company();
        obj1.getEmp1();

        Company obj2 = new Company();
        obj2.getEmp2();

        }
}
