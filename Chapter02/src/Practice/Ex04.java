package Practice;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력 ");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if( x < y) {
			if(x < z) {
				System.out.println("중간값은 " + y + "입니다." );
			}
			else
				System.out.println("중간값은 " + x + "입니다." );
		}
		
		else
			if(y < z) {
				System.out.println("중간값은 " + x + "입니다." );
			}
			else
				System.out.println("중간값은 " + y + "입니다." );		
		scanner.close();

	}

}
