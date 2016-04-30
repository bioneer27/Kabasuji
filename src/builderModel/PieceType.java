/*
 * 
 */
package builderModel;

/**
 * @author Jetro
 *
 */
public enum PieceType {
	
	/** The puzzle. */
	PUZZLE("PUZZLE", "P"), /** The lightning. */
 LIGHTNING("LIGHTNING", "L"), /** The release. */
 RELEASE("RELEASE", "R"), /** The rset. */
 RSET("RSet", "RS");
	
	/** The printable name. */
	private final String printableName;
	
	/** The symbol. */
	private final String symbol;
	
	/**
	 * Instantiates a new piece type.
	 *
	 * @param printableName
	 *            the printable name
	 * @param symbol
	 *            the symbol
	 */
	private PieceType(String printableName, String symbol){
		this.printableName = printableName;
		this.symbol = symbol;
	}

	/**
	 * @return
	 */
	public String getName(){return printableName;}
}