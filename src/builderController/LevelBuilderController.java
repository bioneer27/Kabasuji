/*
 * 
 */
package builderController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.TimerTask;

import javax.swing.JButton;

import builderModel.LBModel;
import builderModel.PieceType;
import builderView.AllLevelsView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;
import builderModel.LBDataTxtWriter;

/**
 * The Class LevelController.
 */
public class LevelBuilderController extends TimerTask implements ActionListener{
	
	/** The all view. */
	//views this view can get to
	AllLevelsView allView;
	
	LevelBuilderMenu lbmenu;
	
	/** The lvl view. */
	//personal copy of the boundary to dispose
	LevelBuilderView lvlView;
	
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
	public LevelBuilderController(LevelBuilderView lvlView, LBModel model){
		this.allView = lvlView.getAllLevelsView();
		this.lbmenu = lvlView.getMenuView();
		this.lvlView = lvlView;
		this.model = model;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.getName().equals("back")){
			lbmenu = new LevelBuilderMenu(model);
			lbmenu.setVisible(true);
		}
		if(source.getName().equals("Make Hint")){
			
		}
		if(source.getName().equals("Clear All")){
			
		}
		if(source.getName().equals("Publish")){
			LBDataTxtWriter dataWriter = new LBDataTxtWriter("src/Data.txt");
			Integer x = lvlView.getLevel().getNumber();
			String levelName = "";
			String levelBoardName = "";
			String levelBullpenName = "";
			String newValue1 = "";
			String newValue2 = "";
			String newValue3 = "";
			if (lvlView.getLevel().getType().equals(PieceType.LIGHTNING)){
				levelName = "LLEVEL" + x.toString()+ " ";
				levelBoardName = "LLEVEL" + x.toString() + "_BOARD";
				levelBullpenName = "LLEVEL" + x.toString() + "_PIECES";
				Integer secs = lvlView.getLevel().getSeconds();
				newValue1 = " = ," + secs.toString();	
			}
			if (lvlView.getLevel().getType().equals(PieceType.PUZZLE)){
				levelName = "PLEVEL" + x.toString()+ " ";
				levelBoardName = "PLEVEL" + x.toString() + "_BOARD";
				levelBullpenName = "PLEVEL" + x.toString() + "_PIECES";
				Integer mvs =  lvlView.getLevel().getMoves();
				newValue1 = " = ," + mvs.toString();	
			}
			if (lvlView.getLevel().getType().equals(PieceType.RELEASE)){
				levelName = "RLEVEL" + x.toString()+ " ";
				levelBoardName = "RLEVEL" + x.toString() + "_BOARD";
				levelBullpenName = "RLEVEL" + x.toString() + "_PIECES";
				newValue1 = " = " ;		//+ lvlView.getLevel().getRSet()
			}
			newValue2 = " = " + lvlView.getLevel().getBoard().toTxt();
			newValue3 = " = " + lvlView.getLevel().getBullpen().toTxt();
			
			if (lvlView.getLevel().getMode().equals("edit")){
				try {
					dataWriter.txtReplaceLine(levelName, newValue1);
					dataWriter.txtReplaceLine(levelBoardName, newValue2);
					dataWriter.txtReplaceLine(levelBullpenName, newValue3);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			else if (lvlView.getLevel().getMode().equals("create")){
				String love1 = levelName + newValue1;
				String love2 = levelBoardName + newValue2;
				String love3 = levelBullpenName + newValue3;
				try {
					dataWriter.txtAdd(love1);
					dataWriter.txtAdd(love2);
					dataWriter.txtAdd(love3);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		lvlView.dispose();
	}

	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		//increase the current count
		lvlView.setCurCount(lvlView.getCurCount() + 1);
		
		//set the text field so the user can see the remaining count
		lvlView.getCounterLabel().setText("" + (lvlView.getCounter() - lvlView.getCurCount()));
		
		//once the count is 0, complete the level, stop any timers and return to the level select screen
		if(lvlView.getCounter() == lvlView.getCurCount()){
			allView = new AllLevelsView(model, lvlView.getLevel().getType(),"");
			allView.setVisible(true);
			lvlView.dispose();
		}
	}

}