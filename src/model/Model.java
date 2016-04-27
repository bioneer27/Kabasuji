package model;

import java.io.IOException;
import java.util.ArrayList;

import Kabasuji.Badge;
import Kabasuji.DataTxtWriter;
import Kabasuji.Level;
import Kabasuji.Lightning;
import Kabasuji.PieceType;
import Kabasuji.Puzzle;
import Kabasuji.Release;

/**
 * @author xavier
 *
 */
public class Model {
	//list of lightning levels
	ArrayList<Lightning> llevels = new ArrayList<Lightning>();
	//list of puzzle levels
	ArrayList<Puzzle> plevels = new ArrayList<Puzzle>();
	//list of release levels
	ArrayList<Release> rlevels = new ArrayList<Release>();
	//array of all badges
	Badge badges[] = new Badge[10];
	//array of all possible pieces
	//Piece pieces[] = new Piece[35]
	
	
	/**
	 * 
	 */
	public Model(){
		//set up name and description for badges
		badges[0] = new Badge("Electric Shock", "Completed Lightning Level in 35s");
		badges[1] = new Badge("Thunderbird", "Completed Lightning Level in (No. of squares/6) + 1");
		badges[2] = new Badge("Lightning God", "Completed Lightning Level in less than 25 seconds (half time)");
		badges[3] = new Badge("Bird", "Completed Puzzle Level in birdie (-1 of the allowed number of moves");
		badges[4] = new Badge("Eagle", "Completed Puzzle Level in eagle (-2 of the allowed number of moves) ");
		badges[5] = new Badge("Sword and Shield ", "Completed Puzzle Level without having rotated a piece");
		badges[6] = new Badge("Baseball (Strike Out) ", "Filed to complete the Puzzle level three times in a row ");
		badges[7] = new Badge("Joker", "Put a piece on Release Level that does not touch any number");
		badges[8] = new Badge("Magician ", "Acquired two sets of number in Release Level");
		badges[9] = new Badge("Sage", "Completed level 5 of Release Level");
		
		//set up all possible pieces
		//code to make pieces
		
		
	}
	
	/**
	 * reset all badges and sets the data in the data file
	 */
	public void resetBadges(){
		for(int i = 1; i <= 10; i++)
			try {
				//find where badge are saved as true and set them to false
				new DataTxtWriter("src/Data.txt").txtReplace("BADGE" + i + " = 1", "BADGE" + i + " = 0");
			} catch (IOException e) {
				e.printStackTrace();
			}
		return;
	}
	
	/**
	 * @param type
	 * @param lvl
	 * @param suji
	 */
	public void playLevel(PieceType type, int lvl, Model suji){
		if(type == PieceType.LIGHTNING)
			llevels.get(lvl - 1).initialize(suji);
		else if(type == PieceType.PUZZLE)
			plevels.get(lvl - 1).initialize(suji);
		else if(type == PieceType.RELEASE)
			rlevels.get(lvl - 1).initialize(suji);
	}
	
	/**
	 * @param type
	 * @param lvl
	 * @return
	 */
	public Level getLevel(PieceType type, int lvl){
		if(type == PieceType.LIGHTNING)
			return llevels.get(lvl - 1);
		else if(type == PieceType.PUZZLE)
			return plevels.get(lvl - 1);
		else
			return rlevels.get(lvl - 1);
	}
	
	/**
	 * @param badge
	 * @return Badge
	 */
	public Badge getBadge(int badge){return badges[badge - 1];}
}
