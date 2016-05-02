package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Controller.MainMenuController;
import builderModel.Board;
import builderModel.LBModel;
import builderModel.LBReadWithScanner;
import builderModel.PieceType;
import builderView.BullpenView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;
//import model.Board;
//import model.Level;
//import model.Model;
//import model.ReadWithScanner;
//import model.Square;
import levelBuilder.Model;

import java.awt.AWTException;

import view.AchievementView;
import view.AllLevelsView;
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
		
	}
	
	public void testLevelBuilder(){
		LevelBuilderMenu buildMenu = new LevelBuilderMenu(this.lbModel);
		buildMenu.setVisible(true);
		assertTrue(buildMenu.isVisible());
		
		//AllLevelsView allView = new AllLevelsView(this.lbModel, PieceType.LIGHTNING,   );
		//BullpenView bullpenView = new BullpenView(this.lbModel);
		//allView.setVisible(true);
		assertTrue(buildMenu.isVisible());
		//cant test this code yet because method buildView is not done
		lbModel = new LBModel();
		
		//need to write from file in the setup method like from the test.java file 
		
		//create new level 
			
		buildMenu.getCreateLevel().doClick();
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertTrue(buildMenu.isVisible());
		System.out.println(this.lbModel.getNumLevels(PieceType.LIGHTNING));
		
		
		//edit level 
		LevelBuilderView buildView = new LevelBuilderView(this.lbModel, this.lbModel.getLevel(PieceType.LIGHTNING, 5));
		buildView.setVisible(true);
		assertTrue(buildView.isVisible());
		
		buildMenu.getEditLevel().doClick();
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertTrue(buildMenu.isVisible());
		System.out.println(this.lbModel.getNumLevels(PieceType.LIGHTNING));
				
		}
	public void testBuilderAddPiece(){
		
	}
	
	
	
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	

}
