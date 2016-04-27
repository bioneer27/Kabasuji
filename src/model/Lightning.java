package model;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import Kabasuji.Board;
import Kabasuji.DataTxtWriter;
import Kabasuji.PieceType;
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
	 * 
	 */
	public void completeLevel(){
		
	}
}
