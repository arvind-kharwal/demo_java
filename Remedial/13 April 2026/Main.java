// import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Integer n1 = n;
        System.out.println("Object: " + n1 + " \nPrimitive: " + n);
        boolean res1 = (n1 instanceof Integer);
        System.out.println(res1);
    }
}
