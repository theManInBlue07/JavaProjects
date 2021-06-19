package com.flowstatements;

public class Main {

    public static void main(String[] args) {
//	sum challenge 3 & 5
//	int sum = 0;
//	int count = 0;
//    for (int i =1;i<1001;i++){
//        if (i%3==0 && i%5==0){
//            count ++;
//            sum += i;
//            System.out.println(i);
//
//        }
//        if(count==5){
//            System.out.println("sum=="+sum);
//
//            break;
//        }
//    }
    // Program to write a factorial
    factorial(5);
    factorial(0);
    factorial(29);
    }
    public static long factorial(long n){
        long result = 1;
        long finalResult = 1;
        for (long i =1;i<=n;i++){
            result *=i;
            finalResult = result;
        }
        System.out.println("the fatcorial of "+n+" is "+finalResult);
        return finalResult;

    }
}
