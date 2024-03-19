package checktime;

import java.util.StringTokenizer;

public class StringTokenclass {

	public static void main(String[] args) {
		String s = "냉장고,세탁기,에어컨,TV,오디오";
		StringTokenizer st = new StringTokenizer(s, ",");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());


		}
			
		
	}

