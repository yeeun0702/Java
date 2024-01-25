package Ex4_6;

public class Circle1 {
    //필드
    int radius;
    //생성자
    public Circle1(int radius) {
       this.radius = radius;
    }
    //메소드
    public double getArea() {
       return 3.14*radius*radius;
    }
}