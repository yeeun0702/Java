package Exercise;

import java.util.HashMap;

public class Exercise10 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("a", 10);
		h.put("b", 20);
		System.out.println(func(h));
	}

	private static int func(HashMap<String, Integer> h) {
		// TODO Auto-generated method stub
		return h.size();
	}

}