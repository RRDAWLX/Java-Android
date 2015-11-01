import java.net.URLDecoder;
import java.net.URLEncoder;


public class Encode$Decode {
	public static void main(String[] args) throws Exception{
		String str = "Õı¡˙œÈ rrdawlx";
		String encode = URLEncoder.encode(str);
		System.out.println("encode string: " + encode);
		String decode = URLDecoder.decode(str);
		System.out.println("Decoded string: " + decode);
	}
}
