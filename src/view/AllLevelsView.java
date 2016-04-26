package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import Kabasuji.Kabasuji;
import Kabasuji.PieceType;
import view.PlayMenuView;

public class AllLevelsView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	Kabasuji model;
	JButton level1;
	JButton level2;
	JButton level3;
	JButton level4;
	JButton level5;
	JButton leftClick;
	JButton rightClick;
	JButton back;
	PieceType type;

	/**
	 * Create the application.
	 */
	public AllLevelsView(Kabasuji model, PieceType type) {
		this.type = type;
		this.model = model;
		initialize();
	}
	
	public JFrame getFrame(){
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setResizable(false);
		getContentPane().setBackground(new Color(255, 250, 205));
		setBounds(100, 100, 960, 540);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		if(type == PieceType.LIGHTNING)
			panel.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			panel.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			panel.setBackground(new Color(244, 164, 96));
		
		JButton button_4 = new JButton("<");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setForeground(new Color(255, 250, 205));
		button_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_4.setBackground(new Color(128, 128, 128));
		
		JButton button_5 = new JButton(">");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setForeground(new Color(255, 250, 205));
		button_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_5.setBackground(new Color(0, 0, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 205));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		
		JLabel label_3 = new JLabel("");
		if(model.getLevel(type, 2).getStars() >= 2)
			label_3.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_3.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_4 = new JLabel("");
		if(model.getLevel(type, 2).getStars() == 3)
			label_4.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_4.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_5 = new JLabel("");

		
		level2 = new JButton("2");
		if(!model.getLevel(type, 2).isUnlocked())
			level2.setEnabled(false);
		level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.playLevel(type, 2, model);
				dispose();
			}
		});
		level2.setIconTextGap(0);
		level2.setForeground(new Color(255, 250, 205));
		level2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		if(type == PieceType.LIGHTNING)
			level2.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			level2.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			level2.setBackground(new Color(244, 164, 96));
		
		JLabel label_6 = new JLabel("New label");
		
		JLabel label_11 = new JLabel("");
		if(model.getLevel(type, 2).getStars() >= 1)
			label_11.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_11.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(40)
							.addComponent(level2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(level2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(24)
							.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 250, 205));
		
		JLabel label_7 = new JLabel("");
		if(model.getLevel(type, 3).getStars() >= 1)
			label_7.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_7.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_8 = new JLabel("");
		if(model.getLevel(type, 3).getStars() >= 2)
			label_8.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_8.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_9 = new JLabel("");
		if(model.getLevel(type, 3).getStars() == 3)
			label_9.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_9.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		level3 = new JButton("3");
		if(!model.getLevel(type, 3).isUnlocked())
			level3.setEnabled(false);
		level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.playLevel(type, 3, model);
				dispose();
			}
		});
		level3.setIconTextGap(0);
		level3.setForeground(new Color(255, 250, 205));
		level3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		if(type == PieceType.LIGHTNING)
			level3.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			level3.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			level3.setBackground(new Color(244, 164, 96));
		
		JLabel label_10 = new JLabel("New label");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(40)
							.addComponent(level3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(level3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(24)
							.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 250, 205));
		
		JLabel label_12 = new JLabel("");
		if(model.getLevel(type, 4).getStars() >= 1)
			label_12.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_12.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_13 = new JLabel("");
		if(model.getLevel(type, 4).getStars() >= 2)
			label_13.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_13.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_14 = new JLabel("");
		if(model.getLevel(type, 4).getStars() == 3)
			label_14.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_14.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		level4 = new JButton("4");
		if(!model.getLevel(type, 4).isUnlocked())
			level4.setEnabled(false);
		level4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.playLevel(type, 4, model);
				dispose();
			}
		});
		level4.setIconTextGap(0);
		level4.setForeground(new Color(255, 250, 205));
		level4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		if(type == PieceType.LIGHTNING)
			level4.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			level4.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			level4.setBackground(new Color(244, 164, 96));
		
		JLabel label_15 = new JLabel("New label");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(40)
							.addComponent(level4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(level4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(24)
							.addComponent(label_15, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 250, 205));
		
		JLabel label_16 = new JLabel("");
		if(model.getLevel(type, 5).getStars() >= 1)
			label_16.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_16.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_17 = new JLabel("");
		if(model.getLevel(type, 5).getStars() >= 2)
			label_17.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_17.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_18 = new JLabel("");
		if(model.getLevel(type, 5).getStars() == 3)
			label_18.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_18.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		level5 = new JButton("5");
		if(!model.getLevel(type, 5).isUnlocked())
			level5.setEnabled(false);
		level5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.playLevel(type, 5, model);
				dispose();
			}
		});
		level5.setIconTextGap(0);
		level5.setForeground(new Color(255, 250, 205));
		level5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		if(type == PieceType.LIGHTNING)
			level5.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			level5.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			level5.setBackground(new Color(244, 164, 96));
		
		JLabel label_19 = new JLabel("New label");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(40)
							.addComponent(level5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(level5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(24)
							.addComponent(label_19, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(234)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(117)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(261, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(135, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(123)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(73)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		level1 = new JButton("1");
		level1.setIconTextGap(0);
		level1.setIcon(null);
		//Lightning color 100, 149, 237
		//Puzzle color 240, 128, 128
		//Release color 244, 164, 96
		if(type == PieceType.LIGHTNING)
			level1.setBackground(new Color(100, 149, 237));
		else if(type == PieceType.PUZZLE)
			level1.setBackground(new Color(240, 128, 128));
		else if(type == PieceType.RELEASE)
			level1.setBackground(new Color(244, 164, 96));
		level1.setForeground(new Color(255, 250, 205));
		level1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		
		JLabel lblNewLabel = new JLabel("New label");
		
		JLabel lblNewLabel_1 = new JLabel("");
		if(model.getLevel(type, 1).getStars() >= 1)
			lblNewLabel_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			lblNewLabel_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_1 = new JLabel("");
		if(model.getLevel(type, 1).getStars() >= 2)
			label_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_2 = new JLabel("");
		if(model.getLevel(type, 1).getStars() == 3)
			label_2.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_2.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(40)
							.addComponent(level1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(level1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(24)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.playLevel(type, 1, model);
				dispose();
			}
		});
		
		JLabel label = new JLabel(type.getName());
		label.setForeground(new Color(255, 248, 220));
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		label.setBackground(Color.BLUE);
		
		back = new JButton("");
		back.setIcon(new ImageIcon(AllLevelsView.class.getResource("/Images/BackIcon.png")));
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayMenuView view = new PlayMenuView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();	
			}
		});
		//Lightning dark color 65, 105, 225
		//puzzle dark color 205, 92, 92
		//release dark 210, 105, 30
		if(type == PieceType.RELEASE)
			back.setBackground(new Color(210, 105, 30));
		if(type == PieceType.LIGHTNING)
			back.setBackground(new Color(65, 105, 225));
		if(type == PieceType.PUZZLE)
			back.setBackground(new Color(205, 92, 92));
		
		back.setForeground(new Color(255, 250, 205));
		back.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(309)
					.addComponent(label)
					.addGap(383))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addComponent(label))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
