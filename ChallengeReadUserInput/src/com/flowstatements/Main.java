package com.flowstatements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(true){
            int order = counter +1;
            System.out.println("Enter a number "+order+" : ");
            boolean ifAnINt = scanner.hasNextInt();
            if(ifAnINt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter==10){
                    System.out.println("sum =="+sum);
                    break;
                }
            }else{
                System.out.println("Invalid Number");
            }
            


        }
        scanner.close();

    }
}
