package Kabasuji;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
	
	Piece[] pieces;
	Map<Integer, boolean[][]> place;
	
	


	
	public PieceFactory(){
		place = new HashMap<Integer, boolean[][]>();
		
		boolean[][] one = new boolean[6][6];
		one[2][0] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] two = new boolean[6][6];
		one[3][1] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] three = new boolean[6][6];
		one[3][2] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] four = new boolean[6][6];
		one[3][3] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] five = new boolean[6][6];
		one[3][1] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] six = new boolean[6][6];
		one[3][2] = true;
		one[3][3] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] seven = new boolean[6][6];
		one[3][2] = true;
		one[3][4] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] eight = new boolean[6][6];
		one[3][2] = true;
		one[3][5] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] nine = new boolean[6][6];
		one[3][3] = true;
		one[3][4] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] ten = new boolean[6][6];
		one[4][2] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] eleven = new boolean[6][6];
		one[4][3] = true;
		one[3][3] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twelve = new boolean[6][6];
		one[1][2] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] thirteen = new boolean[6][6];
		one[1][3] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		

		boolean[][] fourteen = new boolean[6][6];
		one[1][4] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] fifteen = new boolean[6][6];
		one[1][5] = true;
		one[3][2] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] sixteen = new boolean[6][6];
		one[1][4] = true;
		one[3][3] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] seventeen = new boolean[6][6];
		one[1][3] = true;
		one[3][3] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] eighteen = new boolean[6][6];
		one[4][3] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] nineteen = new boolean[6][6];
		one[3][5] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		boolean[][] twenty = new boolean[6][6];
		one[3][1] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		
		boolean[][] twentyOne = new boolean[6][6];
		one[3][3] = true;
		one[3][2] = true;
		one[3][4] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentyTwo = new boolean[6][6];
		one[3][3] = true;
		one[3][4] = true;
		one[3][5] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentyThree = new boolean[6][6];
		one[1][3] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		boolean[][] twentyFour = new boolean[6][6];
		one[1][3] = true;
		one[3][4] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentyFive = new boolean[6][6];
		one[1][4] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentySix = new boolean[6][6];
		one[4][3] = true;
		one[4][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentySeven = new boolean[6][6];
		one[4][2] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentyEight = new boolean[6][6];
		one[4][3] = true;
		one[4][4] = true;
		one[3][3] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] twentyNine = new boolean[6][6];
		one[4][3] = true;
		one[3][4] = true;
		one[4][4] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] thirty = new boolean[6][6];
		one[3][4] = true;
		one[1][3] = true;
		one[3][3] = true;
		one[1][4] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] thirtyOne = new boolean[6][6];
		one[4][2] = true;
		one[3][2] = true;
		one[3][3] = true;
		one[3][4] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] thirtyTwo = new boolean[6][6];
		one[4][5] = true;
		one[3][5] = true;
		one[3][4] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		boolean[][] thirtyThree = new boolean[6][6];
		one[4][4] = true;
		one[3][5] = true;
		one[3][3] = true;
		one[3][4] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] thirtyFour = new boolean[6][6];
		one[4][4] = true;
		one[3][5] = true;
		one[4][3] = true;
		one[3][4] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		boolean[][] thirtyFive = new boolean[6][6];
		one[4][2] = true;
		one[4][3] = true;
		one[3][3] = true;
		one[3][4] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		
		place.put(1, one);
		place.put(2, two);
		place.put(3, three);
		place.put(4, four);
		place.put(5, five);
		place.put(6, six);
		place.put(7, seven);
		place.put(8, eight);
		place.put(9, nine);
		place.put(10, ten);
		place.put(11, eleven);
		place.put(12, twelve);
		place.put(13, thirteen);
		place.put(14, fourteen);
		place.put(15, fifteen);
		place.put(16, sixteen);
		place.put(17, seventeen);
		place.put(18, eighteen);
		place.put(19, nineteen);
		place.put(20, twenty);
		place.put(21, twentyOne);
		place.put(22, twentyTwo);
		place.put(23, twentyThree);
		place.put(24, twentyFour);
		place.put(25, twentyFive);
		place.put(26, twentySix);
		place.put(27, twentySeven);
		place.put(28, twentyEight);
		place.put(29, twentyNine);
		place.put(30, thirty);
		place.put(31, thirtyOne);
		place.put(32, thirtyTwo);
		place.put(33, thirtyThree);
		place.put(34, thirtyFour);
		place.put(35, thirtyFive);
		
	}
	
	
	public Piece makePiece(int i){

		return place.get(i);
	}

}
