import java.util.*;

class Student1 {
    int roll;
    String name;
    double marks;

    Student1(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

}

public class Main1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Arvind", 78.56));
        list.add(new Student1(11, "Ghhhaya", 80.56));
        list.add(new Student1(7, "Bhanu", 91.56));
        // list.sort(Comparator.comparingInt(S -> S.roll));
        // list.sort(Comparator.comparingDouble(S -> S.marks));
        // list.sort(Comparator.comparing(S -> S.name));
        // list.sort(Comparator.comparing(Student1::getName)
        // .thenComparingInt(Student1::getRoll));
        list.sort(
                Comparator.comparing(S -> s.name)
                        .thenComparing(S -> S.roll));
        // .thenComparingInt(Student1::getRoll));

        for (Student1 s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }
}
