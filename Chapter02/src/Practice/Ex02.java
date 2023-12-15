package Practice;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수입력>>");
		
		int n = scanner.nextInt();
		
		if(n%10 == n/10) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		scanner.close();

	}

}
