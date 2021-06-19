package com.flowstatements;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	int value =1;
	if(value == 1){
        System.out.println("value == 1 ");
    }else if(value==2){
	    System.out.println("Value == 2");
        }else{
            System.out.println("Value neither 1 nor 2.");
        }
	// USING SWITCH instead of If else

    int switchValue= 1;
	switch (switchValue){
        case 1:
            System.out.println("Value is 1.");
            break;
        case 2:
            System.out.println("Value is 2.");
            break;
        default:
            System.out.println("Values is something else.");
            break;
    }
    int newValue = 98;
	switch(newValue){
        case 1:
            System.out.println("new value == 1");
            break;
        case 19:
            System.out.println("new value == 19");
            break;
        case 187:
            System.out.println("new value == 187");
            break;
        case 1789:
            System.out.println("new value == 1789");
            break;
        case 98: case 101: case 102: // shortcut for writing multiple cases in one line
            System.out.println("value is "+newValue);
            break;
        default:
            System.out.println("None of the value is true");
            break;
    }
    // Challenge
    char newCharValue = 'Z';
	switch(newCharValue){
        case 'A':
            System.out.println("Character is A");
            break;
        case 'B':
            System.out.println("Character is C");
            break;
        case 'C': case'D': case'E':
            System.out.println("Character is ,"+newCharValue);
            break;
        default:
            System.out.println("None of the Value mentioned above ");
            break;
	}
	// Weekday challenge
	String day ="MONdaY";
	// here tolowercase converts the entire string to lowercase i.e FRIDAY
    // so we need to make sure that in the test cases everything is in lowercase
	switch(day.toLowerCase()){
        case "monday":
            System.out.println("Day is Monday");
            break;
        case "tuesday": case "wednesday": case "thursday": case "friday":
            System.out.println("day is "+day);
        default:
            System.out.println("It's holiday.");

    }
    }
}
