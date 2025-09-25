/*
Name of file: ReversedNumber.java

This task was to take an input from a user and reverse the input
The Procedure:
Took an input from user
Converted the number to a string
Found the length of the string
Created an empty string variable for storing the reversed number
Used a for loop beginning from the highest index of the number and it will run as long as the index is greater than equal to 0

Developer: Cal Senam Afun
Date: 25/09/2025

*/

import java.util.Scanner;
public class ReverseNumber{
    public static void main(String [] args){
        // Creating an object from the Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking an input from the user as an integer
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        //Converting the number to string
        String stringNumber = String.valueOf(number);

        //Taking the length of the number
        int numLength = stringNumber.length();

        // Creating an empty variable for storing the reversed number
        String reversedNumber = "";
        
        //for loop for reversing the number using index
        for (int i = numLength - 1; i >= 0; i-- ){
            char ch = stringNumber.charAt(i);
            reversedNumber += ch;
        }

        //printing the output
        System.out.println(reversedNumber);
    }
}