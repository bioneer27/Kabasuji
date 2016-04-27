package Kabasuji;

import java.util.ArrayList;

/**
 * @author Himanjal
 *
 */
public class Board {

	public static final int SIZE = 12;

	Square[][] board;
	
	ArrayList<WindowClass> pieces = new ArrayList<WindowClass>();

	
	public Board(){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				board[i][j] = new Square(i, j, this, true, false);
				
			}
		}
	}
}

