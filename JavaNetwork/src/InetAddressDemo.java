import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressDemo {
	public static void main(String[] args) throws Exception{
		InetAddress locAdd = InetAddress.getLocalHost();
		InetAddress remAdd = InetAddress.getByName("www.jstv.com");
		
		System.out.println("local host name: " + locAdd.getHostName());
		System.out.println("local host IP: " + locAdd.getHostAddress());
		
		System.out.println("remote host name: " + remAdd.getHostName());
		System.out.println("remote host IP: " + remAdd.getHostAddress());
		
		System.out.println("remote host is available? " + (remAdd.isReachable(5000)?"Yes :)":"No :("));
	}
}
