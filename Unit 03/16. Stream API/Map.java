import java.util.*;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        Stream<Integer> strm = list.stream();
        Stream<Integer> data = strm.map(n -> n * n);
        data.forEach(n -> System.out.print(n + " "));

    }
}
