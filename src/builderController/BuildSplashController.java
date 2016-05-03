package builderController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.TimerTask;

import builderModel.BuildSplash;
import builderModel.LBModel;
import builderView.LevelBuilderMenu;
import model.PlaySplash;
import view.MainMenuView;

public class BuildSplashController extends TimerTask{
	BuildSplash ps;
	LBModel model;

	public BuildSplashController(BuildSplash ps, LBModel model){
		this.ps = ps;
		this.model = model;
	}
	
	@Override
	public void run() {
		// make the final application
		final LevelBuilderMenu app = new LevelBuilderMenu(model);

		// state how to deal with leaving
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.dispose();
			}      
		});

		app.setVisible(true);

		app.setVisible(true);
		ps.getFrame().dispose();
		ps.getTimer().cancel();
	}
}
