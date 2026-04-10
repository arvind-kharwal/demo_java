import java.util.*;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Amir", "Rinku", "Harsh");
        List<String> names = list.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
