package pack1;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = S.nextInt();
        double area = PI*r*r;
        System.out.println(area);
        double res = sqrt(10);
        System.out.println(res);

    }
}
