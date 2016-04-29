package builderController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import builderModel.BuilderModel;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

public class LevelBuilderMenuController implements ActionListener{
	//Views this view can get to
	LevelBuilderView lvlbView;
	
	//copy of this boundary to dispose
	LevelBuilderMenu bmenuView;
	
	//do we need a model?
	BuilderModel bmodel;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
