package org.alpha.darshan.variables.defaultvalues;

public class Company {

    int ComId;

    String empName;

    static String  companyName="Microsoft";



    public  void empDetails(int comId,String empName){

        System.out.println(comId);
        System.out.println(empName);
        System.out.println(companyName);

    }

    public static void main(String[] args) {
        Company c1= new Company();
        c1.empDetails(101,"Darshan");

    }
}
