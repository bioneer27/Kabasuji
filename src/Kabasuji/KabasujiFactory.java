package Kabasuji;

/**
 * @author Jetro
 *
 */
public class KabasujiFactory {
	private static final KabasujiFactory instance = new KabasujiFactory();
	
	private KabasujiFactory(){
		
	}
	
	/**
	 * @return
	 */
	public static KabasujiFactory getInstance(){
		return instance;
	}

	/**
	 * @return
	 */
	public Kabasuji makeKabasuji(){
		return new Kabasuji();
	}
}
