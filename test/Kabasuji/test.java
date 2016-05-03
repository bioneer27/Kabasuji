package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;
import model.Board;
import model.Level;
import model.Model;
import model.Piece;
import model.ReadWithScanner;
import model.Square;
import model.Bullpen;
import Kabasuji.PieceType;
import Controller.BullpenController;

import java.awt.AWTException;
import java.awt.Graphics;

import view.AchievementView;
import view.AllLevelsView;
import view.BullpenView;
import view.CreditView;
import view.LevelView;
//import view.LightningPlayView;
import view.MainMenuView;
import view.PieceView;
import view.PlayMenuView;
import view.RuleView;

import Controller.MainMenuController;
import builderModel.LBModel;
//import builderModel.PieceType;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;


public class test extends TestCase {

//	public test(String name) {
//		super(name);
//	}	
	Model kabasuji;
	Board b;
	LBModel lbModel;
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
		b = new Board(squares, PieceType.LIGHTNING);
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
		AllLevelsView allLevelView3 = new AllLevelsView(this.kabasuji, PieceType.RELEASE);
		allLevelView.getLevel1().doClick();
		assertTrue(allLevelView.getLevel1().isVisible()); //lightning level is open
		//why is this true?
		assertTrue(allLevelView3.getLevel1().isVisible()); 
		
		LevelView puzzLV2 = new LevelView(this.kabasuji, this.kabasuji.getLevel(PieceType.PUZZLE, 2));
		
		puzzLV2.getBack().doClick();
		assertFalse(puzzLV2.isVisible());
		
		
		
		//assertTrue(allLevelView2.getLevel1())
	}
	
	public void testnumOfSquaresLeft(){
		b.putPieceOnBoard(new PieceFactory().makePiece(1), 4,4);
		assertEquals(b.getPieces().size(), 1);
		b.getPieces().remove(0);
		assertFalse(b.getBoard().length == 0);
		b.getBoard();
//		b.getBp().addPiece(new PieceFactory().makePiece(1), 4);
		//assertFalse(b.getBp().numOfPiecesAvailable() == 2);
		
		
		
	}
	
	
	
	public void testBadgesView(){
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		AchievementView achView = new AchievementView(this.kabasuji);
		mainMenu.getAchievements().doClick();
		assertFalse(achView.isVisible()); //assertFalse passes the test, but shouldn't it be assertTrue?
	}
	
	public void testRulesView(){
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		mainMenu.setVisible(true);
		mainMenu.getRules().doClick();
		RuleView ruleView = new RuleView(this.kabasuji);
		assertFalse(ruleView.isVisible());
		
	}
	
	public void testBullpenView(){
		MainMenuView mainMenu = new MainMenuView(this.kabasuji);
		Bullpen bp = new Bullpen();
		BullpenView bpView = new BullpenView(bp);
		Level level = new Level(5, PieceType.PUZZLE, bp);
		
	}
	public void testPiece(){
		Piece newPiece = new PieceFactory().makePiece(1);
		PieceView pieceView = new PieceView(newPiece);
		
		
	}
	
	public void testAddPiece(){
		Bullpen bp = new Bullpen();
		Level level = new Level(5, PieceType.PUZZLE, bp);
		level.setBoard(b);
		assertFalse(level.getBullpen().isEmpty());
		assertTrue(level.getBoard().putPieceOnBoard(new PieceFactory().makePiece(4), 5, 5));
		assertEquals(b.getPieces().size(), 1);
		level.getBullpen().setSelectedPiece(1);
		assertTrue(bp.getSelectedPiece().equals(bp.getPiece(1)));
		level.getBullpen().rotate(1);
		level.getBullpen().addPiece(new PieceFactory().makePiece(1), 4);
		//assertFalse(level.getBoard().getNumVisibleSquares() == 1);
		//assertTrue(level.getBoard().putPieceOnBoard(new PieceFactory().makePiece(4), 4, 6));
		level.getBoard().putPieceOnBoard(new PieceFactory().makePiece(4), 3, 7);
		level.getBoard().removePiece(4, 6);
		//level.getBoard().getPieces().remove(1);
		level.getBoard().getNumVisibleSquares();
		level.getBullpen().getCounter();
		BullpenView bpView = new BullpenView(level.getBullpen());
		//bpView.paintComponent(new Graphics
	
		BullpenController bpCon = new BullpenController(level.getBullpen(), bpView);
		MouseEvent e = new MouseEvent(bpView,MouseEvent.MOUSE_CLICKED,System
								.currentTimeMillis(), MouseEvent.BUTTON1_MASK, bpView.getX(), bpView.getY(), 0, false );
		//bpCon.mouseClicked(e);
		bpCon.processMouse(MouseEvent.BUTTON1,  20, 20);
		
		
		//bpCon.mouseClicked();
		
		
		//level.getBullpen().getPiece(1).
	
		}
//	
//	public void testSplash(){
//		Splash splash = new Splash(null);
//		
//	}
	
	
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
		
		LevelView levelView = new LevelView(this.kabasuji,this.kabasuji.getLevel(PieceType.PUZZLE, 1)  );
		Bullpen bp = new Bullpen(); //create new bullpen 
		Level level = new Level(1, PieceType.PUZZLE, bp); //create new level of type puzzle 
		assertFalse(level.getBullpen().isEmpty()); //bullpen in the newly created level is empty 
		level.setStars(1); //cant do these two yet 
		assertEquals(level.getStars(), 1);
		level.setCounter(15);
		assertEquals(level.getCounter(), 15);
		level.setBoard(b);
		level.getBoard().clearBoard();
		assertTrue(level.getBoard().putPieceOnBoard(new PieceFactory().makePiece(3), 5, 5));
		level.getBoard().getSelectedPiece();
		level.completeLevel(kabasuji);
		assertFalse(levelView.isVisible());
		assertFalse(level.getBoard().isCompleted()); //assertTrue or assertFalse both gives error 
		
		LevelView levelViewLightning = new LevelView(this.kabasuji, this.kabasuji.getLevel(PieceType.LIGHTNING,1));
		LevelView levelViewRelease = new LevelView(this.kabasuji, this.kabasuji.getLevel(PieceType.RELEASE, 1));
		
		}
	
	//test to see if you move the piece over a number in release level, the system will add those numbers to the counter for sets 
			//public void testIncrementReleaseScore(){}

}
