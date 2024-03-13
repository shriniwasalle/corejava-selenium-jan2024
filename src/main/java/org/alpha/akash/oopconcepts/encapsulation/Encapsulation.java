package org.alpha.akash.oopconcepts.encapsulation;

public class Encapsulation {

    private String ssn ;
    private  String salary;

    public  String  getSsn() {
        //Authontication of Logic code
        return ssn;

    }
    public void setSsn(String ssn) {this.ssn = ssn;}

    public String  getSalary() {return salary;}

    public  void setSalary(String salary) { this.salary = salary;}
}
