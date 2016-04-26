package Kabasuji;

import java.io.IOException;
import java.util.ArrayList;

import view.MainMenuView;

/**
 * @author xavier
 *
 */
public class Kabasuji {
	ArrayList<Lightning> llevels = new ArrayList<Lightning>();
	ArrayList<Puzzle> plevels = new ArrayList<Puzzle>();
	ArrayList<Release> rlevels = new ArrayList<Release>();
	Badge badges[] = new Badge[10];
	
	
	public Kabasuji(){
		badges[0] = new Badge("Electric Shock", "Completed Lightning in 35s");
		badges[1] = new Badge("Thunderbird", "Completed Lightning in (No. of Blocks/6)+1");
		badges[2] = new Badge("Lightning God", "Completed Lightning in less than 25 seconds (half time)");
		badges[3] = new Badge("Bird", "completed Puzzle in birdie (-1 of the allowed number of moves");
		badges[4] = new Badge("Eagle", "completed Puzzle in eagle (-2 of the allowed number of moves) ");
		badges[5] = new Badge("Sword and Shield ", "completed Puzzle level without having rotated a piece");
		badges[6] = new Badge("Baseball (Strike Out) ", "completed Puzzle failed to complete the level three times in a row ");
		badges[7] = new Badge("Joker", "Put a piece on release level that does not touch any number");
		badges[8] = new Badge("Magician ", "Acquired two sets of number in release level");
		badges[9] = new Badge("Sage", "completed level 5 of release level");
	}

	public static void main(String[] args) throws IOException {
		Kabasuji kabasuji = new Kabasuji();
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt",kabasuji);
		try {
			kabasuji = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    log("Done.");
	    
	    MainMenuView mainMenu = new MainMenuView(kabasuji);
	    mainMenu.setVisible(true);
	}
	
	public void resetBadges(){
		/*Add logic here*/
		return;
	}
	
	public void playLevel(PieceType type, int lvl){
		if(type == PieceType.LIGHTNING)
			llevels.get(lvl - 1).initialize();
		else if(type == PieceType.PUZZLE)
			plevels.get(lvl - 1).initialize();
		else if(type == PieceType.RELEASE)
			rlevels.get(lvl - 1).initialize();
	}
	
	public Level getLevel(PieceType type, int lvl){
		if(type == PieceType.LIGHTNING)
			return llevels.get(lvl - 1);
		else if(type == PieceType.PUZZLE)
			return plevels.get(lvl - 1);
		else
			return rlevels.get(lvl - 1);
	}
	
	public Badge getBadge(int badge){return badges[badge - 1];}
	
	private static void log(Object aObject){
	    System.out.println(String.valueOf(aObject));
	  }
}
