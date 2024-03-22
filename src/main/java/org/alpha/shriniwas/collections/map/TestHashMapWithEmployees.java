package org.alpha.shriniwas.collections.map;

import java.util.*;

public class TestHashMapWithEmployees {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Shri1", 1000);
        Employee emp2 = new Employee("Shri2", 2000);
        Employee emp3 = new Employee("Shri3", 3000);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, emp1);
        map.put(2, emp2);
        map.put(3, emp3);

        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();

        for (Map.Entry<Integer, Employee> entry : entries) {
            Integer key = entry.getKey();
            System.out.println("Key: " +key);

            Employee emp = entry.getValue();

            System.out.println(emp.empName);
            System.out.println(emp.empSalary);
        }

        System.out.println("----- With List of Employees ---- ");

        List<Employee> list1 = new ArrayList<>();
        list1.add(emp1);

        List<Employee> list2 = new ArrayList<>();
        list2.add(emp2);

        Map<Integer, List<Employee>> mapList = new HashMap<>();
        mapList.put(1, list1);
        mapList.put(2, list2);

        System.out.println(mapList);
    }
}
