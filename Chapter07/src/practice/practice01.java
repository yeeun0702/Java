package practice;
import java.util.*;
public class practice01 {

	public static void printBig(Vector<Integer> v) {
		int big = v.get(0);
		for(int i =1; i<v.size();i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("가장 큰 수는 " + big);
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지): ");
		while (true) {
					
			int n = scanner.nextInt();
			if(n==-1)
				break;				
			v.add(n);	
		}
		printBig(v);
		scanner.close();
		}
	
	}


