package org.alpha.akash.accessspecifier2;

import org.alpha.akash.accessspecifier1.AccessSpecifier1;
import org.alpha.akash.accessspecifier1.AccessSpecifier2;

public class AccessSpecifier extends AccessSpecifier1 {

    public static void main(String[] args) {
        AccessSpecifier1 obj = new AccessSpecifier1();
        obj.m1();

        // obj.m2(); // m2 method is private in AccessSpecifier1 class
        // obj.m3(); / m3 method is  defoult in AccessSpecifier1 class

        AccessSpecifier obj1 = new AccessSpecifier();
        obj1.m4();

        
    }
}
