package Ex8_05;
import java.io.*;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b [] = {7,51,3,4,-1, 24};		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\java1630.out");
			

			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch(IOException e) {
			System.out.println("C:\\java1630.out에 저장할 수 없었습니다. 경로명을 확인해주세요.");
			
			return;
		}
		System.out.println("C:\\java1630.out을 저장하였습니다.");

	}

}
