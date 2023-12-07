package Ex2_15;
import java.util.Scanner;
public class CoffePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("무슨 커피 드릴까요?: ");
		String order = scanner.next();
		
		int price = 0;
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3000;
			break;
		case "아메리카노":
			price = 2500;
		}
		System.out.println(order + "는 " + price + "원 입니다.");
		scanner.close();
	}

}
