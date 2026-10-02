import java.util.*;
public class Patterns {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows:");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns:");
            int m = sc.nextInt();
            // 1. Solid Rectangle (Nested Loop)
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // 2. Hollow Rectangle (Nested Loop)
            System.out.print("Enter the number of rows:");
            int a = sc.nextInt();
            System.out.print("Enter the number of columns:");
            int b = sc.nextInt();
            for(int i = 1; i<=a ; i ++){
                for(int j = 1; j <=b; j++){
                    if(i == 1 || i == a || j == 1 || j == b){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();// ye next line ke liye hai
            }
            // Half Pyramid (Nested Loop)
            System.out.print("Enter the number of rows:");
            int c = sc.nextInt();
            for(int i = 1; i <= c; i ++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
