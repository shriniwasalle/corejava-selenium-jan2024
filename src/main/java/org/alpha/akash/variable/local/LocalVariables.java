package org.alpha.akash.variable.local;

import org.alpha.akash.variable.Employee;
public class LocalVariables {
        public static void main(String[] args) {

            // Variable Decleration:=

            int age = 24;
            boolean abc = true;
            char ch = 'A';
            String name = "Akash";
            float f = 10.1f;
            double d = 10.10;

            // Array Variable Decleration:=

            int [] st = {1, 2, 3, 4};
            String [] stname  = {"Akash","Pawan","Rawan","Ram"};
            boolean [] flage={true, false, true, true};


            System.out.println(age);
            System.out.println(abc);
            System.out.println(ch);
            System.out.println(name);
            System.out.println(f);
            System.out.println(d);

            //Array Variables

            for(int i=0; i<=3; i++ ) {

                System.out.print(st[i] + " ");

            }
            System.out.println();
            for(int i=0; i<=3; i++ ) {


                System.out.print(stname[i] + " " );
            }

            System.out.println();

            for(int i=0; i<=3; i++ ) {

                System.out.print(flage[i] + " ");

            }

            System.out.println(" ");


            Employee emp = new Employee();


            Employee [] emps = null;
            //User Defined class Variable
            System.out.println(emp);

            //User Defined array Variable
            System.out.println(emps);




        }
}
