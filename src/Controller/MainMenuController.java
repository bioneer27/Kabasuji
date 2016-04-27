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
	
	//personal copy of the boundary to dispose when switching screens
	MainMenuView mmView;
	
	Model model;
	
	public MainMenuController(MainMenuView mmv, Model model){
		this.achView = mmv.getAchievementView();
		this.playView = mmv.getPlayView();
		this.credView = mmv.getCreditView();
		this.ruleView = mmv.getRuleView();
		
		this.model = model;
		this.mmView = mmv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//open the badges screen
		if(source.getName() == "play"){
			playView = new PlayMenuView(model);
			playView.setVisible(true);
		}
		
		//open the badges screen
		if(source.getName() == "achievements"){
			achView = new AchievementView(model);
			achView.setVisible(true);
		}

		//open the badges screen
		if(source.getName() == "rules"){
			ruleView = new RuleView(model);
			ruleView.setVisible(true);
		}

		//open the badges screen
		if(source.getName() == "credits"){
			credView = new CreditView(model);
			credView.setVisible(true);
		}
		
		//close the main menu view screen
		mmView.dispose();
	}
}
