package practice;

class Point3D extends Point{
	private int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z =z;

	}
	public void moveUp() {
		this .z = z+ 1; // z++
	}
	public int getZ() { return z; }
	
	public void moveDown() {
		this .z = z- 1; // z--
	}
	public String toString() {return "(" + getX()+ "," +getY()+ "," +getZ()+")"+"의 점";}
	
	protected void move(int x, int y, int z) {move(x,y); this.z =z;}
}


public class practice07 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}

}
