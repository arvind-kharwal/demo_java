import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterable<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // enhnced for each loop
        // for (Integer i : list) {
        // System.out.print(i + " ");
        // }
        // forEach() method
        // list.forEach(n -> System.out.println(n));
        // Iterator Interface
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
