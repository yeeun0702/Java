package Ex2_4;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in); // new 연산자를 통해 Scanner 객체를 생성 앞의 scanner는 일종의 이름에 해당
		
		String name = scanner.next(); // 문자열 읽기
		System.out.println("이름은 " + name + ",");
		
		String city = scanner.nextLine(); //  문자열 읽기
		System.out.println("도시는 " + city + ",");
		
		int age= scanner.nextInt(); //  정수 읽기
		System.out.println("도시는 " + age + "살,");
		
		double weight = scanner.nextInt(); //  실수 읽기
		System.out.println("도시는 " + weight + "kg,");

		boolean isSingle = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는" +isSingle + "입니다.");
		scanner.close(); // scanner 객체닫기
	}

}
