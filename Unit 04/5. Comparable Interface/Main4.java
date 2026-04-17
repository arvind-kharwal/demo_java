import java.util.*;

class Person implements Comparable<Person> {
    int id;
    String name;
    double salary;

    Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Person P) {
        return Double.compare(this.salary, P.salary);
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(3, "Arvind", 10000.23));
        list.add(new Person(7, "Yuvaan", 30000.23));
        list.add(new Person(2, "Jiya", 20000.23));
        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p.id + " " + p.name + " " + p.salary);
        }
    }
}
