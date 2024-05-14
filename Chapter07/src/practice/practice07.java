package practice;
import java.util.*;
public class practice07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> h = new HashMap<String, Double>();
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점 >>");
			String name = scanner.next();
			double grade = scanner.nextDouble();
			h.put(name, grade);
		}
		System.out.print("장학생 선발 학점 기준 입력 >>");
		double standard = scanner.nextDouble();
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			double value = h.get(key);

			if( value>standard ) {
				System.out.print(key + " ");
			}
		}
		scanner.close();
	}

}
