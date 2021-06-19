package com.flowstatements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name =scanner.nextLine();
        System.out.println("Your name is "+name);
        //scanner.close();


        System.out.println("Your Year of Birth is :");
        boolean hasnextInt = scanner.hasNextInt();
        if(hasnextInt){
            String age =scanner.nextLine();
            // To make sure age is year of birth is not a negative number
            int age1 = Integer.parseInt(age);
            if (age1<0){
                System.out.println("Invalid  Input");
            }
            int currentYear = 2021;
            int currentAge = currentYear-age1;
            if(currentAge>0 && currentAge<120){
                System.out.println(name+" your age is "+currentAge);
            }else{
                System.out.println("Invalid Input");
            }
        }else{
            System.out.println("invalid type error");
        }






        scanner.close();
    }
}
