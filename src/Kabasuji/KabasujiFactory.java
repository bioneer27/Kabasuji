package Kabasuji;

import model.Model;

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
	public Model makeKabasuji(){
		return new Model();
	}
}
