package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.AllLevelsView;
import view.LevelView;

public class AllLevelsController implements ActionListener{

	Model model;
	
//	Views that this view can get to
	LevelView lvlView;
	
//	Personal copy of the boundary to dispose
	AllLevelsView allView;
	
	public AllLevelsController(AllLevelsView allView, Model model){
		this.lvlView = allView.getLevelView();
		this.allView = allView;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
