package org.alpha.tejashri.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
Wrapper Class which is extending Number class
int - Integer
char - Character
byte - Byte
boolean - Boolean
long - Long
short - Short
float - Float
*/
public class TestArrayListGeneric {
    public static void main(String[] args) {
        //Generic/Homogeneous objects/values in list1, it's Type Safety
        List<String> list1 = new ArrayList<>();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");
        //list1.add(100);// trows an error bcz declared list type is String can not add other type of values
        System.out.println(list1);



        System.out.println("-----For Each loop---- ");
        for (String str : list1){
            System.out.println(str);
        }
        
        System.out.println("-----For loop---- ");

        for (int i=0; i<=list1.size()-1; i++){
            System.out.println(list1.get(i));
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        System.out.println("-----For Each loop---- ");
        for (Integer i : list2){ // (int i : list2)
            System.out.println(i);
        }
        System.out.println("-----For loop---- ");
        for (int i=0; i<=list2.size()-1; i++){ // Auto Boxing from Integer->int
            System.out.println(list2.get(i));
        }

        System.out.println();

        System.out.println("-----Employee List---- ");
        Employee emp1 = new Employee("Shri", 100);
        Employee emp2 = new Employee("Mahi", 200);
        Employee emp3 = new Employee("Anshu", 300);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println("-----For Each loop---- ");
        for (Employee emp : empList){
            //System.out.println(emp);// will print the objects
            System.out.println(emp.empName);
            System.out.println(emp.empId);
        }

//        System.out.println("-----For loop---- ");
//for (Object i=0; i<=empList.hashCode(); i++){

//}


    }
}
