package Ex4_2;

import java.util.Scanner;

class Rectangle{
	int width;
	int height; // 필드
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은" + rect.getArea());
		scanner.close();
	}
}
