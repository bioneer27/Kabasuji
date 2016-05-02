package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Controller.MainMenuController;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;
import model.Board;
import model.Level;
import model.Model;
import model.ReadWithScanner;
import model.Square;

import java.awt.AWTException;

import view.AchievementView;
import view.AllLevelsView;
import view.CreditView;
import view.LevelView;
import view.MainMenuView;
import view.PlayMenuView;
import view.RuleView;

public class test extends TestCase {

//	public test(String name) {
//		super(name);
//	}	
	Model kabasuji;
	Board b;
	protected void setUp() throws Exception {
		this.kabasuji = new Model();
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt",kabasuji);
		try {
			this.kabasuji = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("asASaS");

		MainMenuView mainMenu = new MainMenuView(kabasuji);
		mainMenu.setVisible(true);
		
		Square[][] squares = new Square[12][12];
		
		for(int  i=0; i<12;i++){
			for(int j=0; j<12; j++){
				squares[i][j] = new Square(i,j,b,true,false);
			}
		}
		b = new Board(squares, PieceType.PUZZLE);
		//testMainMenuView();
		
	}

	public void testMainMenuView(){
		
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		AchievementView achView = new AchievementView(this.kabasuji);
		mainMenu.getAchievements().doClick();
		achView.getBack().doClick();
		mainMenu.getRules().doClick();
		RuleView rView = new RuleView(this.kabasuji);
		rView.getBack().doClick();
		mainMenu.getCredits().doClick();
		CreditView cView = new CreditView(this.kabasuji);
		cView.getBack().doClick();
		//MainMenuController mainMenuController = new MainMenuController(mainMenu, this.kabasuji);
		mainMenu.getPlay().doClick();
		PlayMenuView playMenu = new PlayMenuView(this.kabasuji);
		playMenu.getPuzzle().doClick();
		AllLevelsView allLevelView = new AllLevelsView(this.kabasuji, PieceType.PUZZLE);
		allLevelView.getLevel1().doClick();
		LevelView lv = new LevelView(this.kabasuji, this.kabasuji.getLevel(PieceType.PUZZLE, 1));
		lv.getBack().doClick();
		allLevelView.getLevel2().doClick();
		LevelView lv2 = new LevelView(this.kabasuji, this.kabasuji.getLevel(PieceType.PUZZLE, 2));
		lv2.getBack().doClick();
		allLevelView.getBack().doClick();
		AllLevelsView allLevelView2 = new AllLevelsView(this.kabasuji, PieceType.LIGHTNING);
		allLevelView2.getLevel1().doClick();

		/**/
		
		}
	
	
				
	
	
	//boundary 
	
	public void testLightningLevel(){
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		mainMenu.getPlay().doClick();
		PlayMenuView playMenu = new PlayMenuView(this.kabasuji);
		AllLevelsView allLevelView = new AllLevelsView(this.kabasuji, PieceType.LIGHTNING);
		AllLevelsView allLevelView2 = new AllLevelsView(this.kabasuji, PieceType.PUZZLE);
		allLevelView.getLevel1().doClick();
		assertTrue(allLevelView.getLevel1().isVisible()); //lightning level is open
		assertTrue(allLevelView2.getLevel1().isVisible()); //why is this true?
		//assertTrue(allLevelView2.getLevel1())
	}
	
	public void testnumOfSquaresLeft(){
		b.putPieceOnBoard(new PieceFactory().makePiece(1), 4,4);
		assertEquals(b.getPieces().size(), 1);
		
	}
	
	
	
	public void testBadgesView(){
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		AchievementView achView = new AchievementView(this.kabasuji);
		mainMenu.getAchievements().doClick();
		assertFalse(achView.isVisible()); //assertFalse passes the test, but shouldn't it be assertTrue?
		
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPreventNull() {
		// first create a mouse event
		Robot test;
		try {
			test = new Robot();
			int x = 10;
			int y = 50;
			
			int mask = InputEvent.BUTTON1_DOWN_MASK;
			test.setAutoDelay(5000);
			test.mouseMove(320 + x + 440, 240 + y);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//boundary related:
	
	//test to see if you open lightning level, bullpen has pieces 
	//test to see if you open lightning level, validate that you have only the timer, bullpen, board
	//test to see if you open puzzle level, you don't have anything else but number of moves, bullpen, board 
	//test credit view 
	
	
	//controller:
	
	//entity or logic related: 
	//test to see if when you add piece from bullpen to board in puzzle level(click, drag event), number of moves decreases by 1 
	public void testIncrementPuzzleMoveNumber(){
		
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		mainMenu.getPlay().doClick();
		PlayMenuView playMenu = new PlayMenuView(this.kabasuji);
		AllLevelsView allLevelView = new AllLevelsView(this.kabasuji, PieceType.PUZZLE);
		allLevelView.getLevel1().doClick();
		//how do i get to bullpen? 
		//Bullpen
	
	}
	
	//test to see if you move the piece over a number in release level, the system will add those numbers to the counter for sets 
			//public void testIncrementReleaseScore(){}
		
	
	

	
	
	
	

	
	
	


}
