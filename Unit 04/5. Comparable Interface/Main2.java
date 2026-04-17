import java.util.*;

class Student2 implements Comparable<Student2> {
    int r;
    String name;

    Student2(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public int compareTo(Student2 S1) {
        return this.name.compareTo(S1.name);
    }

}

public class Main2 {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(3, "Chandan"));
        list.add(new Student2(7, "Dhanush"));
        list.add(new Student2(1, "Arvind"));
        Collections.sort(list);
        for (Student2 i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}
