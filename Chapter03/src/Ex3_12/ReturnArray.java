package Ex3_12;

public class ReturnArray {
	static int[] makeArray() { // 정수형 배열을 리턴하는 메소드
		int temp[] = new int[4]; // 배열 생성
		for(int i=0; i<temp.length; i++)
			temp[i] = i; // 배열의 원소를 0,1,2,3 으로 초기화
		return temp; // 배열 리턴
	}

	public static void main(String[] args) {
		int intArray[]; // 배열의 래퍼러스 변수 선언
		intArray = makeArray();
		for(int i=0; i< intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
	}

}
