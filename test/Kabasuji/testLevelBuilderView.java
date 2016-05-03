package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import Controller.MainMenuController;
import builderModel.Board;
import builderModel.LBModel;
import builderModel.LBReadWithScanner;
import builderModel.PieceType;
import builderView.AllLevelsView;
import builderView.BullpenView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;

import levelBuilder.Model;
import builderModel.Square;


import java.awt.AWTException;

import view.AchievementView;
//import view.AllLevelsView;
import view.CreditView;
import view.LevelView;
import view.MainMenuView;
import view.PlayMenuView;
import view.RuleView;

import junit.framework.TestCase;

public class testLevelBuilderView extends TestCase {
	Model kabasuji;
	LBModel lbModel;
	Board b; 
		@Override
	protected void setUp() throws Exception{
		this.lbModel = new LBModel();
		//this.kabasuji = new Model();
		LBReadWithScanner parser = new LBReadWithScanner("src/Data.txt",lbModel);
		try {
			this.lbModel = parser.processLineByLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		LevelBuilderMenu builderMenu = new LevelBuilderMenu(lbModel);
		builderMenu.setVisible(true);
					
		Square[][] squares = new Square[12][12];
		
		for(int  i=0; i<12;i++){
			for(int j=0; j<12; j++){
				squares[i][j] = new Square(i,j,b,true,false);
			}
		}
		b = new Board(squares, null, PieceType.LIGHTNING);
		
	}
	
	public void testLevelBuilder(){
		LevelBuilderMenu buildMenu = new LevelBuilderMenu(this.lbModel);
		buildMenu.setVisible(true);
		assertTrue(buildMenu.isVisible());
		
		AllLevelsView allView = new AllLevelsView(this.lbModel, PieceType.LIGHTNING, "create");
		AllLevelsView allView2 = new AllLevelsView(this.lbModel, PieceType.LIGHTNING, "edit");
		AllLevelsView allView3 = new AllLevelsView(this.lbModel, PieceType.LIGHTNING, "delete");
		//BullpenView bullpenView = new BullpenView(this.lbModel);
		allView.setVisible(true);
		allView.getLevel1().doClick();
		
		
		lbModel = new LBModel();
				
		//create new level 
			
		buildMenu.getCreateLevel().doClick();
		//below here George is fixing the bug as of 6:07 pm 5/2/16
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertFalse(buildMenu.isVisible());
		System.out.println(this.lbModel.getNumLevels(PieceType.LIGHTNING));

		buildMenu.getEditLevel().doClick();
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertFalse(buildMenu.isVisible());
		System.out.println(this.lbModel.getNumLevels(PieceType.LIGHTNING));
		
		buildMenu.getDeleteLevel().doClick();
		buildMenu.getLightning().doClick();
		allView3.setVisible(true);
		assertTrue(allView3.isVisible());
		
		assertFalse(buildMenu.getDeleteLevel().isValid());
			
//		//edit level 
		/* errors
		LevelBuilderView buildView = new LevelBuilderView(this.lbModel, this.lbModel.getLevel(PieceType.LIGHTNING, 5));
		
		buildView.setVisible(true);
		assertTrue(buildView.isVisible());
		
		*/
		}
	public void testBuilderAddPiece(){
		
		
	}
	
	public void pieceToBoard(){
		
		
		model.Piece p = new PieceFactory().makePiece(1);
		b.putPieceOnBoardLB(new builderModel.Piece(p.getC(), p.getBooleans(), p.getId()), 4,4);

		assertEquals(b.getPieces().size(), 1);
			
	}
	
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	

}
