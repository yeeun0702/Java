package exercise;

interface Device {
	void on();
	void off();
}

public class exercise16 implements Device {

	public void on() {
		System.out.println("켜졌습니다.");
	}
	
	public void off() {
		System.out.println("꺼졌습니다.");
	}
	
	public void watch() {
		System.out.println("방송중입니다.");
	}
	
	public static void main(String[] args) {
		exercise16 myTV = new exercise16();
		myTV.on();
		myTV.watch();
		myTV.off();
		

	}

}
