import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        System.out.println(list);
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("The array: ");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}