package exercise;

abstract class OddDectector{
	protected int n;
	public OddDectector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd(); // 홀수이면 true 리턴
}

public class exercise10 extends OddDectector{
	public exercise10(int n) {
		super(n);
	}
	
	public boolean isOdd() {
		if (n % 2 == 1)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		exercise10 b = new exercise10(10);
		System.out.println(b.isOdd());

	}
}

