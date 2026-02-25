import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        int res = a/b;
        System.out.println("The result is: "+res);
        S.close();
    }
}
