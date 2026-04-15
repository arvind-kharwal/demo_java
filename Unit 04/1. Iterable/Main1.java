import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(50);
        Spliterator<Integer> SP = list.spliterator();
        SP.tryAdvance(n -> System.out.println(n));
        System.out.println("Remaining elements :");
        SP.forEachRemaining(n -> System.out.println(n));
    }
}
