package checktime;
import java.util.*;

public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("하나", 1);
		h.put("둘", 2);
		h.put("셋", 3);
		h.put("넷", 4);
		int value1 = h.get("하나"); // 키로 값 읽기
		System.out.println(value1);
		
		Set<String> keys = h.keySet(); // 해시맵 h에 있는 모든 키를 Set 컬렉션으로 리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = h.get(key);
			System.out.print(key);
			System.out.println(value);
	}
	}

}
