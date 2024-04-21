package practice;

import java.util.*;

public class practice07_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){

			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("그만")){
				System.out.println("종료합니다...");
				break;
			}
			String [] words = text.split(" ");
			System.out.println("어절의 개수는 " + words.length);
		}
		scanner.close();

	}


}
