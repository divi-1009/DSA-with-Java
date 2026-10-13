import java.util.*;
public class Functions {
    public static void printMyName(String name){
    System.out.println(name);
    return; 
    }
    public static int addition(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        printMyName(name);
        System.out.println("The sum is: " + addition(a, b));
    }
}