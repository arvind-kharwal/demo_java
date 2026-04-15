import java.util.*;
import java.util.stream.*;

public class Distinct {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Amit", "Arvind", "Yuvaan", "Jiya");
        List<String> str = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique names: " + str);
    }
}
