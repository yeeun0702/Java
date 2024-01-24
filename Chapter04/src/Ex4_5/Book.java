package Ex4_5;

public class Book {
	String title;
	String author; // 필드
	
	void show() {
		System.out.println(title + " " + author);}
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book (String title) {
		this(title, "작자미상");
		
//		this.title = title;
//		this.author = "작자미상"; 이렇게도 작성 가능하지만 매개변수가 두 개인 생성자로 코드 정리
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		loveStory.show();

	}

}
