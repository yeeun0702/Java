package practice;
import java.util.*;
import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)");
		
		for(int i=0; i<6; i++) {
			char grade = scanner.next().charAt(0);
			a.add(grade);
		}
		
		double sum =0 ;
		for(int i=0; i<6; i++) {
			if(a.get(i).equals('A')) sum += 4.0;
			else if(a.get(i).equals('B')) sum += 3.0;
			else if(a.get(i).equals('C')) sum += 2.0;
			else if(a.get(i).equals('D')) sum += 1.0;
			else if(a.get(i).equals('F')) sum += 0.0;
			
		}
		System.out.println(sum / 6);
		scanner.close();
	}

}
