import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int r = S.nextInt();
        int res = switch(r)
        {
            case 1-> 100;
            case 2-> 300;
            case 3-> 500;
            default-> 0;
        };
        System.out.println(res);
        S.close();
}
}
