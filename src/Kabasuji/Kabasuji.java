package Kabasuji;

import java.io.IOException;
import java.util.ArrayList;

public class Kabasuji {
	ArrayList<Level> llevels = new ArrayList<Level>();
	ArrayList<Level> plevels = new ArrayList<Level>();
	ArrayList<Level> rlevels = new ArrayList<Level>();
	ArrayList<Badge> badges = new ArrayList<Badge>();
	
	public Kabasuji(){
		/*Add something here*/
	}

	public static void main(String[] args) throws IOException {
		MainMenuView menuView = new MainMenuView();
		Kabasuji kabasuji = new Kabasuji();
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt",kabasuji);
		try {
			kabasuji = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    log("Done.");
	    menuView.main(args);
	}
	
	public void resetBadges(){
		/*Add logic here*/
		return;
	}
	
	public void playLevel(PieceType type, int lvl){
		/*Add logic here*/
		return;
	}
	
	private static void log(Object aObject){
	    System.out.println(String.valueOf(aObject));
	  }
}
