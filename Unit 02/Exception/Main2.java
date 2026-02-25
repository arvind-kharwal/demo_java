import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            int res = a/b;
            System.out.println("The result is: "+res);
        }catch(Throwable e){
            // System.out.println("can't divide it by zero");
            System.out.println(e.getMessage());
        }
        finally{
            S.close();
            System.out.println("End of code");
        }
        
    }
}
