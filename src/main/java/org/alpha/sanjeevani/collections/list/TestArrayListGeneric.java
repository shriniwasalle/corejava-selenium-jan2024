package org.alpha.sanjeevani.collections.list;

import java.util.ArrayList;
import java.util.List;

//wrapper classes
//int-->Integer;
//boolean-->Boolean;
//char-->Character;
//short-->Short;
//double-->Double;
//float=Float;
//long=Long;

public class TestArrayListGeneric {
    public static void main(String[] args) {
        List <String>list=new ArrayList();
        list.add("sanju1");
        list.add("sanju2");
        list.add("sanju3");
        System.out.println(list);

        System.out.println("------------using for each loop-------------");
        for (String str:list){
            System.out.println(str);
        }

        System.out.println("------------using for loop-------------");
        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }

        List <Integer>list1=new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println(list1);

        System.out.println("------------using for each loop-------------");
        for (Integer value:list1){
            System.out.println(value);
        }

        System.out.println("------------using for loop-------------");
        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list1.get(i));
        }
        Employee emp1 = new Employee("sanju1", 100);
        Employee emp2 = new Employee("sanju2", 200);
        Employee emp3 = new Employee("sanju3", 300);

        List <Employee>emplist=new ArrayList();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);

        System.out.println("------------using for loop employee values print-------------");

        for (Employee emp:emplist) {
            System.out.println(emp.empName);
            System.out.println(emp.empId);
        }

    }
}
