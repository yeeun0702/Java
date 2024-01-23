package Ex4_4;

public class Book{
	String title; // 필드
	String author;


	public Book(String t) { //  생성자 (매개변수가 하나)
		title = t;
		author = "작자미상";
	}


	public Book(String t, String a) {  //  생성자 (매개변수가 두 개)
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐페리"); // 생성자 Book(String t, String a) 호출

		Book loveStory = new Book("춘향전"); // 생성자 Book(String t) 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

	}

}
