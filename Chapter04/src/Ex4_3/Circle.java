package Ex4_3;

public class Circle {
	// 필드
	int radius;
	String name;


	public Circle() { // 매개 변수 없는 생성자, 생성자의 이름은 클래스 이름과 동일
		radius = 1; name= ""; // 필드 초기화
	}
	public Circle(int r, String n) { // 매개변수를 가진 생성자
		radius = r; name = n; // 필드 초기화
	}

	// 메소드
	public double getArea() {
		return 3.14 * radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); // 객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화

		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);

		Circle donut = new Circle(); //  객체 생성 반지름을 1, 이름을 ""로 초기화
		donut.name = "도넛피자"; // 이름변경
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은" +area );


	}

}

