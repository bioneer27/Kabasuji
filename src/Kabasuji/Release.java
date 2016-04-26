package Kabasuji;

import view.ReleasePlayView;

public class Release extends Level{
	RSet set1;
	RSet set2;
	RSet set3;
	
	public Release(int number){
		/* Need to add a constructor for Level*/
		super(number, PieceType.RELEASE);
	}
	
	public void initialize(Kabasuji suji){
		this.suji = suji;
		ReleasePlayView view = new ReleasePlayView(this);
		view.setVisible(true);
	}
}
