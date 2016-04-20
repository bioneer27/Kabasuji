package Kabasuji;

import view.LightningPlayView;

public class Lightning extends Level{
	
	int seconds;
	int secondsUsed;
	
	public Lightning(int number, int seconds){
		/* Need to add a constructor for Level*/
		super(number, PieceType.LIGHTNING);
		secondsUsed = 0;
		this.seconds = seconds;
	}
	
	public void initialize(){
		LightningPlayView view = new LightningPlayView(this);
		view.setVisible(true);
	}
	
	public int getTimeLeft(){
		return seconds - secondsUsed;
	}

}
