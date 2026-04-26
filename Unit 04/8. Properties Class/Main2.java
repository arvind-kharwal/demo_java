import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("name", "Arvind");
        p.setProperty("email", "thekarvind@gmail.com");
        p.store(new FileWriter("info.properties"), "Properties Example");

        FileReader reader = new FileReader("db.properties");
        p.load(reader);
        // access properties data
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("email"));
    }
}
