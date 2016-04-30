/*
 * 
 */
package levelBuilder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import builderView.LevelBuilderView;

/**
 * @author Jetro
 *
 */
public class HackAdapter extends MouseAdapter {
	
	/** The parent. */
	LevelBuilderView parent;
	
	/**
	 * Instantiates a new hack adapter.
	 *
	 * @param vk
	 *            the vk
	 */
	public HackAdapter (LevelBuilderView vk) {
		this.parent = vk;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent me) {
//		System.out.println(parent.locateMe(me));
		
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseDragged(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseDragged(MouseEvent me) {
//		System.out.println(parent.locateMe(me));
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent me) {
//		System.out.println(parent.locateMe(me));
		
	}
}
