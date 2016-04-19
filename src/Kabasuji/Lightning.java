package Kabasuji;

import view.LightningPlayView;

public class Lightning extends Level{
	
	int seconds;
	int secondsUsed;
	
	public Lightning(int number, int seconds){
		/* Need to add a constructor for Level*/
		super(number, PieceType.LIGHTNING);
		this.secondsUsed = number;
		this.seconds = seconds;
		initialize();
	}
	
	public void initialize(){
		LightningPlayView view = new LightningPlayView(number, seconds);
		view.setVisible(true);
	}

}
