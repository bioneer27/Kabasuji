package builderModel;

import java.util.ArrayList;

import Kabasuji.Badge;
import builderModel.PieceType;

public class LBModel {

	/** The llevels. */
	//list of lightning levels
	ArrayList<Level> llevels = new ArrayList<Level>();

	/** The plevels. */
	//list of puzzle levels
	ArrayList<Level> plevels = new ArrayList<Level>();

	/** The rlevels. */
	//list of release levels
	ArrayList<Level> rlevels = new ArrayList<Level>();

	/**
	 * 
	 */
	public LBModel(){
	}
	
	/**
	 * @param type
	 * @param lvl
	 * @return
	 */
	public Level getLevel(PieceType type, int lvl){
		if(type == PieceType.LIGHTNING)
			return llevels.get(lvl - 1);
		else if(type == PieceType.PUZZLE)
			return plevels.get(lvl - 1);
		else
			return rlevels.get(lvl - 1);
	}
	
	public int getLastLevel(PieceType type){
		if(type.equals(PieceType.LIGHTNING)){
			return llevels.size();
		}else if(type.equals(PieceType.PUZZLE)){
			return plevels.size();
		}else if(type.equals(PieceType.RELEASE)){
			return rlevels.size();
		}
		else return -1;
	}
	
	public int getNumLevels(PieceType type){
		if(type == PieceType.LIGHTNING)
			return llevels.size();
		else if(type == PieceType.PUZZLE)
			return plevels.size();
		else
			return rlevels.size();
	}
}