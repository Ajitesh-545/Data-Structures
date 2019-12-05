package LAB03;
import java.util.ArrayList;
import java.util.Scanner;
import LAB03.batsman;

public class experiment1 {
	public static void main(String[] args) {

		ArrayList<batsman> Scoreboard = new ArrayList<batsman>();     
		
		System.out.println("1. Insert a score of a new player. (Name, number of 1s,2s,3s,4s,6s)");
		System.out.println("2. Display scorecard. (display list of top 10 players.)");
		System.out.println("3. Delete a player from scorecard.");
		System.out.println("4. Quit");
		
		int ch = 0;
		while(ch != 4) {
			
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			
			System.out.print("Input Choice : ");
			
			try {
				ch  = sc.nextInt();
			}
			catch (Exception e) {
				ch = 0;
			}
			
			if(ch == 1) {
				
				
				
				batsman b1 = new batsman("sachin", 1, 2, 3, 2, 1);
				batsman b2 = new batsman("dravid", 3, 6, 3, 2, 1);
				batsman b3 = new batsman("mahi", 2, 1, 1, 2, 10);
				batsman b4 = new batsman("kholi", 1,2,3,4,2);
				Scoreboard.add(b1);
				Scoreboard.add(b2);
				Scoreboard.add(b3);
				Scoreboard.add(b4);
				
				System.out.println("Batsmen Recorded");
				
			}
			else if (ch == 2){
				
			
				ArrayList<batsman> CleanBoard = new ArrayList<batsman>(); 
				
				for (int i = 0; i < Scoreboard.size(); i++) {
					batsman b  = new batsman(Scoreboard.get(i));
					if( b.name != null ) {
						CleanBoard.add(b);
					}
				}
				
				ArrayList<batsman> SortedBoard = new ArrayList<batsman>();

				for (int i = 0; i < CleanBoard.size(); i++) {
					
					int max_score = Integer.MIN_VALUE;
					int max_index = -1;
					
					for (int j = 0; j < CleanBoard.size(); j++) {
						batsman b  = CleanBoard.get(j);
						if( b.name != null && b.getScore() >= max_score) {
							max_score = b.getScore();
							max_index = j;
						}
					}

					batsman topB  = new batsman(CleanBoard.get(max_index));
					SortedBoard.add(topB);
					CleanBoard.get(max_index).delete();
					
				}
				
				System.out.println("\n");
				System.out.println(batsman.heading("SCOREBOARD"));
				System.out.println(batsman.header());
				for (int i = 0; i < SortedBoard.size(); i++) {
					System.out.println(SortedBoard.get(i));
				}
				
				System.out.println("\n");
				
			}
			else if (ch == 3) {
				
			
				System.out.print("Enter Name : ");
				String _name = sc2.nextLine();
				Boolean found = false;
				
				for (int i = 0; i < Scoreboard.size() ; i++) {
					
					if(Scoreboard.get(i).name.compareTo( _name ) == 0) {
						Scoreboard.get(i).delete();
						found = true;
						break;
					}
					
				}
				
				if (found) {
					System.out.println("Batsmen Removed");
				}
				else{
					System.out.println("Batsmen Not Found");
				}
				
				
			}
			else if (ch == 4) {
				
				System.out.println("Quitting");
				System.exit(0);
				
			}
			else {
				
				System.out.println("Invalid Choice");
				
			}

		}
		

	}
}