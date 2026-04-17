import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        System.out.println("Original list: " + list);
        // list.add(1, 45);
        list.set(2, 1000);
        System.out.println("Original list: " + list);

    }
}