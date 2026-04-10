import java.util.*;

public class Pipeline {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        list.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
    }
}
