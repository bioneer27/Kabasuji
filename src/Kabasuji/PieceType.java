package Kabasuji;

public enum PieceType {
	
	PUZZLE("Puzzle", "P"), LIGHTNING("Lightning", "L"), RELEASE("Release", "R"), RSET("RSet", "RS");
	
	private final String printableName;
	private final String symbol;
	
	private PieceType(String printableName, String symbol){
		this.printableName = printableName;
		this.symbol = symbol;
	}

}
