package Practice;
import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if( (num1 > (num2 + num3)) || (num2 > (num1 + num3)) || (num3 > (num2 + num1)) ) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
		else 
			System.out.println("삼각형이 됩니다.");
			
		scanner.close();

	}

}
