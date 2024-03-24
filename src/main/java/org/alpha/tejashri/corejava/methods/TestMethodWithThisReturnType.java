package org.alpha.tejashri.corejava.methods;

public class TestMethodWithThisReturnType {
    public TestMethodWithThisReturnType getDetails() {
        return this;
    }

    public Employee getData() {
        Employee emp = new Employee();
        return emp;
    }

    public void getNumber() {
        System.out.println("This is a Void Method");
    }
}
