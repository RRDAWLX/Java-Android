import java.net.URL;
import java.net.URLConnection;


public class URLConnectionDemo {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://finance.jstv.com");
		URLConnection urlCon = url.openConnection();
		System.out.println("content type: " + urlCon.getContentType());
		System.out.println("content length: " + urlCon.getContentLength());
	}
}
