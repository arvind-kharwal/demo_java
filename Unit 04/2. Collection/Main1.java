import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(20);
        System.out.println(list);
        // list.clear();
        System.out.println(list);
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
