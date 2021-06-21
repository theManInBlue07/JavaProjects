package com.flowstatements;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scan.nextInt();
        // Pattern 1

//        	for(int i =1;i<=n;i++){                      //****
//	    int star = i;                                    //****
//	    for(int j =1;j<=n;j++){                          //****
//            System.out.print("*"+" ");                       //****
//        }
//        System.out.println();
//    }

//        // Pattern 2
//        for(int i =1;i<=n;i++){                     //*
//            int star = i;                           //**
//            for (int j =1;j<=star;j++){             //***
//                System.out.print("* ");             //****
//            }
//            System.out.println();
//        }


        // pattern 3
//        for(int i =1;i<=n;i++){
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

//            for(int j=1;j<=i-1;j++){
//                System.out.print("  ");
//            }
//            for(int j =1;j<=n-i+1;j++){
//            System.out.print("* ");
//            }
//            System.out.println();
//        }
        // pattern 4
//        for(int i = 1;i<=n;i++){
//      *
//    * *
//  * * *
//* * * *
//            for(int j =1;j<=n-i;j++ ){
//                System.out.print("  ");
//            }for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
        // pattern 5
//        for(int i=1;i<=n;i++){
//  * * * *
//  * * *
//  * *
//  *
//            for(int j =1; j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=i-1;j++){
//                System.out.print("  ");
//            }
//            System.out.println();
//        }







    }



}
