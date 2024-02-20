package checktime;

class SuperObject{
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject{
	@Override
	public void paint() {
		super.draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Sub Object");
	}
}
public class sample {

	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
		
		SubObject c = new SubObject();
		c.paint();

	}

}
