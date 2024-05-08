package Ex7_10;

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


public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp;
			tmp = a.pop();
			if(tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
		
	}	
	
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs=reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
