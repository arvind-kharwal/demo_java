import java.util.Base64;
public class UrlEncode {
    public static void main(String[] args) {
        String name = "https://www.google.com/";
        String enstr =Base64.getUrlEncoder().encodeToString(name.getBytes());
        System.out.println(enstr);
        byte [] b = Base64.getUrlDecoder().decode(enstr);
        String decodeString = new String(b);
        System.out.println("Decoded URL: "+decodeString);
    }
}
