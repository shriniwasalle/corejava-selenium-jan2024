package org.alpha.tejashri.corejava.collections.map;

import java.util.*;

public class TestHashMapWithEmployees {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Teja", 1111);
        Employee emp2 = new Employee("Mahi", 2222);
        Employee emp3 = new Employee("Anshu", 3333);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, emp1);
        map.put(2, emp2);
        map.put(3, emp3);

        System.out.println(map.keySet());// will give only key set
        //System.out.println(map.values());//will give value hashcode set

        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            Integer key = entry.getKey();
            System.out.println("Key : " + key);

            Employee emp = entry.getValue();
            System.out.println(emp.empName);
            System.out.println(emp.empSalary);
        }

        System.out.println("---------With List Of Employee---------");

        List<Employee> list1 = new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);

        List<Employee> list2 = new ArrayList<>();
        list2.add(emp3);

        Map<Integer, List<Employee>> mapList = new HashMap<>();
        mapList.put(10, list1);
        mapList.put(20, list2);

        System.out.println(mapList.keySet());// will gives key set

        Set<Map.Entry<Integer, List<Employee>>> entries2 = mapList.entrySet();

        for (Map.Entry<Integer, List<Employee>> entry1 : entries2) {
            System.out.println(entry1);
        }

        for (Map.Entry<Integer, List<Employee>> entry1 : entries2) {
            System.out.println("Key : " + entry1.getKey());

            //Further iterating values are List<Employee>>
            List<Employee> emp = entry1.getValue();
            for (Employee em : emp) {
                System.out.println(em.empName);
                System.out.println(em.empSalary);
            }
        }
    }
}
