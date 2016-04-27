package Kabasuji;

import java.io.IOException;

import javax.swing.JFrame;

import model.Bullpen;
import model.Level;
import model.Model;
import view.AllLevelsView;
import view.ReleasePlayView;

/**
 * @author Jetro
 *
 */
public class Release extends Level{
	RSet set1;
	RSet set2;
	RSet set3;
	ReleasePlayView view;
	
	/**
	 * @param number
	 * @param bullpen
	 */
//	public Release(int number, Bullpen bullpen){
//		/* Need to add a constructor for Level*/
//		super(number, PieceType.RELEASE, bullpen);
//		
//		this.bullpen = bullpen;
//	}
	
	/**
	 * @param number
	 */
	public Release(int number){
		/* Need to add a constructor for Level*/
		super(number, PieceType.RELEASE, new Board(), new Bullpen());
	}
	
	/**
	 * @param suji
	 */
	public void initialize(Model suji){
		this.suji = suji;
		view = new ReleasePlayView(this);
		view.setVisible(true);
	}
	
	/**
	 * 
	 */
	public void completeLevel(){
		//star logic
		//3 stars
		try {
			new DataTxtWriter("src/Data.txt").txtReplace("RLEVEL" + number + " = " + getStars() + ",", "RLEVEL" + number + " = " + 3 + ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		completeLevel(3);
		
		//reopen the level view
		AllLevelsView window = new AllLevelsView(suji, PieceType.RELEASE);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		view.dispose();
	}
}
