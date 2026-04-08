import java.util.Base64;
public class Encode1 {
    public static void main(String[] args) {
        String name = "Arvind Kharwal";
        String enstr =Base64.getEncoder().withoutPadding().encodeToString(name.getBytes());
        System.out.println(enstr);
    }
}
