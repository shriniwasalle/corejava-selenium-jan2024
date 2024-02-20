package org.alpha.tejashri.variables.staticvariables;
public class Company {
String empName;
int empId;
static String companyName = "Google"; // Static Variables common for all objects
                                      // static variable (companyName) created for un-necessary memory west for all different-different objects
    public void getEmp1() { // 1st Method Created
       empName = "Mahika";
       empId = 100;
        System.out.println("First Employee Details");
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(companyName);
        System.out.println(Company.companyName);// not necessary to create object access/ called by class name
        // company name variable directly accessed by class name
    }
    public void getEmp2(){ // 2nd Method Created
        empName = "Anshika";
        empId = 200;
        System.out.println("Second Employee Details");
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(companyName); // direct called without class name
    }
public static void main(String[] args) {
    Company obj1 = new Company(); //obj1 variable stored in stack memory
    obj1.getEmp1(); // Called 1St method

    Company obj2 = new Company();
    obj2.getEmp2(); // Called 2nd Method
}
}