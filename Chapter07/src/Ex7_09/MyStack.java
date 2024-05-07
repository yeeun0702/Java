package Ex7_09;

class GStack<T> { // 제네릭 스택 선언. 제네릭 타입 T
	int tos;
	Object [] stck; // 스택에 요소를 저장할 공간 배열
	public GStack() {
		tos =0;
		stck = new Object[10]; /* 제네릭 매개변수로 객체를 생성하거나 배열을 생성할 수 없으므로 
		Object 배열을 생성하여 실제 타입의 객체를 요소로 삽입.*/
		}
	
	public void push(T item) {
		if(tos == 10) // 스택이 꽉 차서 더 이상 요소를 삽입할 수 없음.
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos == 0) // 스택이 비어있어 꺼낼 요소가 없음
			return null;
		tos--;
		return(T) stck[tos]; // 타입 매개변수 타입으로 캐스팅
	}
}

public class MyStack {

	public static void main(String[] args) {
		GStack<String> st = new GStack<String>();
		st.push("Seoul");
		st.push("Busan");
		st.push("LA");
		
		for(int n=0; n<3; n++) {
			System.out.println(st.pop());
		}
		GStack<Integer> sl = new GStack<Integer>();
		sl.push(1);
		sl.push(2);
		sl.push(3);
		
		for(int n=0; n<3; n++) {
			System.out.println(sl.pop());
		}
		
		
		
	}

}
