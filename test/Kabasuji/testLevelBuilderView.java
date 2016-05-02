package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Controller.MainMenuController;
import builderModel.LBModel;
import builderModel.PieceType;
import builderView.BullpenView;
import builderView.LevelBuilderMenu;
import builderView.LevelBuilderView;

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

import junit.framework.TestCase;

public class testLevelBuilderView extends TestCase {
	Model kabasuji;
	LBModel lbModel;
	Board b; 
	
	protected void setup() throws Exception{
		this.lbModel = new LBModel();
		this.kabasuji = new Model();
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt",kabasuji);
		try {
			this.kabasuji = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testLevelBuilder(){
		LevelBuilderMenu buildMenu = new LevelBuilderMenu(this.lbModel);
		buildMenu.setVisible(true);
		assertTrue(buildMenu.isVisible());
		
		//AllLevelsView allView = new AllLevelsView(this.lbModel, PieceType.LIGHTNING, this.  );
		//BullpenView bullpenView = new BullpenView(this.lbModel);
		//allView.setVisible(true);
		assertTrue(buildMenu.isVisible());
		//cant test this code yet because method buildView is not done
		lbModel = new LBModel();
		
		//need to write from file in the setup method like from the test.java file 
		
		LevelBuilderView buildView = new LevelBuilderView(this.lbModel, this.lbModel.getLevel(PieceType.LIGHTNING, 5));
		buildView.setVisible(true);
		assertTrue(buildView.isVisible());
		
		buildMenu.getEditLevel().doClick();
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertTrue(buildMenu.isVisible());
		System.out.println(this.lbModel.getNumLevels(PieceType.LIGHTNING));
		
		
		
		
		
		}
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
