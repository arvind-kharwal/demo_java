import java.util.*;
import java.util.stream.Stream;
import java.util.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Amit", "Arvind", "Yuvaan", "Jiya");
        Stream<String> str = names.stream()
                .distinct()
                .collect(Collectors.toList);

    }
}
