import java.util.*;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        // res.forEach(n -> System.out.println(n));
        System.out.println(res);
    }
}
