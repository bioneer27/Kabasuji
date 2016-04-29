/*
 * 
 */
package levelBuilder;


import levelBuilder.Move;
import levelBuilder.Level;;

/**
 * Default undo adapter for use by all solitaire plug-ins.
 * <p>
 * The levelBuilder Undo adapter is programmed to receive Ctrl + z  keyboard events
 * and invoke the <code>undoMove()</code> method from the levelBuilder Plug-in.
 * <p>
 * Creation date: 4/27/16
 * 
 * @author Anne
 */

public class LevelBuilderUndoAdapter extends levelBuilder.UndoAdapter {

	/** The level being played. */
	protected Level level = null;

	/**
	 * levelBuilderUndoAdapter constructor comment.
	 */
	public LevelBuilderUndoAdapter(Level level) {
		super();

		this.level = level;
	}

	/**
	 * Undoes the actual move on the level being built. If a particular move
	 * can't be undone, then false is returned.
	 * <p>
	 * This request is common to all levelBuilder levels, and we are leaving
	 * undoMove() in the levelBuilder class. Perhaps in the future we might wish to
	 * consolidate it into this controller, but we'll leave it here for now.
	 * <p>
	 * Creation date: 4/27/16
/	 * 
	 * @return boolean
	 */
	public boolean undoRequested() {
		return level.undoMove();
	}
}