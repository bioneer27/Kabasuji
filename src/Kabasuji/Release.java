package Kabasuji;

import view.ReleasePlayView;

/**
 * @author Jetro
 *
 */
public class Release extends Level{
	RSet set1;
	RSet set2;
	RSet set3;
	
	/**
	 * @param number
	 * @param bullpen
	 */
	public Release(int number, Bullpen bullpen){
		/* Need to add a constructor for Level*/
		super(number, PieceType.RELEASE, bullpen);
		
		this.bullpen = bullpen;
	}
	
	/**
	 * @param number
	 */
	public Release(int number){
		/* Need to add a constructor for Level*/
		super(number, PieceType.RELEASE, new Bullpen());
	}
	
	/**
	 * @param suji
	 */
	public void initialize(Kabasuji suji){
		this.suji = suji;
		ReleasePlayView view = new ReleasePlayView(this);
		view.setVisible(true);
	}
}
