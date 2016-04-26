package levelBuilder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Jetro
 *
 */
public class HackAdapter extends MouseAdapter {
	
	LightningLevelBuilderView parent;
	
	public HackAdapter (LightningLevelBuilderView vk) {
		this.parent = vk;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		System.out.println(parent.locateMe(me));
		
	}
	
	@Override
	public void mouseDragged(MouseEvent me) {
		System.out.println(parent.locateMe(me));
	}
	
	@Override
	public void mouseReleased(MouseEvent me) {
		System.out.println(parent.locateMe(me));
		
	}
}
