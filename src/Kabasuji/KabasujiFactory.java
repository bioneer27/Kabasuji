package Kabasuji;

public class KabasujiFactory {
	private static final KabasujiFactory instance = new KabasujiFactory();
	
	private KabasujiFactory(){
		
	}
	
	public static KabasujiFactory getInstance(){
		return instance;
	}

	public Kabasuji makeKabasuji(){
		return new Kabasuji();
	}
}
