package org.alpha.tejashri.variables.staticvariables;


public class Company {
String empName;
int empId;
static String companyName = "Google"; // Static Variables

    public void getEmp1() {
       empName = "Mahika";
       empId = 100;
        System.out.println("First Employee Details");
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(companyName);
        System.out.println(Company.companyName);

    }
    public void getEmp2(){
        empName = "Anshika";
        empId = 200;
        System.out.println("Second Employee Details");
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(companyName);

    }


public static void main(String[] args) {
    Company obj1 = new Company();
    obj1.getEmp1();

    Company obj2 = new Company();
    obj2.getEmp2();
}
}