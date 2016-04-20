package Kabasuji;

public class Level {
	
	Board board;
	int number;
	Bullpen bullpen;
	int star;
	PieceType type;
	boolean unlocked;
	

	
	public Level(int number, PieceType type){//, Board board, Bullpen bullpen){
		this.number = number; 
		this.type = type;
		//this.board = board;
		//this.bullpen = bullpen;
		star = 0;
		
		if(number == 1)
			unlocked = true;
		else
			unlocked = false;
	}
	
	public void resetLevel(){
		/*Add logic here*/
		
		return;
	}
	
	void completeLevel(PieceType type){
		/*Add logic here */

		return;
	}
	
	public void setStars(int stars){star = stars;}
	
	public int getNumber(){return number;}
	
	public PieceType getType(){return type;}
	
	public int getStars(){return star;}
}
