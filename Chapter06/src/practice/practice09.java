package practice;

import java.util.*;

class Player {
	private String name;
	private Scanner scanner = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public int turn() {
		System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		return  scanner.nextInt();
	}
}

class Computer extends Player{
	public Computer(String name) {
		super(name);
	}
	public int turn() {
		return (int)(Math.random() * 3 + 1);        
	}	
}


class Kawibawibo {
	private final String s[] = {"    ", "    ", "  "};
	private Player [] players = new Player[2];

	public Kawibawibo() {
		players[0] = new Player("ö  ");
		players[1] = new Computer("  ǻ  ");
	}

	public void run() {
		int userChoice, computerChoice;
		while (true) {
			userChoice = players[0].turn(); // ö       
			if (userChoice == 4) 
				break; //            

			computerChoice = players[1].turn(); //   ǻ       

			if (userChoice < 1 || userChoice > 3) { 
				System.out.println(" ߸   Է  ϼ̽  ϴ .");
			} 
			else {
				System.out.print(players[0].getName() + "(" + s[userChoice-1] + ")" + " : ");				
				System.out.println(players[1].getName() + "(" + s[computerChoice-1] + ")");

				int diff = userChoice - computerChoice; 
				switch (diff) {
				case 0: //                 
					System.out.println("     ϴ .");
					break;
				case -1:       
				case 2:  
					System.out.println(players[1].getName()+"    ̰   ϴ .");
					break;
				case 1: //     ڰ      ,   ǻ Ͱ        Ǵ      ڰ    ,   ǻ Ͱ      
				case -2: //     ڰ      ,   ǻ Ͱ    
					System.out.println(players[0].getName()+"    ̰   ϴ .");
				}
			}
		}	
	}


	public class practice09 {		
		public static void main (String[] args) {
			Kawibawibo game = new Kawibawibo();
			game.run();
		}
	}
}
