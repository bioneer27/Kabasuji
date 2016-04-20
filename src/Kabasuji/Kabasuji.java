package Kabasuji;

import java.io.IOException;
import java.util.ArrayList;

import view.MainMenuView;

public class Kabasuji {
	ArrayList<Lightning> llevels = new ArrayList<Lightning>();
	ArrayList<Puzzle> plevels = new ArrayList<Puzzle>();
	ArrayList<Release> rlevels = new ArrayList<Release>();
	Badge badges[] = new Badge[10];
	
	
	public Kabasuji(){
		badges[0] = new Badge("BADGEONE", "YOU ARE DA BEST");
		badges[1] = new Badge("BADGETWO", "YOU ARE DA BEST");
		badges[2] = new Badge("BADGETHREE", "YOU ARE DA BEST");
		badges[3] = new Badge("BADGEFOUR", "YOU ARE DA BEST");
		badges[4] = new Badge("BADGEFIVE", "YOU ARE DA BEST");
		badges[5] = new Badge("BADGESIX", "YOU ARE DA BEST");
		badges[6] = new Badge("BADGESEVEN", "YOU ARE DA BEST");
		badges[7] = new Badge("BADGEEIGHT", "YOU ARE DA BEST");
		badges[8] = new Badge("BADGENINE", "YOU ARE DA BEST");
		badges[9] = new Badge("BADGETEN", "YOU ARE DA BEST");
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
	
	private static void log(Object aObject){
	    System.out.println(String.valueOf(aObject));
	  }
}
