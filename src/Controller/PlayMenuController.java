package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.AllLevelsView;
import view.MainMenuView;
import view.PlayMenuView;
import Kabasuji.PieceType;

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

		//open lightning level
		if(source.getName() == "lightning"){
			allView = new AllLevelsView(model,PieceType.LIGHTNING);
			allView.setVisible(true);
		}

		//open Puzzle level
		if(source.getName() == "puzzle"){
			allView = new AllLevelsView(model,PieceType.PUZZLE);
			allView.setVisible(true);
		}
		//open Release level
		if(source.getName() == "release"){
			allView = new AllLevelsView(model,PieceType.RELEASE);
			allView.setVisible(true);
		}

		playView.dispose();
	}

}
