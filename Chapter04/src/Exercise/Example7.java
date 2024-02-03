package Exercise; // 연습문제 7번

class Person{
	private int age =0 ; // 는 age가 private으로 선언되어 있기 때문에, Person 클래스 바깥의 main() 메소드에서는 접근 불가능
	
	public Person() {}
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		if (age < 0) {
			return;
		}		
		this.age = age;
	}
	

}


public class Example7 {

	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.setAge(22);
	}

}
