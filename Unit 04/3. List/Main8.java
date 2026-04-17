import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(40);
        System.out.println("list 1: " + list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(100);
        System.out.println("list 2: " + list2);
        // list1.addAll(0, list2);
        list1.addAll(0, list2);
        System.out.println("Updated list: " + list1);

    }
}