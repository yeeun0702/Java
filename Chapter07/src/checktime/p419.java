package checktime;
import java.util.*;

public class p419 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.print(a);
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "ten");
		String val = m.get(10);
		System.out.print(val);

		Vector <Integer> v = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
