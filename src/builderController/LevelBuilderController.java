/*
 * 
 */
package builderController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.JButton;

import builderModel.LBModel;
import builderView.AllLevelsView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

/**
 * The Class LevelController.
 */
public class LevelBuilderController extends TimerTask implements ActionListener{
	
	/** The all view. */
	//views this view can get to
	AllLevelsView allView;
	
	LevelBuilderMenu lbmenu;
	
	/** The lvl view. */
	//personal copy of the boundary to dispose
	LevelBuilderView lvlView;
	
	/** The model. */
	LBModel model;
	
	/**
	 * Instantiates a new level controller.
	 *
	 * @param lvlView
	 *            the lvl view
	 * @param model
	 *            the model
	 */
	public LevelBuilderController(LevelBuilderView lvlView, LBModel model){
		this.allView = lvlView.getAllLevelsView();
		this.lbmenu = lvlView.getLbMenu();
		this.lvlView = lvlView;
		this.model = model;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//complete the level and return to level select screen
		if(source.getName().equals("back")){
//			lvlView.getLevel().completeLevel(model);
			lbmenu = new LevelBuilderMenu(model);//(model, lvlView.getLevel().getType());
			lbmenu.setVisible(true);
		}
		
		//close current screen and stop any timers
		lvlView.getTimer().cancel();
		lvlView.dispose();
	}

	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		//increase the current count
		lvlView.setCurCount(lvlView.getCurCount() + 1);
		
		//set the text field so the user can see the remaining count
		lvlView.getCounterLabel().setText("" + (lvlView.getCounter() - lvlView.getCurCount()));
		
		//once the count is 0, complete the level, stop any timers and return to the level select screen
		if(lvlView.getCounter() == lvlView.getCurCount()){
			lvlView.getLevel().completeLevel(model);
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
			lvlView.getTimer().cancel();
			lvlView.dispose();
		}
	}

}