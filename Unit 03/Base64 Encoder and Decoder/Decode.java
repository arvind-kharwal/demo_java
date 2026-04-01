import java.util.Base64;
public class Decode {
    public static void main(String[] args) {
        String name = "Arvind Kharwal";
        String enstr =Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded String: "+enstr);
        byte [] b = Base64.getDecoder().decode(enstr);
        String decodeString = new String(b);
        System.out.println("Decoded String: "+decodeString);

    }
}
