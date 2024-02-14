package org.alpha.sanjeevani.methods;

public class TestMethodObjectAsParameter {
    public void getEmpDetails(Employee emp,String comName){
        System.out.println("Employee"+emp);
        System.out.println(emp.empName);
        System.out.println(emp.empId);
        System.out.println(emp.salary);
        System.out.println("company name:"+comName);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        TestMethodObjectAsParameter obj=new TestMethodObjectAsParameter();
        obj.getEmpDetails(emp,"microsoft");
    }
}
