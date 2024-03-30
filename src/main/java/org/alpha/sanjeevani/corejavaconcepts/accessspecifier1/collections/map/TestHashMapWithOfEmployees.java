package org.alpha.sanjeevani.corejavaconcepts.accessspecifier1.collections.map;

import java.util.*;

public class TestHashMapWithOfEmployees {
    public static void main(String[] args) {
        Employee emp1 = new Employee("sanju1", 1000);
        Employee emp2 = new Employee("sanju2", 2000);
        Employee emp3 = new Employee("sanju3", 3000);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, emp1);
        map.put(2, emp2);
        map.put(3, emp3);

        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            Integer key = entry.getKey();
            System.out.println(key);

            Employee emp = entry.getValue();
            System.out.println(emp.empName);
            System.out.println(emp.empSalary);
        }

        System.out.println("<----------------With list of Employee------------------>");
        List<Employee>list1=new ArrayList<>();
        list1.add(emp1);
        List<Employee>list2=new ArrayList<>();
        list2.add(emp2);

        Map <Integer,List<Employee>>maplist=new HashMap<>();
        maplist.put(1,list1);
        maplist.put(2,list2);
        System.out.println(maplist);//memory address print(# code)

        Set<Map.Entry<Integer,List<Employee>>>entries1=maplist.entrySet();

        for (Map.Entry<Integer,List<Employee>>entry:entries1) {

            Integer key = entry.getKey();
            System.out.println(key);

            List<Employee> value = entry.getValue();

           for (Employee ee:value) {
               System.out.println(ee.empName);
               System.out.println(ee.empSalary);
           }
        }
    }
}
