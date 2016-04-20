package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Kabasuji.Level;
import Kabasuji.LightningLevelView;
import Kabasuji.PieceType;
import Kabasuji.PuzzleLevelView;
import Kabasuji.ReleaseLevelView;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Insets;

public class JIKibreaksomething extends JFrame {

	private JPanel contentPane;
	Level model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelView frame = new LevelView(new Level(1, PieceType.LIGHTNING));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JIKibreaksomething(Level model) {
		this.model = model;
	}
	
	public void initialize(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JButton btnScrollDown = new JButton("Scroll Down");
		btnScrollDown.setBackground(Color.PINK);
		
		JButton btnScrollUp = new JButton("Scroll Up");
		btnScrollUp.setBackground(Color.PINK);
		
		JLabel lblSets = new JLabel("TIME: ");
		if(type != PieceType.LIGHTNING)
			lblSets.setVisible(false);
		lblSets.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentX(0.0f);
		panel_2.setAlignmentY(0.0f);
		//Lightning color 100, 149, 237
		//Puzzle color 240, 128, 128
		//Release color 244, 164, 96
		if(type == PieceType.LIGHTNING)
			panel_2.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			panel_2.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			panel_2.setBackground(new Color(244, 164, 96));
		
		JTextPane textPane = new JTextPane();

		if(type != PieceType.LIGHTNING)
			textPane.setVisible(false);
		textPane.setEditable(false);
		textPane.setForeground(new Color(255, 140, 0));
		textPane.setBackground(new Color(100, 149, 237));
		textPane.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));

		textPane.setText("20");

		textPane.setText("14");
		
		JLabel label_2 = new JLabel("MOVES: ");
		if(type != PieceType.PUZZLE)
			label_2.setVisible(false);
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		JTextPane textPane_1 = new JTextPane();
		if(type != PieceType.PUZZLE)
			textPane_1.setVisible(false);
		textPane_1.setText("10\r\n");
		textPane_1.setForeground(new Color(124, 252, 0));
		textPane_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textPane_1.setBackground(new Color(240, 128, 128));
		
		JLabel label_3 = new JLabel("SETS:");
		if(type != PieceType.RELEASE)
			label_3.setVisible(false);
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		JButton button_202 = new JButton("");
		if(type != PieceType.RELEASE)
			button_202.setVisible(false);
		button_202.setBackground(Color.RED);
		
		JButton button_203 = new JButton("");
		if(type != PieceType.RELEASE)
			button_203.setVisible(false);
		button_203.setBackground(Color.CYAN);
		
		JButton button_204 = new JButton("");
		if(type != PieceType.RELEASE)
			button_204.setVisible(false);
		button_204.setBackground(Color.GREEN);
		
		JButton button_205 = new JButton("");
		if(type != PieceType.RELEASE)
			button_205.setVisible(false);
		button_205.setBackground(Color.GREEN);
		
		JButton button_206 = new JButton("");
		if(type != PieceType.RELEASE)
			button_206.setVisible(false);
		button_206.setBackground(Color.CYAN);
		
		JButton button_207 = new JButton("");
		if(type != PieceType.RELEASE)
			button_207.setVisible(false);
		button_207.setBackground(Color.RED);
		
		JButton button_208 = new JButton("");
		if(type != PieceType.RELEASE)
			button_208.setVisible(false);
		button_208.setBackground(Color.RED);
		
		JButton button_209 = new JButton("");
		if(type != PieceType.RELEASE)
			button_209.setVisible(false);
		button_209.setBackground(Color.CYAN);
		
		JButton button_210 = new JButton("");
		if(type != PieceType.RELEASE)
			button_210.setVisible(false);
		button_210.setBackground(Color.GREEN);
		
		JButton button_211 = new JButton("");
		if(type != PieceType.RELEASE)
			button_211.setVisible(false);
		button_211.setBackground(Color.GREEN);
		
		JButton button_212 = new JButton("");
		if(type != PieceType.RELEASE)
			button_212.setVisible(false);
		button_212.setBackground(Color.CYAN);
		
		JButton button_213 = new JButton("");
		if(type != PieceType.RELEASE)
			button_213.setVisible(false);
		button_213.setBackground(Color.RED);
		
		JButton button_214 = new JButton("");
		if(type != PieceType.RELEASE)
			button_214.setVisible(false);
		button_214.setBackground(Color.RED);
		
		JButton button_215 = new JButton("");
		if(type != PieceType.RELEASE)
			button_215.setVisible(false);
		button_215.setBackground(Color.CYAN);
		
		JButton button_216 = new JButton("");
		if(type != PieceType.RELEASE)
			button_216.setVisible(false);
		button_216.setBackground(Color.GREEN);
		
		JButton button_227 = new JButton("");
		if(type != PieceType.RELEASE)
			button_227.setVisible(false);
		button_227.setBackground(Color.GREEN);
		
		JButton button_228 = new JButton("");
		if(type != PieceType.RELEASE)
			button_228.setVisible(false);
		button_228.setBackground(Color.CYAN);
		
		JButton button_229 = new JButton("");
		if(type != PieceType.RELEASE)
			button_229.setVisible(false);
		button_229.setBackground(Color.RED);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(610)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(57)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblSets)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(69)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(25)
											.addComponent(label_3))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_202, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_203, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_204, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_207, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_206, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_205, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_208, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_209, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_210, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_213, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_212, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_211, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_214, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_215, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_216, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_229, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_228, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addComponent(button_227, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addComponent(btnScrollUp, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(btnScrollDown)))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnScrollUp)
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnScrollDown)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSets))
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(7)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_202, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_203, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_204, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_207, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_206, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_205, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_208, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_209, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_210, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_213, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_212, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_211, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_214, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_215, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_216, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_229, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_228, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_227, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		
		JButton btnNewButton_14 = new JButton("");
		//set button listener depending on the level type
		if(type == PieceType.LIGHTNING){
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					LightningLevelView window = new LightningLevelView();
					window.getFrame().setVisible(true);
					dispose();
				}
			});
		}
		else if(type == PieceType.PUZZLE){
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					PuzzleLevelView window = new PuzzleLevelView();
					window.getFrame().setVisible(true);
					dispose();
				}
			});
		}
		else if(type == PieceType.RELEASE){
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ReleaseLevelView window = new ReleaseLevelView();
					window.getFrame().setVisible(true);
					dispose();
				}
			});
		}
		btnNewButton_14.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_14.setAlignmentY(0.0f);
		btnNewButton_14.setBackground(new Color(65, 105, 225));
		btnNewButton_14.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_14.setIcon(new ImageIcon(JIKibreaksomething.class.getResource("/Images/BackIcon.png")));
		
		JLabel lblLevel = new JLabel("LEVEL " + number);
		lblLevel.setForeground(new Color(255, 250, 205));
		lblLevel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("Star 1");
		lblNewLabel.setIcon(new ImageIcon(JIKibreaksomething.class.getResource("/Images/StarIcon.png")));
		
		JLabel label = new JLabel("Star 1");
		label.setIcon(new ImageIcon(JIKibreaksomething.class.getResource("/Images/StarIcon.png")));
		
		JLabel label_1 = new JLabel("Star 1");
		label_1.setIcon(new ImageIcon(JIKibreaksomething.class.getResource("/Images/NotStarIcon.png")));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addComponent(btnNewButton_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(298)
					.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(44))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
								.addComponent(btnNewButton_14, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}
}
