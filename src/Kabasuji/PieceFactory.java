package Kabasuji;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
	
	Piece[] pieces;
	Map<Integer, boolean[][]> place;
	
	


	
	public PieceFactory(){
		place = new HashMap<Integer, boolean[][]>(1000);
		
		boolean[][] one = new boolean[6][6];
		one[2][0] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		boolean[][] two = new boolean[6][6];
		two[3][1] = true;
		two[2][1] = true;
		two[2][2] = true;
		two[2][3] = true;
		two[2][4] = true;
		two[2][5] = true;
		
		boolean[][] three = new boolean[6][6];
		three[3][2] = true;
		three[2][1] = true;
		three[2][2] = true;
		three[2][3] = true;
		three[2][4] = true;
		three[2][5] = true;
		
		boolean[][] four = new boolean[6][6];
		four[3][3] = true;
		four[2][1] = true;
		four[2][2] = true;
		four[2][3] = true;
		four[2][4] = true;
		four[2][5] = true;
		
		boolean[][] five = new boolean[6][6];
		five[3][1] = true;
		five[3][2] = true;
		five[2][2] = true;
		five[2][3] = true;
		five[2][4] = true;
		five[2][5] = true;
		
		boolean[][] six = new boolean[6][6];
		six[3][2] = true;
		six[3][3] = true;
		six[2][2] = true;
		six[2][3] = true;
		six[2][4] = true;
		six[2][5] = true;
		
		boolean[][] seven = new boolean[6][6];
		seven[3][2] = true;
		seven[3][4] = true;
		seven[2][2] = true;
		seven[2][3] = true;
		seven[2][4] = true;
		seven[2][5] = true;
		
		boolean[][] eight = new boolean[6][6];
		eight[3][2] = true;
		eight[3][5] = true;
		eight[2][2] = true;
		eight[2][3] = true;
		eight[2][4] = true;
		eight[2][5] = true;
		
		boolean[][] nine = new boolean[6][6];
		nine[3][3] = true;
		nine[3][4] = true;
		nine[2][2] = true;
		nine[2][3] = true;
		nine[2][4] = true;
		nine[2][5] = true;
		
		boolean[][] ten = new boolean[6][6];
		ten[4][2] = true;
		ten[3][2] = true;
		ten[2][2] = true;
		ten[2][3] = true;
		ten[2][4] = true;
		ten[2][5] = true;
		
		boolean[][] eleven = new boolean[6][6];
		eleven[4][3] = true;
		eleven[3][3] = true;
		eleven[2][2] = true;
		eleven[2][3] = true;
		eleven[2][4] = true;
		eleven[2][5] = true;
		
		boolean[][] twelve = new boolean[6][6];
		twelve[1][2] = true;
		twelve[3][2] = true;
		twelve[2][2] = true;
		twelve[2][3] = true;
		twelve[2][4] = true;
		twelve[2][5] = true;
		
		boolean[][] thirteen = new boolean[6][6];
		thirteen[1][3] = true;
		thirteen[3][2] = true;
		thirteen[2][2] = true;
		thirteen[2][3] = true;
		thirteen[2][4] = true;
		thirteen[2][5] = true;
		

		boolean[][] fourteen = new boolean[6][6];
		fourteen[1][4] = true;
		fourteen[3][2] = true;
		fourteen[2][2] = true;
		fourteen[2][3] = true;
		fourteen[2][4] = true;
		fourteen[2][5] = true;
		
		boolean[][] fifteen = new boolean[6][6];
		fifteen[1][5] = true;
		fifteen[3][2] = true;
		fifteen[2][2] = true;
		fifteen[2][3] = true;
		fifteen[2][4] = true;
		fifteen[2][5] = true;
		
		boolean[][] sixteen = new boolean[6][6];
		sixteen[1][4] = true;
		sixteen[3][3] = true;
		sixteen[2][2] = true;
		sixteen[2][3] = true;
		sixteen[2][4] = true;
		sixteen[2][5] = true;
		
		boolean[][] seventeen = new boolean[6][6];
		seventeen[1][3] = true;
		seventeen[3][3] = true;
		seventeen[2][2] = true;
		seventeen[2][3] = true;
		seventeen[2][4] = true;
		seventeen[2][5] = true;
		
		boolean[][] eighteen = new boolean[6][6];
		eighteen[4][3] = true;
		eighteen[3][2] = true;
		eighteen[3][3] = true;
		eighteen[2][3] = true;
		eighteen[2][4] = true;
		eighteen[2][5] = true;
		
		boolean[][] nineteen = new boolean[6][6];
		nineteen[3][5] = true;
		nineteen[3][2] = true;
		nineteen[3][3] = true;
		nineteen[2][3] = true;
		nineteen[2][4] = true;
		nineteen[2][5] = true;
		
		
		boolean[][] twenty = new boolean[6][6];
		twenty[3][1] = true;
		twenty[3][2] = true;
		twenty[3][3] = true;
		twenty[2][3] = true;
		twenty[2][4] = true;
		twenty[2][5] = true;
		
		
		
		boolean[][] twentyOne = new boolean[6][6];
		twentyOne[3][3] = true;
		twentyOne[3][2] = true;
		twentyOne[3][4] = true;
		twentyOne[2][3] = true;
		twentyOne[2][4] = true;
		twentyOne[2][5] = true;
		
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

		return new Piece(Color.LIGHT_GRAY, place.get(i));
	}

}
