import java.io.*;

public class Main {
	public static int min(int a, int b){
		int A = a;
		int B = b;
		if(A > B)
			return b;
		else return a;
	}
	
	public static void calculate(int n, int x, int y, int a, int b){
		int games, male, female, gapM, gapF;
		games = n;
		male = x;
		female = y;
		gapM = a;
		gapF = b;
		int choice = 0;
		int min = min(gapM, gapF);
		int heros = male + female;
		int heroCount = heros;
		for(int i = 0; i < heros; i++){
			choice += heroCount-- % 10007;
		}
		int rest = games - heros;
		for(int i = 0; i < rest; i++){
			choice += rest % 10007;
		}
		System.out.println(choice);
	}
	
	public static void main(String[] args){
		//String sysInputFile = "{sysFileUrl}";
		String sysInputFile = "Text.txt";
		int lines;
        try {
            File file = new File(sysInputFile);
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            lines = in.readInt();
            System.out.println("lines" + lines );
            int n = 0, x = 0, y = 0, a = 0, b = 0;
            for(int i = 0; i < lines; i++){
            	n=in.readInt();
            	x=in.readInt();
            	y=in.readInt();
            	a=in.readInt();
            	b=in.readInt();
            	calculate(n,x,y,a,b);
            }
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
	}
}
