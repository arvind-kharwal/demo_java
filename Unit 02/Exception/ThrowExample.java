import java.util.Scanner;

public class ThrowExample {
    static void divide(int a,int b){
        try{
            if (b==0)
            throw new ArithmeticException("Cant Divide by Zero");
        else
        {
            int r = a/b;
            System.out.println("The result is "+r);
        }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        divide(a,b);
        S.close();
    }
}
