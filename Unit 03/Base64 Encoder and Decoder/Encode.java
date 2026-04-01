import java.util.Base64;
public class Encode {
    public static void main(String[] args) {
        String name = "Arvind Kharwal";
        String enstr =Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(enstr);
    }
}
