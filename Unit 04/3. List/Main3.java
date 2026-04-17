import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        System.out.println(list);
        list.remove(1);
        System.out.println("After removal: " + list);
    }
}