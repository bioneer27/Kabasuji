package Kabasuji;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import junit.framework.TestCase;
import java.awt.AWTException;

import view.MainMenuView;

public class test extends TestCase {

//	public test(String name) {
//		super(name);
//	}

	protected void setUp() throws Exception {

		Kabasuji kabasuji = new Kabasuji();
		ReadWithScanner parser = new ReadWithScanner("src/Data.txt",kabasuji);
		try {
			kabasuji = parser.processLineByLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MainMenuView mainMenu = new MainMenuView(kabasuji);
		mainMenu.setVisible(true);
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

}
