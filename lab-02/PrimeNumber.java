/*
Name of file: PrimeNumber.java
This is a java program to check if an inputted value is a prime number
This prime number checker is based on certain rules for checking prime number:
1. Prime numbers are greater than or equal to 0
2. Prime numbers include 2 and 3
3. Prime numbers are not divisible by 2 (not even numbers except 2)
4. Prime numbers are not divisible by any other number

Receive input from user
using if and else if statements (with for loops) go through the conditions above to verify if the number is a prime number or not

Developer: Cal Senam Afun
Date: 25/09/2025
*/



import java.util.Scanner;
public class PrimeNumber{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number <= 1){
            System.out.printf("%d is not a prime number", number);

        }else if (number == 2 || number == 3){
            System.out.printf("%d is a prime number", number);
        } else if (number % 2 == 0){
            System.out.printf("%d is not a prime number", number);
        } else {
            for (int i = 3; i <= Math.sqrt(number); i+=2){
                if (number % i == 0){
                    System.out.printf("%d is not a prime number", number);
                } else{
                    System.out.printf("%d is a prime number", number);
                }
            }
        }
    }
}



