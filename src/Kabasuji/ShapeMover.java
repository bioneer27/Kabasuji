/*
 * 
 */
package Kabasuji;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JApplet;

//Use double buffering to remove rectangle flickers and make it repaint faster.
/**
 * @author Jetro
 *
 */
public class ShapeMover extends JApplet {

/** The label. */
static protected Label label = new Label(
    "Drag rectangle around within the area");

/* (non-Javadoc)
 * @see java.applet.Applet#init()
 */
public void init() {

  getContentPane().setLayout(new BorderLayout());
  getContentPane().add(new WindowClass());

  getContentPane().add(new WindowClass());


  getContentPane().add("South", label);
}

/**
 * @param s
 */
public static void main(String s[]) {
  Frame f = new Frame("ShapeMover");
  f.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  });
  Applet applet = new ShapeMover();
  f.add("Center", applet);
  applet.init();
  f.pack();
  f.setSize(new Dimension(850, 550));
  f.show();
}
}