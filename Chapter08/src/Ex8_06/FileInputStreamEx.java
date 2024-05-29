package Ex8_06;
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Java1630\\test.out");
			int n=0, c ;
			while((c=fin.read()) != -1) { // -1은 파일 끝
				b[n] = (byte)c; // 읽은 바이트를 배열에 저장
				n++;
			}
			
			System.out.println("");
			for(int i=0; i<b.length; i++) 
				System.out.println(b[i] + "");
			System.out.println();
			
			fin.close();
			} catch(IOException e) {
				System.out.println("C:\\Java1630\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요.");
			}
		

	}

}
