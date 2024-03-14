package practice;

class Point{
	private int x,y;
	public Point(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x =x; this.y=y;}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) { // 생성자
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);}
	
	public String setColor(String color) {return color;}
	public String toString() {return color + "색의 " + "(" + getX() + "," + getY() + ")"+ "의 점" ;}
	
}

public class practice05 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5, "Yello");
		cp.setXY(10,20);
		cp.setColor("Red");
		String str = cp.toString();
		System.out.println(str + "입니다");

	}

}
