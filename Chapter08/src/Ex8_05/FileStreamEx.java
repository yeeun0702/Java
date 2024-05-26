package Ex8_05;

import java.io.*;

public class FileStreamEx {
   public static void main(String[] args) {
      byte a[] = {7, 51, 3, 4, -1, 24}; //-128 ~ +127
      byte b[] = new byte[6];

      FileOutputStream fout = null;
      FileInputStream fin = null;

      // test.out 파일에 바이트 스트림으로 바이너리 데이터를 출력
      try {

         fout = new FileOutputStream("C:\\Java1630\\test.out");

         for(int i = 0; i<a.length; i++) {
            fout.write(a[i]);
         }
         fout.close();
      }catch(IOException e) {
         System.out.println("저장 불가");
      }

      //test.out 파일을 읽어서 b[] 배열에 저장한 후, print()로 콘솔로 출력
      try {
         fin = new FileInputStream("C:\\java1630\\test.out");

         //방법1
         /*
         int n = 0;
         int c;
         while( (c = fin.read()) != -1 ) {
            b[n] = (byte)c;
         }
         */
         fin.read();
         for(int i=0; i<b.length; i++) {
        	 System.out.print(b[i] + "");
         }
         fin.close();
            
         
      }catch(IOException e) {
         System.out.println("읽기 실패");
      }
   }

}