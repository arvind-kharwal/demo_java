import static java.lang.Math.PI;
import java.util.Scanner;
interface Example1{
    double area(int r);
}

public class Main6 {
    public static void main(String[] args) {
        Example1 E1 = (int r)-> PI*r*r;
        System.out.println("Enter the radius: ");
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the radius:");
        int x = S.nextInt();
        double res = E1.area(x);
        System.out.println("The area is: "+res);
        S.close();
    }
}
