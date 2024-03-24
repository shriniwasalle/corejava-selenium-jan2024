package org.alpha.tejashri.corejava.operators;

public class TestAssignmentOperators {

    public static void main(String[] args) {
        int a, x;

        a = 100;
        System.out.println(a);

        x = 10;
        x += 3; //x = x + 3
        System.out.println(x);

        x = 20;
        x -= 3; //x = x - 3
        System.out.println(x);

        x = 100;
        x *= 3; //	x = x * 3
        System.out.println(x);

        x = 50;
        x /= 2; //	x = x / 3
        System.out.println(x);

        x = 40;
        x %= 3; //	x = x % 3
        System.out.println(x);

        x = 5;
        x &= 3; //	x = x & 3
        System.out.println(x);

        x = 5;
        x |= 3; //	x = x | 3
        System.out.println(x);

        x = 2;
        x ^= 3; //	x = x ^ 3
        System.out.println(x);

        x = 10;
        x >>= 3; //x = x >> 3
        System.out.println(x);

        x = 5;
        x <<= 3; //x = x << 3
        System.out.println(x);
    }
}
