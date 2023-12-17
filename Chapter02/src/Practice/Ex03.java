package Practice;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>> ");

		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		
		if(price != 0)
		System.out.println("오만원 권" + price/50000 + "매");
		price = price % 50000;
		
		System.out.println("만원 권" + price/10000 + "매");
		price = price % 10000;
		
		System.out.println("천원 권" + price/1000 + "매");
		price = price % 1000;
		
		System.out.println("오십원" + price/50 + "개");
		price = price % 50;
		
		System.out.println("십원" + price/10 + "개");
		price = price % 10;
		
		System.out.println("일원" + price/1 + "개");

		

		scanner.close();

	}

}
