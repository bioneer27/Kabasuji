package levelBuilder;

import java.util.*;

import levelBuilder.Model;
import levelBuilder.Move;
// import levelBuilder.Model; Element
// import levelBuilder.LevelBuilderMouseMotionAdapter;
// import levelBuilder.LevelBuilderReleasedAdapter;

abstract public class Level {

	protected java.util.Stack<Move> currentMoves = new java.util.Stack<Move>();
	protected java.util.Stack<Move> undoneMoves = new java.util.Stack<Move>();
	
	/** The Model. */
	protected Model model = new Model();

	protected Level(){
		super();
	}
	
	/**
	 * Adds given model element to model 
	 */
	protected boolean addModelElement(Element me){
		
		return model.addElement(me);
	}
	
	/**
	 * Returns most recent move and recurrentMoves it from list of currentMoves.
	 * <p>
	 * If there are no currentMoves present in this level, null is returned.
	 * <p>
	 * This method must be protected since only <code>undoMove()</code> should
	 * have access.
	 * <p>
	 * 
	 * @return the most recent Move made in this levelBuilder level.
	 */
	protected Move popMove() {
		// Return null if the stack of currentMoves is empty.
		if (currentMoves.isEmpty())
			return null;

		// pop most recent.
		return (Move) currentMoves.pop();
	}

	/**
	 * Pushes given move onto our stack of existing currentMoves.
	 * 
	 * @return boolean
	 * @param m
	 *            A Move object representing the most recent Move made in the
	 *            levelBuilder level.
	 */
	public boolean pushMove(Move m) {
		currentMoves.push(m);
		return true;
	}
	/**
	 * Level level stores all currentMoves and enables them to be undone. Once a
	 * request to undo is received, this takes care of it.
	 * 
	 * @return boolean true means the move was successfully undone; false
	 *         otherwise.
	 */
	// No longer using Memento
	public boolean undoMove() {
		Move m = popMove();
		// unable to undo
		if (m == null) {
			// signal our disapproval.
			java.awt.Toolkit.getDefaultToolkit().beep();
			return false;
		}

		// Undo and refresh all widgets.
		boolean status = m.undo(this);
		if (status) {
			// level controller calls repaint (Level.repaint();
		} else {
			// if we can't undo the move, we push it back onto the stack
			pushMove(m);
		}

		// return results.
		return status;
	}
	
	//public boolean redoMove(){
		// Move m = 
	//}
// changing stacks, if new move, all undone moves go away
	//
}

