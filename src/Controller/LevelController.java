package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.AllLevelsView;
import view.LevelView;

public class LevelController implements ActionListener{
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
		
		//quit level and return to level select screen
		if(source.getName() == "back"){
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
		}
		
		//close current screen
		lvlView.dispose();
	}

}
