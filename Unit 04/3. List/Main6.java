import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        System.out.println("Original list: " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + list);
    }
}