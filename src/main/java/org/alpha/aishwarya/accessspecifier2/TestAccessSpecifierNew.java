package org.alpha.aishwarya.accessspecifier2;

import org.alpha.aishwarya.accessspecifier1.TestAccessSpecifier1;

// Created class for Protected Access Specifier.
public class TestAccessSpecifierNew extends TestAccessSpecifier1 {
    public static void main(String[] args) {

        TestAccessSpecifierNew obj1 = new TestAccessSpecifierNew ();
        obj1.m4();

    }
}

/** ----OutPut----
 *   "Inside method m4: which is Protected
 */