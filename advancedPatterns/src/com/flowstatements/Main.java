package com.flowstatements;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	int n = scan.nextInt();

	// pattern 1 & 2
//        int num=1;

//          1
//         2  3
//        4  5  6
//       7  8  9  10
//     11  12  13  14  15
////        for(int i=1;i<=n;i++){
//            for(int j =1; j<=2*(n-i) ;j++){
//                System.out.print(" ");
//            }for(int j=1;j<=i;j++){
//                System.out.print(num++ +"  ");
//
//            }
//
//            System.out.println();
//        }

    //pattern 3
//        *
//        * *
//        * * *
//        * *
//        *



//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for(int i =n-1;i>=1;i--){
//            for(int j=n-1;j>=n-i;j--){
//                System.out.print("* ");
//            }
//            for(int j=n-1;j>=i-1;j--){
//                System.out.print("  ");
//            }
//            System.out.println();
//        }


// pattern 4
//  *
//  **
//  * *
//  *  *
//  *   *
//  *    *
//  *     *
//  *      *
//  *********
//        System.out.println("*");
//        for(int i=2;i<=n-1;i++){
//            System.out.print("*");
//            for (int j=1;j<= i-2;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//
//            System.out.print("*");
//        }
//        System.out.println();
    }
}
