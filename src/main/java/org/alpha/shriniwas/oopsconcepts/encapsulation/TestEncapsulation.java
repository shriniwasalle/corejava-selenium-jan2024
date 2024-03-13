package org.alpha.shriniwas.oopsconcepts.encapsulation;

public class TestEncapsulation {

    private String ssn; // 123456789
    private String salary;

    public String getSsn() {
        // Logic : If user is authenticated
        return ssn; // 123456789
    }

    public void setSsn(String ssn) {
        this.ssn = ssn; // this.ssn =  123456789
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
