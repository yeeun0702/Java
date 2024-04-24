package Ex7_01;

import java.util.Vector;

public class VecterEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println("백터내의 요소 객체 수" + v.size());
		System.out.println("백터의 현재 용량 " + v.capacity());
		
		// 모든 요소 정수 출력
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		
		System.out.println("백터에 있는 정수 합 : " + sum);
		

	}

}
