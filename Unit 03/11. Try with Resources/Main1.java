import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        try( Scanner S = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = S.nextInt();
            System.out.println(n);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
