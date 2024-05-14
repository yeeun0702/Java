package practice;
import java.util.*;

class Student{
	private String name, major,number;
	private double average;
	Student(String name, String major, String number, double average){
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
public class practice05_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String number = st.nextToken().trim();
			double average = Double.parseDouble(st.nextToken().trim());
			
			Student s = new Student(name, major, number, average);
			a.add(s);
		}
		
		Iterator<Student> it = a.iterator();
		while(it.hasNext()) {
			Student student = it.next();
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
			
			for(int i = 0; i < a.size(); i++) {
				Student s = a.get(i);
				if(s.getName().equals(name)) {
					System.out.print(s.getName() + ", ");
					System.out.print(s.getMajor() + ", ");
					System.out.print(s.getNumber() + ", ");
					System.out.println(s.getAverage());
					break;
				}
			}
		}
		scanner.close();
	}

}
