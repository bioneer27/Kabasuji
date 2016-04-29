/*
 * 
 */
package Kabasuji;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jetro
 *
 */
public class Splash extends JWindow {
  
  /** The border layout1. */
  BorderLayout borderLayout1 = new BorderLayout();
  
  /** The image label. */
  JLabel imageLabel = new JLabel();
  
  /** The south panel. */
  JPanel southPanel = new JPanel();
  
  /** The south panel flow layout. */
  FlowLayout southPanelFlowLayout = new FlowLayout();
  
  /** The progress bar. */
  JProgressBar progressBar = new JProgressBar();
  
  /** The image icon. */
  ImageIcon imageIcon;

  /**
	 * Instantiates a new splash.
	 *
	 * @param imageIcon
	 *            the image icon
	 */
  public Splash(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  // note - this class created with JBuilder
  /**
 * @throws Exception
 */
void jbInit() throws Exception {
    imageLabel.setIcon(imageIcon);
    this.getContentPane().setLayout(borderLayout1);
    southPanel.setLayout(southPanelFlowLayout);
    southPanel.setBackground(Color.BLACK);
    this.getContentPane().add(imageLabel, BorderLayout.CENTER);
    this.getContentPane().add(southPanel, BorderLayout.SOUTH);
    southPanel.add(progressBar, null);
    this.pack();
  }

  /**
 * @param maxProgress
 */
public void setProgressMax(int maxProgress)
  {
    progressBar.setMaximum(maxProgress);
  }

  /**
 * @param progress
 */
public void setProgress(int progress)
  {
    final int theProgress = progress;
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        progressBar.setValue(theProgress);
      }
    });
  }

  /**
 * @param message
 * @param progress
 */
public void setProgress(String message, int progress)
  {
    final int theProgress = progress;
    final String theMessage = message;
    setProgress(progress);
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        progressBar.setValue(theProgress);
        setMessage(theMessage);
      }
    });
  }

  /**
 * @param b
 */
public void setScreenVisible(boolean b)
  {
    final boolean boo = b;
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        setVisible(boo);
      }
    });
  }

  /**
 * @param message
 */
private void setMessage(String message)
  {
    if (message==null)
    {
      message = "";
      progressBar.setStringPainted(false);
    }
    else
    {
      progressBar.setStringPainted(true);
    }
    progressBar.setString(message);
  }
}