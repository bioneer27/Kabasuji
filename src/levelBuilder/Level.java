/*
 * 
 */
package levelBuilder;

import java.util.*;

import levelBuilder.Model;
import levelBuilder.Move;
// import levelBuilder.Model; Element
// import levelBuilder.LevelBuilderMouseMotionAdapter;
// import levelBuilder.LevelBuilderReleasedAdapter;

/**
 * The Class Level.
 */
abstract public class Level {

	/** The moves. */
	protected java.util.Stack<Move> moves = new java.util.Stack<Move>();
	/** The Model. */
	protected Model model = new Model();

	/**
	 * Instantiates a new level.
	 */
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
	 * Returns most recent move and removes it from list of Moves.
	 * <p>
	 * If there are no moves present in this level, null is returned.
	 * <p>
	 * This method must be protected since only <code>undoMove()</code> should
	 * have access.
	 * <p>
	 * 
	 * @return the most recent Move made in this levelBuilder level.
	 */
	protected Move popMove() {
		// Return null if the stack of moves is empty.
		if (moves.isEmpty())
			return null;

		// pop most recent.
		return (Move) moves.pop();
	}

	/**
	 * Pushes given move onto our stack of existing moves.
	 * 
	 * @return boolean
	 * @param m
	 *            A Move object representing the most recent Move made in the
	 *            levelBuilder level.
	 */
	public boolean pushMove(Move m) {
		moves.push(m);
		return true;
	}
	/**
	 * levelBuilderl level stores all moves and enables them to be undone. Once a
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
// 			refreshWidgets(); 			******* repaint()
		} else {
			// if we can't undo the move, we push it back onto the stack
			pushMove(m);
		}

		// return results.
		return status;
	}

}

