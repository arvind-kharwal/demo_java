import java.util.Scanner;

public class Main5 {
    static void divide(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Can't divide it by zero");
        else{
            int r = a/b;
            System.out.println(r);
        }
    }

    static void display() throws ArithmeticException{
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        divide(a, b);
        S.close();
    }
    public static void main(String[] args) {
        try{
                display();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
