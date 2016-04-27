package model;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import Kabasuji.Board;
import Kabasuji.DataTxtWriter;
import Kabasuji.PieceType;
import view.AllLevelsView;
import view.LightningPlayView;

/**
 * @author Silver, Gold, Nickel
 *
 */
public class Lightning extends Level{
	//lightning attributes
	int seconds;
	int secondsUsed;
	LightningPlayView view;
	Timer timer = new Timer();
	
	/**
	 * @param number
	 * @param seconds
	 * @param board
	 * @param bullpen
	 */
	public Lightning(int number, int seconds, Board board, Bullpen bullpen){
		/* Need to add a constructor for Level*/
		super(number, PieceType.LIGHTNING, board, bullpen);
		secondsUsed = 0;
		this.seconds = seconds;
	}
	
	/**
	 * @param number
	 * @param seconds
	 */
//	public Lightning(int number, int seconds){
//		/* Need to add a constructor for Level*/
//		super(number, PieceType.LIGHTNING, new Board(), new Bullpen());
//		secondsUsed = 0;
//		this.seconds = seconds;
//	}
	
	/**
	 * @param suji
	 */
	public void initialize(){
		timer.cancel();
		secondsUsed = 0;
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
