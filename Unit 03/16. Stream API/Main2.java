import java.util.*;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 30, 4, -5);
        Stream<Integer> strm = list.stream();
        Stream<Integer> sorteddata = strm.sorted();
        sorteddata.forEach(n -> System.out.print(n + " "));
    }
}
