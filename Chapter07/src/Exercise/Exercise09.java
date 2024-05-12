package Exercise;

import java.util.Iterator;
import java.util.Vector;

public class Exercise09 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<0; i++) v.add(i);
		
		Iterator<Integer> it = v.iterator(); // Iterator 레퍼런스 얻기
		while(it.hasNext())  {// it가 가리키는 객체가 있는 동안 루프
			int n = it.next(); // 하나씩 알아내기
			System.out.print(n + " "); // 출력
			/* for(int i=0; i<v.size(); i++)
			System.out.print(v.get(i) + " "); */
		}
	}
}



