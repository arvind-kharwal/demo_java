import java.util.*;

class Student3 {
    int r;
    String name;

    Student3(int r, String name) {
        this.r = r;
        this.name = name;
    }

}

public class Main3 {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<>();
        list.add(new Student3(3, "Chandan"));
        list.add(new Student3(7, "Dhanush"));
        list.add(new Student3(1, "Arvind"));
        Collections.sort(list, (S1, S2) -> S1.r - S2.r);
        for (Student3 i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}
