package builderModel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Controller.PlaySplashController;
import builderController.BuildSplashController;
import levelBuilder.Model;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Window.Type;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import javax.swing.JButton;

public class BuildSplash {
	private Timer timer;
	private JFrame frame;

    public BuildSplash(LBModel model) {
        setFrame(new JFrame());
        getFrame().getContentPane().add(new ImagePanel());
        getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getFrame().setUndecorated(true);
        getFrame().pack();
        getFrame().setLocationRelativeTo(null);
        getFrame().setBackground(new Color(0, 0, 0, 0));
        getFrame().setVisible(true);
        setTimer(new Timer());
        getTimer().schedule(new BuildSplashController(this, model), 4000, 10);
    }

    public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	@SuppressWarnings("serial")
    public class ImagePanel extends JPanel {

        BufferedImage img;

        public ImagePanel() {
            setOpaque(false);
            setLayout(new GridBagLayout());
            try {
                img = ImageIO.read(new File("src/Images/BuildSplash.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(960, 540);
        }
    }
}
