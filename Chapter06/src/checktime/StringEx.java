package checktime;

public class StringEx {

	public static void main(String[] args) {
		int count = 0;
		String x = "My name is Tom";
		for(int i=0; i<x.length(); i++) {
			if(x.charAt(i)==' ')
				count++;
		}
		System.out.println(count);
		
		
		String s = "AbCDEFg";
		System.out.println(s.toLowerCase());
		
		String a = "abcdefg12345";
		System.out.println(a.charAt(3));
		
		System.out.println("자바" + 3.14 + false + 'a');

	}

}
