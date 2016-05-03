package Kabasuji;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import model.Model;
import model.PlaySplash;
import model.ReadWithScanner;
import view.MainMenuView;

/**
 * The Class Main.
 */
public class Main {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Model model = new Model();
		
		//read in from the data file to load saved information
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt", model);
		try {
			//go line by line
			model = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
//		PlaySplash ps = new PlaySplash();
//		ps.setVisible(true);
		
		// make the final application
		final MainMenuView app = new MainMenuView(model);

		// state how to deal with leaving
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.dispose();
			}      
		});

		app.setVisible(true);
	}
}
