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
		if(source.getName() == "back"){
			lvlView.getLevel().completeLevel();
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
		}
		
		//stop any timers and close current screen
		lvlView.getTimer().cancel();
		lvlView.dispose();
	}

	@Override
	public void run() {
		lvlView.setCurCount(lvlView.getCurCount() + 1);
		lvlView.getTimeLeftLabel().setText("" + (lvlView.getCounter() - lvlView.getCurCount()));
		if(lvlView.getCounter() == lvlView.getCurCount()){
			lvlView.getLevel().completeLevel();
			lvlView.getTimer().cancel();
		}
	}

}
