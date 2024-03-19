package checktime;

public class Bufferclass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name");
		sb.append(" is Tom");
		sb.append(".");
		System.out.println(sb);
		
		StringBuffer ab = new StringBuffer("I am your man.");
		ab.insert(4, " "+ "not");
		System.out.println(ab);

	}

}
