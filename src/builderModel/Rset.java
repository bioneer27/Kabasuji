package builderModel;

import java.awt.Color;

public class Rset {

	Square[][] rset;
	Color c;
	
	public Rset(){
		rset = new Square[3][6];
		
		for(int i=0; i<6;i++){
			for(int j=0; j<6; j++){
				if(i==0) c = Color.RED;
				if(i==1) c = Color.BLUE;
				if(i==2) c = Color.GREEN;
				rset[i][j] = new Square(i,j);
				rset[i][j].setRS(new BuilderRSet(c, j, true));
				
			}
		}
	}
	
	public Square[][] getRset(){
		return rset;
	}
	
}
