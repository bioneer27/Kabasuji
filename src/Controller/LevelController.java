package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.JButton;

import model.Model;
import view.AllLevelsView;
import view.LevelView;

public class LevelController extends TimerTask implements ActionListener{
	//views this view can get to
	AllLevelsView allView;
	
	//personal copy of the boundary to dispose
	LevelView lvlView;
	
	Model model;
	
	public LevelController(LevelView lvlView, Model model){
		this.allView = lvlView.getAllLevelsView();
		this.lvlView = lvlView;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//complete the level and return to level select screen
		if(source.getName().equals("back")){
			lvlView.getLevel().completeLevel(model);
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
		}
		
		//close current screen and stop any timers
		lvlView.getTimer().cancel();
		lvlView.dispose();
	}

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
