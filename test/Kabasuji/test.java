package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Controller.MainMenuController;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;
import model.Model;
import model.ReadWithScanner;

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
		
		
		
		
		
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	


}
