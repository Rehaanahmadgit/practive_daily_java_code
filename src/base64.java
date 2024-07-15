import java.beans.Encoder;
import java.util.Base64;

public class base64 {
    public static void main(String[] args) {

                String name = "rehaan ahmad";
                Base64.Encoder encoder = Base64.getEncoder();
                String encodedStr = encoder.encodeToString(name.getBytes());
                System.out.println(encodedStr);
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] dec=decoder.decode(encodedStr.getBytes());
        String decodestr=new String(dec);
        System.out.println(decodestr);
            }

}
