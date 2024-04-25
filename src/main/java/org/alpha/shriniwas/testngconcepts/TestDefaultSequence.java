package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.Test;

public class TestDefaultSequence {

    @Test
    public void a() {
        System.out.println("Inside a method");
    }

    @Test
    public void c() {
        System.out.println("Inside c method");
    }

    @Test(priority = 1)
    public void d() {
        System.out.println("Inside d method");
    }

    @Test(priority = 1)
    public void b() {
        System.out.println("Inside b method");
    }
}
