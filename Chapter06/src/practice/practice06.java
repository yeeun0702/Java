package practice;
import java.util.*;

class Enters{
	private Scanner scanner;
	private Calendar now;
	private String enter;
	private int time;
	public int enter() {
		scanner = new Scanner(System.in);
		enter = scanner.nextLine();
		now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.print("현재 초 시간= ");
		return time;
	}
}


public class practice06 {

	public static void main(String[] args) {
		String names[] = {"황기태", "이재문"};
		Enters enter = new Enters();
		int time1, time2;
		int times[] = new int[2];

		System.out.println("10초에 더 가까운 사람이 이기는 게임입니다.");

		for(int i=0; i<2; i++) {
			System.out.print(names[i] + " 시작 <Enter>키 >>");
			time1 = enter.enter();
			System.out.print(names[i] + " 10초 예상 후 <Enter>키 >>");
			time2 = enter.enter();
			if(time1 > time2)
				times[i] = (60 - time1) - time2;
			else
				times[i] = time1 - time2;
		}

		times[0] = Math.abs(times[0]);
		times[1] = Math.abs(times[1]);
		if(times[0] > times[1])
			System.out.println("황기태의 결과 "+times[0]+", 이재문의 결과 "+times[1]+", 승자는 황기태");
		else
			System.out.println("황기태의 결과 "+times[0]+", 이재문의 결과 "+times[1]+", 승자는 이재문");


	}

}

