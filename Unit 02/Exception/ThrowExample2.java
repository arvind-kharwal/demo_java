import java.util.Scanner;

public class ThrowExample2 {
    static void divide(int a,int b){
            if (b==0)
            throw new ArithmeticException("Cant Divide by Zero");
        else
        {
            int r = a/b;
            System.out.println("The result is "+r);
        }
        
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        S.close();
    }
}
