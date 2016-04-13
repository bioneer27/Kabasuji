package levelBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;

public class LevelBuilderMenu extends JFrame{

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelBuilderMenu window = new LevelBuilderMenu();
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
	public LevelBuilderMenu() {
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
		
		table = new JTable();
		
		JLabel lblCreateLevel = new JLabel("Create Level");
		lblCreateLevel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		JLabel lblEditLevel = new JLabel("Edit Level");
		lblEditLevel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		JLabel lblDeleteLevel = new JLabel("Delete Level");
		lblDeleteLevel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		JLabel lblLightning = new JLabel("Lightning");
		lblLightning.setForeground(new Color(123, 104, 238));
		lblLightning.setHorizontalAlignment(SwingConstants.CENTER);
		lblLightning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		
		JLabel lblPuzzle = new JLabel("Puzzle");
		lblPuzzle.setForeground(new Color(240, 128, 128));
		lblPuzzle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuzzle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		
		JLabel lblRelease = new JLabel("Release");
		lblRelease.setForeground(new Color(244, 164, 96));
		lblRelease.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelease.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		
//		JButton btnPuzzle = new JButton("");
//		btnPuzzle.setBackground(new Color(205, 92, 92));
//		btnPuzzle.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/PuzzleLevelIcon.png")));
//		btnPuzzle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 26));	

		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		
		JRadioButton radioButton = new JRadioButton("");
		
		JRadioButton radioButton_1 = new JRadioButton("");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/LightningLevelIcon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LevelBuilderView view = new LevelBuilderView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);
			
			}});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(240, 128, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LevelBuilderView view = new LevelBuilderView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);			}
		});
		btnNewButton_1.setIconTextGap(0);
		btnNewButton_1.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/PuzzleLevelIcon.png")));
		
		JButton button = new JButton("");
		button.setBackground(new Color(244, 164, 96));
		button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LevelBuilderView view = new LevelBuilderView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);
			}
		});
		button.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/ReleaseLevelIcon.png")));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 205));
		panel.setBackground(new Color(30, 144, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(87)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(rdbtnNewRadioButton))
								.addComponent(lblLightning, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(110)
							.addComponent(lblCreateLevel)))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(171)
									.addComponent(lblEditLevel))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(204)
									.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(148)
							.addComponent(lblPuzzle, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(211)
							.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(170)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDeleteLevel)
								.addComponent(lblRelease, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(78, Short.MAX_VALUE))
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addGap(134)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblCreateLevel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(19)
										.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
									.addComponent(rdbtnNewRadioButton)))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblEditLevel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(radioButton)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDeleteLevel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(radioButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPuzzle)
						.addComponent(lblLightning)
						.addComponent(lblRelease))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JLabel lblBuild = new JLabel("BUILD");
		lblBuild.setForeground(new Color(255, 250, 205));
		lblBuild.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(440, Short.MAX_VALUE)
					.addComponent(lblBuild)
					.addGap(378))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblBuild)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
