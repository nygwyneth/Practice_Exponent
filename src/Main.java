import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();
    }
    
    public static void startProgram() {
        System.out.print("Enter the first number: ");
        int number = in.nextInt();
        System.out.print("Enter the second number: ");
        int exponent = in.nextInt();
        
        displayExponent(number, exponent);
    }
    
    public static void displayExponent(int number, int exponent) {
        int product = 1;
        for(int i = 1; i <= exponent; i++) product *= number;

        System.out.println(number + " to the power of " + exponent + " is " + product);
    }
}