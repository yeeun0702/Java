package practice;
import java.util.Scanner;

class Circle2{
	private double x,y;
	private int radius;
	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {		
		System.out.println("(" + x + "," + y + ")"+ radius);
	}

	public int getRadius() {
		return radius;
	}
}


public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle2 c[]= new Circle2[3];
		int max =0;
		for(int i=0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle2(x, y, radius); // Circle 객체 생성 ( 생성자로 호출하기)
		}
		for (int i = 0; i<c.length; i++) {
			if(max<c[i].getRadius())  {
				max = c[i].getRadius();}
		}
		for (int i = 0; i<c.length; i++) {
			if(max == c[i].getRadius()) {
				System.out.println("가장 면적인 큰 원은");
				c[i].show();}

		}
		scanner.close();


	}
}








