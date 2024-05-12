package Exercise;

class JGeneric<W>{
	private W x,y;
	public JGeneric(W x, W y) {this.x = x; this.y = y;}
	
	public W first() {return x;}
	public W second() {return y;}
	
	public boolean equal() {
		if(this.x == this.y)
			return true;
		else
			return false;
	}
}


public class Exercise11 {

	public static void main(String[] args) {
		JGeneric<String> st = new JGeneric<String>("hello", "hello");
		System.out.println(st.first());
		System.out.println(st.second());
		System.out.println(st.equal());
	}

}
