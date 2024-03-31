package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.encapsulation;

public class TestEncapsulation {
    private String ssn;
    private String salary;

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    //getter method
    public String getSsn(){
        return ssn;
    }

    //setter method
    public void SetSsn(String ssn){
        this.ssn=ssn;
    }

}
