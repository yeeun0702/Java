package practice;

class ColorPoint2 extends Point{
	ColorPoint2(){
		super(0,0);
		this.color = "Black";
	}
	
	ColorPoint2(int x, int y){
		super(x, y);
		this.color = "Black";
	}
	
	private String color;
	public void setColor(String color){
		this.color = color;
	}
	public void setXY(int x, int y) {move(x,y);}
	public String toString() {
		return color + "색의 "+ "("+  getX()+ ","+ getY()+ ")"+ "의 점";
	}	
}

public class practice06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString()+ "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
