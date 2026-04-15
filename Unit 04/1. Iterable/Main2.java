import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(50);
        // list.add(60);
        System.out.println(list);
        Spliterator<Integer> SP1 = list.spliterator();
        Spliterator<Integer> SP2 = SP1.trySplit();
        System.out.println("First Part :");
        SP1.forEachRemaining(n -> System.out.println(n));
        System.out.println("Second Part :");
        SP2.forEachRemaining(n -> System.out.println(n));
    }
}
