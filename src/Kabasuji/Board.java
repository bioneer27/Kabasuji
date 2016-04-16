package Kabasuji;

public class Board {
	Box[] boxes;
	Square[] squares;
	PieceType type;
	
	public Board(PieceType type){
		this.boxes = new Box[6];
		this.squares = new Square[216];
		this.type = type;
		
		
	}
	
	public void resetBoard(){
		/*Gives you new board*/
		/*This may be a bad implementation, feel free to change it*/
		new Board(type);
	}
	
	public int countEmptySquares(){
		/*change logic*/
		
		return 0;
	}
	
	public boolean addBox(Box newBox){
		return false;
	}
	
	public boolean isValid(Box newBox){
		return false;
	}

}
