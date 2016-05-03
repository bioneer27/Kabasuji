package Controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.TimerTask;

import model.Model;
import model.PlaySplash;
import view.MainMenuView;

public class PlaySplashController extends TimerTask{
	PlaySplash ps;
	Model model;

	public PlaySplashController(PlaySplash ps, Model model){
		this.ps = ps;
		this.model = model;
	}
	
	@Override
	public void run() {
		// make the final application
		final MainMenuView app = new MainMenuView(model);

		// state how to deal with leaving
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.dispose();
			}      
		});

		app.setVisible(true);
		ps.getFrame().dispose();
		ps.getTimer().cancel();
	}
}
