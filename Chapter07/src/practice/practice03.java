package practice;

import java.util.Scanner;
import java.util.*;

public class practice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
		
		while(true) { // 나라 입력
			System.out.print("나라이름, 인구 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) break;
			int population = scanner.nextInt();
			nations.put(nation, population);
			
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			Integer n = nations.get(nation); // 키로 value값 찾기
			if(n == null)
				System.out.println(nation + " 나라는 없습니다.");
			else
				System.out.println(nation + "의 인구는 " + n);
		}
		
		scanner.close();
	}

}
