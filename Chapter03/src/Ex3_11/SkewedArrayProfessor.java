package Ex3_11;

import java.util.Scanner;

public class SkewedArrayProfessor {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int intArray[][] = new int[4][];
      intArray[0] = new int[3];
      intArray[1] = new int[2];
      intArray[2] = new int[3];
      intArray[3] = new int[2];

      
      //배열 원소 입력
      for (int i=0; i<intArray.length; i++) {
         for (int j=0; j<intArray[i].length; j++) {
            System.out.print("[" + i+ "]" + "[" + j + "] 원소 입력: ");
            intArray[i][j] = scanner.nextInt();
         }
         System.out.println();
      }
      
      //배열 원소 출력
      for (int i=0; i<intArray.length; i++) {
         for (int j=0; j<intArray[i].length; j++) {
            System.out.print(intArray[i][j] + " ");
         }
         System.out.println();   
      }
      scanner.close();
   }
}