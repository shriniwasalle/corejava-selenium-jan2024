package org.alpha.tejashri.TestNG.defaultsequence;

import org.testng.annotations.Test;

public class TestDefaultSequence {

    //Default Sequence of Test is in Ascending, Alphabetically order only
    //-3, -2, -1, 0, 1, 2, 3

    @Test
    public void E() {
        System.out.println("Inside E Method");
    }

    @Test
    public void C() {
        System.out.println("Inside C Method");
    }

    @Test
    public void A() {
        System.out.println("Inside A Method");
    }

    @Test(priority = 1)
    public void B() {
        System.out.println("Inside B Method :: with priority 1");
    }

    @Test(priority = -1)
    public void A2() {
        System.out.println("Inside A2 Method :: with priority -1");
    }

    @Test
    public void A1() {
        System.out.println("Inside A1 Method");
    }

}