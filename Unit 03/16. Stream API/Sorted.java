import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        list.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}
