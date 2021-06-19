package com.flowstatements;

public class Main {

    public static void main(String[] args) {
//    for (double i =2.00;i<=10.00;i++){
//        System.out.println("the interst rate"+i+ "is "+String.format("%2f",calcInterest(10000.00,i)));
//    }
        //isPrime(1000000001);

        int count = 0;
        for (int x = 2; x < 120; x++) {
            if (isPrime(x)) {
                count++;
                System.out.println(x);

                if (count == 10) {
                    break;
                }
            }
        }
    }

    //    public static double calcInterest(double amount,double interestRate){
//        return (amount*(interestRate/100));
//
//    }
    // creating a method that tells wether a # is prime or not .
    public static boolean isPrime(int number) {
        if (number <= 1) {
            System.out.println("Invalid Input");
            return false;
        }
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                System.out.println("Not a Prime Number");
                return false;
            }
        }
        return true;
    }
}
