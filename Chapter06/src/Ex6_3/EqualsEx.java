package Ex6_3;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj; // 객체 obj를 Point 타입으로 다운 캐스팅
		if(x ==p.x && y == p.y) return true;
		else return false;
	}
}


public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
//		if(a==b)
//			System.out.println("a==b");
//		if(a.equals(b))
//			System.out.println("a is equal to b");
//		if(a.equals(c))
//			System.out.println("a is equal to c");

	}

}
