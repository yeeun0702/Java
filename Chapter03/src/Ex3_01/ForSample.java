package Ex3_01;

public class ForSample {

	public static void main(String[] args) {
		int sum=0;

		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.print(i); //  더하는 수 출력
			if(i<=9)
				System.out.print("+"); // '+' 출력
			else {
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}

		}

	}

}
