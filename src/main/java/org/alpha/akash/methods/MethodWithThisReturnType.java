package org.alpha.akash.methods;

public class MethodWithThisReturnType {

    public MethodWithThisReturnType getDetails() { return this;}

    public  Employee getData() {
        Employee emp = new Employee();
        return  emp;

    }

    public void getNumber() {
        System.out.println("This is a void method");}


}
