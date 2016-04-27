package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
		JButton source = (JButton) e.getSource();
		
		//open level 1
		if(source.getName().equals("level1")){
			lvlView = new LevelView(model, model.getLevel(allView.getLevelType(), 1));
			lvlView.setVisible(true);
		}
		
		//open level 2
		if(source.getName().equals("level2")){
			lvlView = new LevelView(model, model.getLevel(allView.getLevelType(), 2));
			lvlView.setVisible(true);
		}

		//open level 3
		if(source.getName().equals("level3")){
			lvlView = new LevelView(model, model.getLevel(allView.getLevelType(), 3));
			lvlView.setVisible(true);
		}

		//open level 4
		if(source.getName().equals("level4")){
			lvlView = new LevelView(model, model.getLevel(allView.getLevelType(), 4));
			lvlView.setVisible(true);
		}

		//open level 5
		if(source.getName().equals("level5")){
			lvlView = new LevelView(model, model.getLevel(allView.getLevelType(), 5));
			lvlView.setVisible(true);
		}
		
		//close current screen
		allView.dispose();
	}

}
