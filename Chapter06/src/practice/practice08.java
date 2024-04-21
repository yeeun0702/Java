package practice;
import java.util.*;

public class practice08 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		for(int i=0; i< s.length(); i++ ) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
		scanner.close();
	}

}
