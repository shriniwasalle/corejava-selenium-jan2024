package org.alpha.tejashri.variables.localvariables;

//import org.alpha.tejashri.variables.Employee;
public class LocalVariable {
    public static <Employee> void main(String[] args) {
        int age = 10; // how to read ---> age is a variable of  type int
        /* int : primitive data type
        age : variable
        10 : value
        = : assignment operator */
        boolean bb = true;
        //bb is a variable of type boolean

char ch = 'S'; // need to use single quotes
        String name = "Tejashri"; // need to use double quotes
        float f = 100.5f;
        double d = 100.5;

        int [] st = { 100 , 200, 300};
        String [] names = {"Tejashri", "Mahika", "Anshika"};
        boolean [] flags = {false, false, true};

//            Employee emp = new Employee();

        /* emp = ref variable
         Employee = class
         new Employee() = Object */

//        Employee[] emps = null;

        System.out.println(age);
        System.out.println(bb);
        System.out.println(ch);
        System.out.println(name);
        System.out.println(f);
        System.out.println(d);


        System.out.println("*****  Array Variables ***** ");
        System.out.println(st);
        System.out.println(st[0]);
        System.out.println(st[1]);

        System.out.println(names);
        System.out.println(flags);

        System.out.println("*****  User Defined Class Variable **** ");
//        System.out.println(emp);

        System.out.println("****  User Defined Class Array Variable **** ");
//        System.out.println(emps);
   }
}
