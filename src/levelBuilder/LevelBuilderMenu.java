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

public class LevelBuilderMenu {

	private JFrame frame;
	private JTextField txtBuild;
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtBuild = new JTextField();
		txtBuild.setHorizontalAlignment(SwingConstants.CENTER);
		txtBuild.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 60));
		txtBuild.setText("BUILD");
		txtBuild.setEditable(false);
		txtBuild.setColumns(10);
		
		table = new JTable();
		
		JLabel lblCreateLevel = new JLabel("Create Level");
		
		JLabel lblEditLevel = new JLabel("Edit Level");
		
		JLabel lblDeleteLevel = new JLabel("Delete Level");
		
		JCheckBox checkBox = new JCheckBox("");
		
		JCheckBox checkBox_1 = new JCheckBox("");
		
		JCheckBox checkBox_2 = new JCheckBox("");
		
		JLabel lblLightning = new JLabel("Lightning");
		
		JLabel lblPuzzle = new JLabel("Puzzle");
		
		JLabel lblRelease = new JLabel("Release");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/LightningLevelIcon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIconTextGap(1);
		btnNewButton_1.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/PuzzleLevelIcon.png")));
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(LevelBuilderMenu.class.getResource("/Images/ReleaseLevelIcon.png")));
		button.setIconTextGap(1);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(txtBuild, GroupLayout.PREFERRED_SIZE, 942, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(108)
					.addComponent(lblCreateLevel)
					.addGap(260)
					.addComponent(lblEditLevel)
					.addGap(254)
					.addComponent(lblDeleteLevel))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(checkBox)
					.addGap(294)
					.addComponent(checkBox_1)
					.addGap(301)
					.addComponent(checkBox_2))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(108)
					.addComponent(lblLightning)
					.addGap(280)
					.addComponent(lblPuzzle, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(275)
					.addComponent(lblRelease, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(btnNewButton)
					.addGap(57)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtBuild, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCreateLevel)
						.addComponent(lblEditLevel)
						.addComponent(lblDeleteLevel))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addComponent(checkBox)
						.addComponent(checkBox_1)
						.addComponent(checkBox_2))
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLightning)
						.addComponent(lblPuzzle)
						.addComponent(lblRelease))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
