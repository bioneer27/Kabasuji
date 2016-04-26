package Kabasuji;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import view.AllLevelsView;
import view.LightningPlayView;

/**
 * @author Silver, Gold, Nickel
 *
 */
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
	
	public void initialize(Kabasuji suji){
		this.suji = suji;
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
		//3 stars
		try {
			new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + number + " = " + star + "," + seconds, "LLEVEL" + number + " = " + 3 + "," + seconds);
		} catch (IOException e) {
			e.printStackTrace();
		}
		completeLevel(3);
		
		//reopen the level view
		AllLevelsView window = new AllLevelsView(suji, PieceType.LIGHTNING);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		view.dispose();
	}
	
	public int getTimeLeft(){
		return seconds - secondsUsed;
	}
	
	public int getSeconds(){return seconds;}
}
