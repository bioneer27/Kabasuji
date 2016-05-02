/*
 * 
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.TimerTask;

import javax.swing.JButton;

import model.Level;
import model.Model;
import view.AllLevelsView;
import view.LevelView;

/**
 * The Class LevelController.
 */
public class LevelController extends TimerTask implements ActionListener, MouseListener, MouseMotionListener{
	
	/** The all view. */
	//views this view can get to
	AllLevelsView allView;
	
	/** The lvl view. */
	//personal copy of the boundary to dispose
	LevelView lvlView;
	
	/** The model. */
	Model model;
	
	Level level;
	
	/**
	 * Instantiates a new level controller.
	 *
	 * @param lvlView
	 *            the lvl view
	 * @param model
	 *            the model
	 */
	public LevelController(LevelView lvlView, Model model, Level level){
		this.allView = lvlView.getAllLevelsView();
		this.lvlView = lvlView;
		this.model = model;
		this.level = level;
		this.level.getBoard().setLvlView(lvlView);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		//complete the level and return to level select screen
		if(source.getName().equals("back")){
			lvlView.getLevel().completeLevel(model);
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
		}
		
		level.setCounter(level.getBoard().getMoves());
		lvlView.setCounter(level.getBoard().getMoves());
		lvlView.refresh();
		//close current screen and stop any timers
		lvlView.getTimer().cancel();
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
			lvlView.getLevel().completeLevel(model);
			allView = new AllLevelsView(model, lvlView.getLevel().getType());
			allView.setVisible(true);
			lvlView.getTimer().cancel();
			lvlView.dispose();
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		if(level.getBoard().getCompleted()){
			lvlView.getBack().doClick();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
