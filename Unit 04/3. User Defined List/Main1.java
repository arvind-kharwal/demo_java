import java.util.*;

class Employee {
    int eid;
    String name;
    double sal;

    Employee(int eid, String name, double sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(11, "Chandu", 123.65));
        list.add(new Employee(1, "Aryan", 23847.65));
        list.add(new Employee(2, "Bablu", 123847.65));
        for (Employee e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
        list.remove(0);
        System.out.println("Updated List: ");
        for (Employee e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
    }
}
