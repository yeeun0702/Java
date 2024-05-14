package practice;
import java.util.*;

class Location {
	private String name;
	private int longitude, latitude;	//경도, 위도
	public Location(String name, int longitude, int latitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getName() {
		return name;
	}
	public int getLongitute() {
		return longitude;
	}
	public int getLatitude() {
		return latitude;
	}
}
public class practice06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> h = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String word = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(word, ",");
			String name = st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());
			Location l = new Location(name, longitude, latitude);
			h.put(name,l);

		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while(it.hasNext()) {
			String name = it.next();
			Location l = h.get(name);
			System.out.print(l.getName()+" ");
			System.out.print(l.getLongitute() + " ");
			System.out.println(l.getLatitude() + " ");
		}

		while(true) {
			System.out.print("도시 이름 >> ");
			String name = scanner.nextLine();
			if(name.equals("그만")) break;

			Location l = h.get(name);
			if(l == null) {System.out.println(name + "는 없습니다.");}
			else {
				System.out.print(l.getName() + " ");
				System.out.print(l.getLongitute() + " ");
				System.out.println(l.getLatitude());
			}

		}
		scanner.close();
	}

}
