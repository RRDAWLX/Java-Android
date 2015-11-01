import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPClient {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket(9000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		
		System.out.println("Waitting to receive data.");
		
		ds.receive(dp);
		String str = new String(dp.getData(), 0, dp.getLength()) + " from "
				+ dp.getAddress().getHostAddress() + " : " + dp.getPort();
		System.out.println(str);
		ds.close();
	}
}
