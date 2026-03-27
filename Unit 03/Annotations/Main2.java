import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Student1{
    int roll();
    String name();
}
@Student1(roll=1,name="Arvind")
@Student1(roll=2,name="Amit")

public class Main2 {
    public static void main(String[] args) {
        Student S1 = Main2.class.getAnnotation(Student.class);
        System.out.println(S1.roll());
        System.out.println(S1.name());
    }
}
