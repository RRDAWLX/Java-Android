import java.net.MalformedURLException;
import java.net.*;


public class URLDemo {
	public static void main(String[] args) throws Exception{
		/*InetAddress locAdd = InetAddress.getLocalHost();
		System.out.println(locAdd.getHostName() + "\t" + locAdd.getHostAddress());
		
		InetAddress remAdd = InetAddress.getByName("www.jstv.com");
		System.out.println(remAdd.getHostName() + "\t" + remAdd.getHostAddress());*/
		InetAddress[] addArr = InetAddress.getAllByName("www.net.cn");
		for(int i = 0; i < addArr.length; i++){
			System.out.println(addArr[i].getHostName());
		}
	}
}
