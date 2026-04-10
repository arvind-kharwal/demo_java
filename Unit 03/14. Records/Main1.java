import java.util.Scanner;

record Employee(int eid, String name, double sal) {
    public Employee {
        // this(0, null, 0);
        if (eid == 0)
            throw new IllegalArgumentException();
    }
}

public class Main1 {
    public static void main(String[] args) {
        try (Scanner S = new Scanner(System.in)) {
            System.out.println("Enter the details: ");
            int eid = S.nextInt();
            String name = S.nextLine();
            double sal = S.nextDouble();
            Employee E1 = new Employee(eid, name, sal);
            System.out.println(E1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
