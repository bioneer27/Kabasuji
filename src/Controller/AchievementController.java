package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.AchievementView;
import view.MainMenuView;

public class AchievementController implements ActionListener{
	//views to create
	MainMenuView mainView;
	
	//personal copy of the boundary to dispose of the screen
	AchievementView achView;
	
	Model model;

	public AchievementController(AchievementView achView, Model model){
		this.mainView = achView.getMainView();
		
		this.model = model;
		this.achView = achView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//open the badges screen
		if(source.getName() == "back"){
			mainView = new MainMenuView(model);
			mainView.setVisible(true);
			
			//close the achievement view screen
			achView.dispose();
		}
		
		if(source.getName() == "reset"){
			model.resetBadges();
			
			//refresh schievement view
			achView.dispose();
			achView = new AchievementView(model);
			achView.setVisible(true);
		}
	}
	
	
}
