package Exercise;


class Power{ // 메소드를 사용한 방법
	private int kick = 0;
	private int punch= 0;

	public void kickpunch(int k, int p) {
		this.kick =k;
		this.punch = p;
	}
}


public class Example8 {

	public static void main(String[] args) {
		Power robot = new Power();
		robot.kickpunch(10,20);
	}

}
