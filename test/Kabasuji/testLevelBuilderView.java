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
	
	LBModel lbModel;
	Board b; 
	
	protected void setup() throws Exception{
		this.lbModel = new LBModel();
		
	}
	
	public void testLevelBuilder(){
		LevelBuilderMenu buildMenu = new LevelBuilderMenu(this.lbModel);
		buildMenu.setVisible(true);
		assertTrue(buildMenu.isVisible());
		
		//cant test this code yet because method buildView is not done
		lbModel = new LBModel();
		
		
		//George Help!
		LevelBuilderView buildView = new LevelBuilderView(this.lbModel, this.lbModel.getLevel(PieceType.LIGHTNING, 16));
		buildView.setVisible(true);
		assertTrue(buildView.isVisible());
		
		buildMenu.getEditLevel().doClick();
		buildMenu.getLightning().doClick();
		buildMenu.getLightning().isVisible();
		assertTrue(buildMenu.isVisible());
		//end George Help 
		
		
		//AllLevelsView allView = new AllLevelsView(this.lbModel, PieceType.LIGHTNING,  );
		//BullpenView bullpenView = new BullpenView(this.lbModel);
		
		}
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
