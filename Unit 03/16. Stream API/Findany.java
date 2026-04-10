import java.util.*;

public class Findany {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Amir", "Rinku", "Harsh");
        Optional<String> names = list.stream()
                .filter(name -> name.startsWith("E"))
                .findAny();

        if (names.isPresent())
            System.out.println(names.get());
        else
            System.out.println("Not found");
    }
}
