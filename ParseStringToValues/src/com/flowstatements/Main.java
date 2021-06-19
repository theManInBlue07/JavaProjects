package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	String stringNumber = "2021";
        System.out.println("The year is =="+stringNumber);
    // parsing string values to integer
        int number = Integer.parseInt(stringNumber);

        System.out.println("the year is "+number);
    number ++;
        System.out.println("next year is "+number);
    stringNumber +=1;// java converting number to string and concatenating it to get 20201
        System.out.println("new year is "+stringNumber);

    String numberDouble = "2021.325";
    // parsing the String to Double
    double num = Double.parseDouble(numberDouble);
        System.out.println(num);
    num++;
        System.out.println(num);
    }
}
