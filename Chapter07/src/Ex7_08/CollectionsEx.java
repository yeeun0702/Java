package Ex7_08;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) { // 리스트의 요소를 모두 출력하는 메소드
		
		Iterator<String> iterator = l.iterator(); //Iterator 객체 리턴
		while(iterator.hasNext()) { // Iterator 객체에 요소가 있을 때까지 반복
			String e = iterator.next(); // 다음 요소 리턴
			String seperator;
		if(iterator.hasNext()) // 마지막 요소가 아니면 출력
			seperator = "->";
		else
			seperator = "\n"; // 마지막 요소면
		System.out.print(e + seperator); //  줄바꿈
		}
			
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("메트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "요소입니다.");

		

	}

}
