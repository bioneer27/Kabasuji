package Kabasuji;

/**
 * @author Jetro
 *
 */
public enum PieceType {
	
	PUZZLE("PUZZLE", "P"), LIGHTNING("LIGHTNING", "L"), RELEASE("RELEASE", "R"), RSET("RSet", "RS");
	
	private final String printableName;
	private final String symbol;
	
	private PieceType(String printableName, String symbol){
		this.printableName = printableName;
		this.symbol = symbol;
	}

	/**
	 * @return
	 */
	public String getName(){return printableName;}
}
