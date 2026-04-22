import java.util.*;

class Student {
    int roll;
    String name;
    double marks;

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

class SortbyRoll implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return S1.roll - S2.roll;
    }
}

class SortbyName implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return S1.name.compareTo(S2.name);
    }
}

class SortbyMarks implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return Double.compare(S1.marks, S2.marks);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arvind", 78.56));
        list.add(new Student(11, "Chhhaya", 80.56));
        list.add(new Student(7, "Bhanu", 91.56));
        Collections.sort(list, new SortbyMarks());

        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }
}
