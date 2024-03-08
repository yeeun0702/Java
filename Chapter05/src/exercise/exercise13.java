package exercise;

abstract class Shape{
	public void paint() { draw();}
	abstract public void draw();
}

class Circle1 extends Shape{
	private int radius;
	public Circle1(int radius) {this.radius = radius;}
	double getArea() {
		return 3.14 * radius * radius;
	}
	public void draw() {
		System.out.print("반지름= " + radius);
	}
}


public class exercise13 {
	public static void main(String[] args) {
		Circle1 p = new Circle1(10);
		p.paint();

	}

}
