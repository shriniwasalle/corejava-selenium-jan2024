package org.alpha.sanjeevani.practice;

public class StarPrinting {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
//output
//*
//* *
//* * *
//* * * *
