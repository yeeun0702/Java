package Ex8_07;
import java.util.*;
import java.io.*;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Java1630\\test2.out");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c=fin.read()) != -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
