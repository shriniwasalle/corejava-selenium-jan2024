package org.alpha.tejashri.corejava.recursion;

public class TestRecursion {

    public static int sum(int k) {
        if (k > 0) { //Halting Condition/Break point - where the function stops calling itself
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    //10 + sum(9)
    //10 + ( 9 + sum(8) )
    //10 + ( 9 + ( 8 + sum(7) ) )
    //...
    //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 =55

    public static int add(int start, int end) {
        if (end > start) { //Halting Condition/Break point - where the function stops calling itself
            return end + add(start, end - 1);
        } else {
            return end;
        }
    }
    // 10 + add(9)
    // 10 + 9 + add(8)
    ////10 + ( 9 + ( 8 + sum(7) ) )
    //......
    //10 + 9 + 8 + 7 + 6 + add(5)
    //10 + 9 + 8 + 7 + 6 + 5 = 45

    public static int m1(int k) {
        if (k <= 10) { //Halting Condition/Break point - where the function stops calling itself
            return k + m1(k + 1);
        } else {
            return k;
        }
    }
    //0 + m1(1)
    //0+1+m1(2)
    //0+1+2+3+4+5+6+7+8+9+m1(10)
    //0+1+2+3+4+5+6+7+8+9+10+m1(11)
    //0+1+2+3+4+5+6+7+8+9+10+11==66

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);//55


        int value = add(5, 10);
        System.out.println(value);//45

        int num = add(0, 100);
        System.out.println(num);//5050

        int id = m1(0);
        System.out.println(id);//66

    }
}
