package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.AchievementView;
import view.CreditView;
import view.MainMenuView;
import view.PlayMenuView;
import view.RuleView;

public class MainMenuController implements ActionListener{
	//views to create
	AchievementView achView;
	RuleView ruleView;
	CreditView credView;
	PlayMenuView playView;
	
	//personal copy of the main menu view to dispose when switching screens
	MainMenuView mmView;
	
	//personal copy of The Model with all information about the game
	Model model;
	
	public MainMenuController(MainMenuView mmv, Model model){
		this.achView = mmv.getAchievementView();
		this.model = model;
		this.mmView = mmv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//open the badges screen
		if(source.getName() == "achievements"){
			achView = new AchievementView(model);
			achView.setVisible(true);
		}
		
		mmView.dispose();
	}
}
