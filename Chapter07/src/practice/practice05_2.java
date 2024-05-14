package practice;
import java.util.*;

class Student2{
	private String name, major,number;
	private double average;
	Student2 (String name, String major, String number, double average){
		this.name = name;
		this.major= major;
		this.number=number;
		this.average=average;
			
	}
	public String getName() {return name;}	
	public String getMajor() {return major;}
	public String getNumber() {return number;}
	public double getAverage() {return average;}
	
}
public class practice05_2 {

	public static void main(String[] args) {
		HashMap<String, Student2> h = new HashMap<String, Student2>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0; i<4; i++) {
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String number = st.nextToken().trim();
			double average = Double.parseDouble(st.nextToken().trim());
			
			Student2 s = new Student2(name, major, number, average);
			h.put(name, s);
		
		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student2 student = h.get(name);	//이름을 키로 하여 객체를 얻는다.
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getNumber());
			System.out.println("학점평균:" + student.getAverage());
			System.out.println("---------------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine();
			if(name.equals("그만")) break;
			
			Student2 student = h.get(name); // 해시맵에서 이름을 키로 검색
			if(student == null) { // 이름이 해시맵에 없다면
				System.out.println(name + " 학생 없습니다.");
			}
			else { // 해시맵에서 검색된  Student 객체
				System.out.print(student.getName() + ", ");
				System.out.print(student.getMajor() + ", ");
				System.out.print(student.getNumber() + ", ");
				System.out.println(student.getAverage());
			}
		}
		scanner.close();

	}

}
