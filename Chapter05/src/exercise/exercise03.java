package exercise;

class Pen{ // 모든 펜의 공통속성
private int amount; // 남은 양
	
	public int getAmount() { return amount; }
	public void setAmount(int amount) {this.amount = amount;}
}

class SharpPencil extends Pen{ // 샤프 펜슬
	private int width; // 펜의 굵기	
}

class Ballpen extends Pen{
	private String color; // 볼펜의 색
	public String getColor(){return color;}
	public void setColor(String color) {this.color = color;}	
}

class FountainPen extends Ballpen {
	public void refill(int n) {setAmount(n);}
}

public class exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
