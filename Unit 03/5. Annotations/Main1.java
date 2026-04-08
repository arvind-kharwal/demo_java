import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Student{
    int roll();
    String name();
}
@Student(roll=1,name="Arvind")

public class Main1 {
    public static void main(String[] args) {
        Student S1 = Main1.class.getAnnotation(Student.class);
        System.out.println(S1.roll());
        System.out.println(S1.name());
    }
}
