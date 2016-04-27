package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.MainMenuView;
import view.RuleView;

public class RuleController implements ActionListener{

	Model model;
	
//	Views that this view can get to
	MainMenuView mainView;
	
//	Personal copy of the boundary to dispose
	RuleView ruleView;
	
	public RuleController(RuleView ruleView, Model model){
		this.model = model;
		this.ruleView = ruleView;
		this.mainView = ruleView.getMainView();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton source = (JButton) e.getSource();

//		open mainMenu
		if(source.getName().equals("back")){
			mainView = new MainMenuView(model);
			mainView.setVisible(true);
		}
		ruleView.dispose();
		
	}

}
