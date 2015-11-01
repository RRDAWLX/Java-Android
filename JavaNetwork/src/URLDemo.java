import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;


public class URLDemo {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://finance.jstv.com");
		InputStream input = url.openStream();
		Scanner scan = new Scanner(input);
		scan.useDelimiter("\n");
		
		File file = new File("D:\\finance.html");
		if(!file.exists()){
			file.createNewFile();
		}
		
		OutputStream output = new FileOutputStream(file);
		
		while(scan.hasNext()){
			output.write(scan.next().getBytes());
		}
		
		input.close();
		output.close();
	}
}
