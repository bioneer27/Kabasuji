package Kabasuji;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import model.Model;
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
	
	/**
	 * @param number
	 * @param seconds
	 * @param bullpen
	 */
//	public Lightning(int number, int seconds, Bullpen bullpen){
//		/* Need to add a constructor for Level*/
//		super(number, PieceType.LIGHTNING, bullpen);
//		secondsUsed = 0;
//		this.seconds = seconds;
//		this.bullpen = bullpen;
//	}
	
	/**
	 * @param number
	 * @param seconds
	 */
	public Lightning(int number, int seconds){
		/* Need to add a constructor for Level*/
		super(number, PieceType.LIGHTNING, new Board(PieceType.LIGHTNING), new Bullpen());
		secondsUsed = 0;
		this.seconds = seconds;
	}
	
	/**
	 * @param suji
	 */
	public void initialize(Model suji){
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
	
	/**
	 * 
	 */
	public void completeLevel(){
		//star logic
		//3 stars
		try {
			new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + number + " = " + getStars() + "," + seconds, "LLEVEL" + number + " = " + 3 + "," + seconds);
		} catch (IOException e) {
			e.printStackTrace();
		}
		completeLevel(3);
		
		//reopen the level view
		AllLevelsView window = new AllLevelsView(suji, PieceType.LIGHTNING);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		timer.cancel();
		view.dispose();
	}
	
	/**
	 * @return
	 */
	public int getTimeLeft(){
		return seconds - secondsUsed;
	}
	
	/**
	 * @return
	 */
	public int getSeconds(){return seconds;}
}
