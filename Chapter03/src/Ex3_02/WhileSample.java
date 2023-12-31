package Ex3_02;
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		int count=0; // count는 입력된 정수
		int sum=0; // sum은 합
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = scanner.nextInt(); // 정수입력
		while(n != -1){
			sum += n; // sum에 입력 받은 정수를 더하기
			count++; // 입력된 정수의 개수 증가
			n= scanner.nextInt(); // 정수 입력

		}
		if(count == 0)
			System.out.println("입력된 정수가 없습니다.");
		else {
			System.out.print("정수의 개수는" + count + "개이며");
			System.out.println("평균은" + (double)sum/count + "입니다.");

		}
		scanner.close();
	}

}
