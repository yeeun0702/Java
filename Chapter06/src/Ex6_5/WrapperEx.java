/* 추가로 배운 메소드
 
 * java.lang.Character
 * boolean isDigit(char c) // 전달받은 문자가 숫자면 true 아니면 false
 * boolean isLetter(char c)// 전달받은 문자가 문자면 true 아니면 false
 * boolean isAlphabetic(char c) // 전달받은 문자가 영문자면 true 아니면 false
 * boolean isWhiteSpace(char c)  // 전달받은 문자가 공백문자면 true 아니면 false
 * boolean isUpperCase(char c) // 전달받은 문자가 대문자면 true 아니면 false
 * boolean isLowerCase(char c) /  전달받은 문자가 소문자면 true 아니면 false
 * char toUpperCase(char c) // 전달받은 문자를 대문자로 변환
 * char toLowerCase(char c) // 전달받은 문자를 소문자로 변환
* */

package Ex6_5;


public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
		
		char c1 ='4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c1))
			System.out.println(c1 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));


	}

}
