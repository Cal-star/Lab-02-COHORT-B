import java.util.Scanner;

public class FactorialWork{
    public static void main (String [] args){
        // Take a number from the user
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        
        int factorial = 1;

        for (int i = number; i > 0; i--){
            factorial *= i;
        }

        System.out.println(factorial);
        

    }
}