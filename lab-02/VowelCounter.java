/*
Name of file: VowelCounter.java

This simple java program takes a string input from a user and checks if the string contains a vowel
It utilises for loops to check for each character using the method charAt to get the character at the specified index

Procedure:
1. Take input from user
2. Convert the in put to lowercase using the toLowerCase method
3. Create a variable name vowelCount to track the number of vowels in inside the word.
4. Using a for loop, go through all the letters of the word and verify if it is a vowel or not
*/
import java.util.Scanner;

public class VowelCounter{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String word = scanner.nextLine();

        int vowelCount = 0;
        String lowercase = word.toLowerCase();

        for (int i = 0; i < lowercase.length(); i ++){
            char ch = lowercase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        } 

        System.out.printf("The number of vowels in %s is %d ", word, vowelCount);

    }
}