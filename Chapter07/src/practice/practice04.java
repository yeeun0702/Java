package practice;
import java.util.Scanner;
import java.util.Vector;

public class practice04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int sum = 0 ;
			System.out.print("강수량 입력(0 입력시 종료) : ");
			int n = scanner.nextInt();
			if(n==0) break;
			v.add(n);
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");
				sum += v.get(i);
			}
			System.out.println("");
			System.out.println("현재평균 " + sum/v.size());
		}
		scanner.close();
	}

}
