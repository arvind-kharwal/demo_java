import java.util.*;

class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

    // @Override
    // public String toString() {
    // return r + " " + name;
    // }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Arvind"));
        list.add(new Student(1, "Abhi"));
        list.add(new Student(13, "Bhavya"));
        for (Student i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}
