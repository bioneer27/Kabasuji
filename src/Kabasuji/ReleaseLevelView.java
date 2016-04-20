package Kabasuji;

import java.awt.EventQueue;

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

import view.LevelView;

public class ReleaseLevelView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReleaseLevelView window = new ReleaseLevelView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReleaseLevelView() {
		initialize();
	}
	
	public JFrame getFrame(){
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 960, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.setForeground(new Color(255, 250, 205));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Release(1);
				getFrame().setVisible(false);
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		
		JButton button_4 = new JButton("<");
		button_4.setForeground(new Color(255, 250, 205));
		button_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_4.setBackground(new Color(128, 128, 128));
		
		JButton button_5 = new JButton(">");
		button_5.setForeground(new Color(255, 250, 205));
		button_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_5.setBackground(new Color(244, 164, 96));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 205));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_5 = new JLabel("");

		
		JButton button = new JButton("2");
		button.setIconTextGap(0);
		button.setForeground(new Color(255, 250, 205));
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button.setBackground(new Color(128, 128, 128));
		
		JLabel label_6 = new JLabel("New label");
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
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
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
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
		label_7.setBackground(new Color(128, 128, 128));
		label_7.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_8 = new JLabel("");
		label_8.setBackground(new Color(128, 128, 128));
		label_8.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JButton button_1 = new JButton("3");
		button_1.setIconTextGap(0);
		button_1.setForeground(new Color(255, 250, 205));
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_1.setBackground(new Color(128, 128, 128));
		
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
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
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
		label_12.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JButton button_2 = new JButton("4");
		button_2.setIconTextGap(0);
		button_2.setForeground(new Color(255, 250, 205));
		button_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_2.setBackground(new Color(128, 128, 128));
		
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
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
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
		label_16.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(LightningLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JButton button_3 = new JButton("5");
		button_3.setIconTextGap(0);
		button_3.setForeground(new Color(255, 250, 205));
		button_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_3.setBackground(new Color(128, 128, 128));
		
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
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGap(0, 190, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
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
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.setIconTextGap(0);
		btnNewButton1.setIcon(null);
		btnNewButton1.setBackground(new Color(244, 164, 96));
		btnNewButton1.setForeground(new Color(255, 250, 205));
		btnNewButton1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		
		JLabel lblNewLabel = new JLabel("New label");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ReleaseLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ReleaseLevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ReleaseLevelView.class.getResource("/Images/NotStarIcon.png")));
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
							.addComponent(btnNewButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
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
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Release level = new Release(1);
				getFrame().setVisible(false);
			}
		});
		
		JLabel lblPuzzle = new JLabel("RELEASE");
		lblPuzzle.setForeground(new Color(255, 248, 220));
		lblPuzzle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblPuzzle.setBackground(new Color(244, 164, 96));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setIcon(new ImageIcon(ReleaseLevelView.class.getResource("/Images/BackIcon.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayMenuView view = new PlayMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(210, 105, 30));
		btnNewButton_1.setForeground(new Color(255, 250, 205));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(258)
					.addComponent(lblPuzzle))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblPuzzle))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
