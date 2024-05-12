package Exercise;

class JClass{
	static <T> T take(T s[], int index) {
		if(index > s.length) {
			System.out.println("인덱스 범위를 벗어났습니다.");
			return null;
		}
		return s[index];
	}
}

public class Exercise12 {

	public static void main(String[] args) {
		String [] text = {"Java", "C++", "C#"};
		System.out.println(JClass.take(text, 1));
		System.out.println(JClass.take(text, 5));
		

	}

}
