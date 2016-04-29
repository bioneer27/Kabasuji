/*
 * 
 */
package Kabasuji;

import model.Model;

/**
 * @author Jetro
 *
 */
public class KabasujiFactory {
	
	/** The Constant instance. */
	private static final KabasujiFactory instance = new KabasujiFactory();
	
	/**
	 * Instantiates a new kabasuji factory.
	 */
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
