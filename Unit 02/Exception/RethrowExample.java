import java.util.Scanner;

public class RethrowExample {
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
            System.out.println("Rethrowing");
            throw e; // Rethrow
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
