package builderController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import builderModel.Bullpen;
import builderModel.LBModel;
import builderModel.Level;
import builderModel.PieceType;
import builderView.AllLevelsView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

public class LevelBuilderMenuController implements ActionListener{
	/** The all view. */
	//views this view can get to
	AllLevelsView allView;
	
	LevelBuilderView lbView;

	/** The lvl view. */
	//personal copy of the boundary to dispose
	LevelBuilderMenu menuView;

	/** The model. */
	LBModel model;

	/**
	 * Instantiates a new level controller.
	 *
	 * @param lvlView
	 *            the lvl view
	 * @param model
	 *            the model
	 */
	public LevelBuilderMenuController(LevelBuilderMenu menuView, LBModel model){
		this.allView = menuView.getAllView();
		this.menuView = menuView;
		this.lbView = menuView.getLBView();
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().getClass().getName().trim().equals("javax.swing.JRadioButton")){
			radioButtonAction(e);
		}
		else{
			buttonAction(e);
		}
	}
		

	private void radioButtonAction(ActionEvent e){
		JRadioButton source = (JRadioButton) e.getSource();
		//complete the level and return to level select screen
		if(source.getName().equals("create")){
			menuView.setCreateClicked(true);
			menuView.setEditClicked(false);
			menuView.setDeleteClicked(false);
		}
		
		if(source.getName().equals("edit")){
			menuView.setCreateClicked(false);
			menuView.setEditClicked(true);
			menuView.setDeleteClicked(false);
		}
		
		if(source.getName().equals("delete")){
			menuView.setCreateClicked(false);
			menuView.setEditClicked(false);
			menuView.setDeleteClicked(true);
		}
	}
	
	private void buttonAction(ActionEvent e){
		JButton source = (JButton) e.getSource();
		
		if(source.getName().equals("Lightning")){
			if (menuView.isCreateClicked() == true){

				lbView = new LevelBuilderView(model,new Level(model.getLastLevel(PieceType.LIGHTNING)+1, PieceType.LIGHTNING, new Bullpen(), 0));
				lbView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				lbView.setVisible(true);
				menuView.setVisible(false);
			}	
			else if ((menuView.isEditClicked() == true)||(menuView.isDeleteClicked() == true)){

				allView = new AllLevelsView(model,PieceType.LIGHTNING);
				allView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				allView.setVisible(true);
				menuView.setVisible(false);
			}	
		}
		
		if(source.getName().equals("Puzzle")){
			if (menuView.isCreateClicked() == true){

				lbView = new LevelBuilderView(model,new Level(model.getLastLevel(PieceType.PUZZLE)+1, PieceType.PUZZLE, new Bullpen(), 0));
				lbView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				lbView.setVisible(true);
				menuView.setVisible(false);
			}	
			else if ((menuView.isEditClicked() == true)||(menuView.isDeleteClicked() == true)){

				allView = new AllLevelsView(model,PieceType.PUZZLE);
				allView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				allView.setVisible(true);
				menuView.setVisible(false);
			}	
		}
		
		if(source.getName().equals("Release")){
			if (menuView.isCreateClicked() == true){

				lbView = new LevelBuilderView(model,new Level(model.getLastLevel(PieceType.RELEASE)+1, PieceType.RELEASE, new Bullpen(), 0));
				lbView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				lbView.setVisible(true);
				menuView.setVisible(false);
			}	
			else if ((menuView.isEditClicked() == true)||(menuView.isDeleteClicked() == true)){

				allView = new AllLevelsView(model,PieceType.RELEASE);
				allView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				allView.setVisible(true);
				menuView.setVisible(false);
			}	
		}
		//close current screen and stop any timers
				menuView.dispose();
	}
}