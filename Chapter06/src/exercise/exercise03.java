package exercise;

public class exercise03 {

	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6" ,",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
