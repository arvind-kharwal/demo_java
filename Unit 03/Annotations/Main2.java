import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Students.class) // class container
@interface Student1{
    int roll();
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Students{
    Student1 [] value();
}
@Student1(roll=1,name="Arvind")
@Student1(roll=2,name="Amit")

public class Main2 {
    public static void main(String[] args) {
        Student1 [] S1 = Main2.class.getAnnotationsByType(Student1.class);
        for(Student1 s:S1)
        {
            System.out.println(s.roll());
            System.out.println(s.name());
        }
    }
}
