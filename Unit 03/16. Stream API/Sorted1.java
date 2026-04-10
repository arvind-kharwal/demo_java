import java.util.*;

public class Sorted1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
    }
}
