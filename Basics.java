// All the basics of java are in this code file.
// Revision
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        // How to take input from user in java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);
        // Conditional statements in java
        // 1. If-Else statement
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
        // 2. Switch statement
        switch (age) {
            case 18:
                System.out.println("You are 18 years old.");
                break;
            case 21:
                System.out.println("You are 21 years old.");
                break;
            default:
                System.out.println("You are neither 18 nor 21 years old.");
        }
        // Loops in java
        // 1. For loop
        System.out.print("Enter a number to print its multiplication table:");
        int n = sc.nextInt();
        for(int i = 1; i <= 11; i++){
            System.out.println(n*i);
        }
        // 2. While loop
        System.out.print("Enter any Number: ");
        int j = sc.nextInt();
        while(j <= 10){
            System.out.println(j);
            j++;
        }
        // 3. Do-While loop
        System.out.print("Enter any Number: ");
        int k = sc.nextInt();
        do{
            System.out.println(k);
            k++;
        }while(k <= 10);

    }
}