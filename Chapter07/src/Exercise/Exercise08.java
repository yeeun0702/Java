package Exercise;

import java.util.ArrayList;

public class Exercise08 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(10);
		a.add("Java");
		System.out.println(a);
		a.add(0,"C++");
		System.out.println(a);
		int len = a.size();
		System.out.println(len);
		a.remove(len-1);
		System.out.print(a);

	}

}
