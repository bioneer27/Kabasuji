package builderModel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import builderModel.LBReadWithScanner;
import builderView.LevelBuilderMenu;

public class Main {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		LBModel model = new LBModel();
		
		//read in from the data file to load saved information
		LBReadWithScanner parser = new LBReadWithScanner("src/Data.txt", model);
		try {
			//go line by line
			model = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    		// make the final application
		final LevelBuilderMenu app = new LevelBuilderMenu(model);

		// state how to deal with leaving
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.dispose();
			}      
		});

		app.setVisible(true);
	}
}