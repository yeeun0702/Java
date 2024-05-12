package Exercise;

import java.util.Vector;

public class Exercise07 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(3);
		for(int i=0; i<10; i++) {
		v.add(i);
		System.out.println(v.capacity()); // 현재 용량 출력
		}


	}

}
