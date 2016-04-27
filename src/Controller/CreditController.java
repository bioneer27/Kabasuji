package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import view.CreditView;
import view.MainMenuView;

public class CreditController implements ActionListener{

	Model model;
	
//	Views that this view can get to
	MainMenuView mainView;
	
//	Personal copy of the boundary to dispose
	CreditView creditView;
	
	public CreditController(CreditView creditView, Model model){
		this.creditView = creditView;
		this.mainView = creditView.getMainView();
		this.model = model;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
//		open mainMenu
		if(source.getName().equals("back")){
			mainView = new MainMenuView(model);
			mainView.setVisible(true);
		}
		
		creditView.dispose();
		
	}

}
