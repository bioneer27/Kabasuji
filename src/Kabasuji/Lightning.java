package Kabasuji;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import view.LightningPlayView;

public class Lightning extends Level{
	
	int seconds;
	int secondsUsed;
	LightningPlayView view;
	Timer timer = new Timer();
	
	public Lightning(int number, int seconds){
		/* Need to add a constructor for Level*/
		super(number, PieceType.LIGHTNING);
		secondsUsed = 0;
		this.seconds = seconds;
	}
	
	public void initialize(){
		timer.cancel();
		secondsUsed = 0;
		view = new LightningPlayView(this);
		view.setVisible(true);
		timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				secondsUsed++;
				view.getTimeLeftLabel().setText("" + getTimeLeft());
				if(secondsUsed == seconds)
					completeLevel();
			}
		}, 0, 100);
	}
	
	public void completeLevel(){
		//star logic
		try {
			new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL2 = " + star +",29", "LLEVEL2 = " + 3 +",29");
		} catch (IOException e) {
			e.printStackTrace();
		}
		completeLevel(3);
		view.dispose();
	}
	
	public int getTimeLeft(){
		return seconds - secondsUsed;
	}

}
