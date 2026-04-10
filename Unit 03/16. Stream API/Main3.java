import java.util.*;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        Stream<Integer> res = list.stream()
                .map(n -> n * n);
        res.forEach((n) -> System.out.println(n));
    }
}