
package builderModel;

import java.awt.Color;

public class BuilderRSet {
	
	protected Color color;
	
	protected int i;
	
	protected boolean isRSet;
	private boolean taken;
	
	public BuilderRSet(Color c, int j){
		color = c;
		i = j;
		isRSet = false;
	}
	
	public BuilderRSet(Color c, int j, boolean t, boolean taken){
		color = c;
		i = j;
		isRSet = t;
		this.setTaken(taken);
	}
	
	public Color getRSColor(){
		return color;
	}
	
	public int getRSInt(){
		return i;
	}
	
	public boolean getRSetVisible(){
		return isRSet;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	

}
