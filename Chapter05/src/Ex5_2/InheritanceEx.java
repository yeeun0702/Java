package Ex5_2;

class Person{
	private int weight; // Student 클래스에서 접근 불가 . private는 오직 현재의 클래스의 맴버들에게만 접근가능.
	int age; // 디폴트 접근 지정. 같은 패키지 내의 클래스와 서브 클래스에서 접근 가능
	protected int height; // 현재 클래스의 상속을 받는 클래스는 모두 다 접근 가능. BUT 상속받지 않는 다른 패키지 클래스에서는 접근 불가능
	public String name; //모든 클래스 접근 가능
	
	public void setWeight(int weight) { // private 맴버인 weight에서 접근하기 위한 메소드
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}	
}

class Student extends Person{
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 맴버 접근 가능
		name = "홍길동"; // 슈퍼 클래스의 public 맴버 접근 가능
		height = 175; // 슈퍼 클래스의 protected 맴버 접근 가능
		// weight = 99; // 오류. 슈퍼클래스의 private 맴버는 접근 불가능
		setWeight(99); // private 맴버 weight은 setWeight로 간접 접근
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
	Student s = new Student();
	s.set();

	}

}
