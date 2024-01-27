package Ex4_8;

public class ArrayPassingEx {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ') // 공백문자를 ','로 변경
				a[i] = ',';
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
	char c[]= {'T', 'h', 'i', 's', ' ', 'p', 'e', 'n', 'c', 'i', 'l'}; // 배열 c선언과 동시에 초기화
	printCharArray(c); // 원래 배열 원소 출력
	replaceSpace(c); // 공백 문자 바꾸기
	printCharArray(c); // 수정된 배열원소 출력
	}

}
