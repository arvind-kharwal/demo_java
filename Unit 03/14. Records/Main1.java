record Employee(int eid, String Name, double sal) {
}

public class Main1 {
    public static void main(String[] args) {
        Employee E1 = new Employee(1, "Arvind", 100.34d);
        System.out.println(E1);
        System.out.println(E1.eid());
        System.out.println(E1.Name());
    }
}
