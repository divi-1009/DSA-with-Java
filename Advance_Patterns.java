import java.util.*;
public class Advance_Patterns {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows:");
            int n = sc.nextInt();
            // 1. Butterfly Pattern (Nested Loop)
            for(int i = 1; i<= n; i++){
                // 1st half
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                // spaces
                for(int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" "+" ");
                }
                // 2nd half
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            for(int i = n; i>= 1; i--){
                // 1st half
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                // spaces
                for(int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" "+" ");
                }
                // 2nd half
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            // 2. Palindrome Pattern (Nested Loop)
            System.out.print("Enter the number of rows:");
            int m = sc.nextInt();
            for(int i = 1; i <= m; i++){
                // spaces
                for(int j = 1; j <= m-i; j++){
                    System.out.print(" "+" ");
                }
                // 1st half
                for(int j = i; j >= 1; j--){
                    System.out.print(j+" ");
                }
                // 2nd half
                for(int j = 2; j <= i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
