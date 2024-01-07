package Ex3_07;
import java.util.Scanner;

public class ArrayAccess2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[]= new int[5];

		//입력하는 코드   
		System.out.println("양수 5개를 입력하세요");
		for(int i =0; i< intArray.length; i++) {
			intArray[i] = scanner.nextInt();      
		}
		int max = intArray[0]; // 음수를 입력했을 경우에는 배열의 첫 번째 원소로 값을 두는 것이 나음
		int min =  intArray[0];
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]>max)
				max =intArray[i];
			if(intArray[i] < min)
				min = intArray[i];
		}
		System.out.println("최댓값: " +max);
		System.out.println("최솟값: " +min);
		
		scanner.close();
	}
}