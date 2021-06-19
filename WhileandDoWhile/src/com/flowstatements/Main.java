package com.flowstatements;

public class Main {

    public static void main(String[] args) {
    // Method 1
//    int count = 0;
//	while (count != 6){
//        System.out.println(count);
//        count++;
//    }
	// Method 2--> Alternate method to get to the same result.
//    count =0;
//	while(true){
//	    if(count ==6){
//	        break;
//        }
//        System.out.println("counted value is "+count);
//	    count++;
//    }
	// while(true)--> the loop will run until the value of the variable becomes false. i.e-> if count becomes 7
    // loop will be closed.

// Do While loop
//    int count =0;
//    do{
//        System.out.println("count was "+count);
//        count++;
//    }while(count!=6);


        // Error in code
//    int count = 5;
//    do{
//        System.out.println("count is "+count);
//        count ++;
//    }while(count!=5);

    evenNumber(5);
    evenNumber(999952);

    int number1 = 4;
    int number2 = 100;
    int isEvenNumber = 1;
    while(number1<=number2){
        number1++;
        if (!evenNumber(number1)){
            continue;
        }
        isEvenNumber++;
        System.out.println("even number is "+number1);
        if (isEvenNumber==5){
            break;
        }
        System.out.println("Total number of Even Numbers found =="+isEvenNumber);

    }

    }
    public static boolean evenNumber(int n){
        while(n%2!=0){
            System.out.println(n+" is not an even number");
            return false;
        }
        System.out.println(n+" is an Even Number ");
        return true;
    }
    }

