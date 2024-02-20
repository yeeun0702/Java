package checktime;

class A{
	int i;
	int j;
}

class B extends A {
	int k;
	int l;
}

public class ClassCastEx1 {

	public static void main(String[] args) {
		A a = new B();
		B b = (B) a;
//		if( a instanceof b)
//			System.out.print("GO");
		if(b instanceof A)
			System.out.print("STOP");

	}

}
