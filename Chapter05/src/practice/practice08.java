package practice;

class PositivePoint extends Point{
	PositivePoint(){super(0,0);}
	PositivePoint(int x, int y){
		super(x,y);
	}
	
	@Override
	protected void move(int x, int y) {
	}
	public String toString() {
		return "("+  getX()+ ","+ getY()+ ")"+ "의 점";
	}
}

public class practice08 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, -5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
	}

}
