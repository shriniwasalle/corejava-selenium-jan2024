package org.alpha.shriniwas.methods;

public class TestMethodWithThisReturnType {

    public TestMethodWithThisReturnType getDetails() {
        return this;
    }

    public Employee getData() {
        Employee emp = new Employee();
        return emp;
    }

    public void getNumber() {
        System.out.println("This is a void method");
    }
}
