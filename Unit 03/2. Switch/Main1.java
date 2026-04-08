import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int r = S.nextInt();
        switch(r)
        {
            case 1-> System.out.println("Java Class");
            case 2-> System.out.println("C Class");
            default->System.out.println("No class");
        }
        S.close();
    }
}

