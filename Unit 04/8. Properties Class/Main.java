import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("db.properties");
        Properties p = new Properties();
        // Add a wrapper around reader object
        p.load(reader);
        // access properties data
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }
}