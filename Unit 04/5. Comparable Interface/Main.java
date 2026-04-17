import java.util.*;

class Student implements Comparable<Student> {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public int compareTo(Student S1) {
        if (this.r == S1.r)
            return 0;
        else if (this.r > S1.r)
            return 1;
        else
            return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Chandan"));
        list.add(new Student(7, "Dhanush"));
        list.add(new Student(1, "Arvind"));
        Collections.sort(list);
        for (Student i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}
