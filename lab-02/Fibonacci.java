/*
Name of file: Fibonacci.java
This is a simple java program that prints the fibonacci series
The Procedure:
Receive the output from the user. (i.e the number of n terms you want)
Create variables first, second and store the starting values for the fibonacci sequence
Create a for loop that'll run based on the n value provided
Always print the value in the firstNumber vairable
Create a variable called next and store the next value inside by adding the first and second numbers up
For the purpose of the variable to come, set the first variable to be equal to the second and the second to be equal to next

Developer: Cal Senam Afun
Date: 25/09/2025
*/


import java.util.Scanner;

public class Fibonacci{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(firstNumber + " ");

            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}