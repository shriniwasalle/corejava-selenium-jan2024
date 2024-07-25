package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    }
}
