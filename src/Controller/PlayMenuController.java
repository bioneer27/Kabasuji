package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.AllLevelsView;
import view.MainMenuView;
import view.PlayMenuView;

public class PlayMenuController implements ActionListener{
	//views that this view can get to
	MainMenuView mainView;
	AllLevelsView allView;
	
	//personal copy of the boundary to dispose
	PlayMenuView playView;
	
	Model model;
	
	public PlayMenuController(PlayMenuView playView, Model model){
		this.mainView = playView.getMainView();
		this.allView = playView.getAllLevelsView();
		
		this.playView = playView;
		
		this.model = model;
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//open main menu
		if(source.getName() == "back"){
			mainView = new MainMenuView(model);
			mainView.setVisible(true);
		}
		
		playView.dispose();
	}
	
}
