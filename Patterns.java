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
                    System.out.print("*"+" ");
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
                        System.out.print("*"+" ");
                    }else{
                        System.out.print(" "+" ");
                    }
                }
                System.out.println();// ye next line ke liye hai
            }
            // 3. Half Pyramid (Nested Loop)
            System.out.print("Enter the number of rows:");
            int c = sc.nextInt();
            for(int i = 1; i <= c; i ++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            // 4. Inverted Half Pyramid (Nested Loop)
             System.out.print("Enter the number of rows:");
            int d = sc.nextInt();
            for(int i = d; i >= 1; i --){
                for(int j = 1; j <= i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            // 5. Inverted Half Pyramid Rotated by 180 degrees (Nested Loop)
            System.out.print("Enter the number of rows:");
            int e = sc.nextInt();
            for(int i =1; i <= e; i++){
                //iner loop for spaces
                for(int j = 1; j<=e-i; j++){
                    System.out.print(" ");
                }
                //inner loop for stars
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // 6. Half Pyramid with Numbers (Nested Loop)
            System.out.print("Enter the number of rows:");
            int f = sc.nextInt();
            for(int i = 1; i <= f; i ++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            // 7. Inverted Half Pyramid with Numbers (Nested Loop)
            System.out.print("Enter the number of rows:");
            int g = sc.nextInt();
            for(int i = 1; i <= g; i++){
                for(int j = 1; j <= g-i+1; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            // 8. Floyd's Triangle (Nested Loop)
             System.out.print("Enter the number of rows:");
            int h = sc.nextInt();
            int number = 1;
            for(int i = 1; i <= h; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
            // 9. 0-1 Triangle (Nested Loop)
            System.out.print("Enter the number of rows:");
            int k = sc.nextInt();
            for(int i = 1; i <= k; i++){
                for(int j=1; j <= i; j++){
                    if ((i+j)%2 ==0){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
