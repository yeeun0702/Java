package practice;
import java.util.*;

public class practice07_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){
			
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("그만")){
				System.out.println("종료합니다...");
				break;}
			StringTokenizer st = new StringTokenizer(text, " ");
			System.out.print("어절 개수는 " + st.countTokens());
			System.out.println("");
			}
			scanner.close();
	}

}
