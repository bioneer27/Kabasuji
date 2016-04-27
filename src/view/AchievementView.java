package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;

import Controller.AchievementController;
import model.Model;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Jetro
 *
 */
public class AchievementView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//buttons in this view
	JButton back;
	JButton resetBadges;
	
	//view I can get to from this view
	MainMenuView mainView;
	
	Model model;

	/**
	 * Create the frame.
	 */
	public AchievementView(Model model) {
		this.model = model;
		initialize();
	}
	
	/**
	 * 
	 */
	public void initialize(){
		//setup the frame
		getContentPane().setBackground(new Color(255, 250, 205));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 89));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		
		//setup badge 1
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setToolTipText(model.getBadge(1).getName() + "- "+ model.getBadge(1).getDescription());
		if (model.getBadge(1).getAchieved()){
			lblNewLabel.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Electric Shock 2.png")));
		}
		else{
			lblNewLabel.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 2
		JLabel label = new JLabel("New label");
		label.setToolTipText(model.getBadge(2).getName() + "- "+model.getBadge(2).getDescription());
		if (model.getBadge(2).getAchieved()){
			label.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Thunderbird.png")));
		}
		else{
			label.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 3
		JLabel label_1 = new JLabel("New label");
		label_1.setToolTipText(model.getBadge(3).getName() + "- "+model.getBadge(3).getDescription());
		if (model.getBadge(3).getAchieved()){
			label_1.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Lightning God.png")));
		}
		else{
			label_1.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 4
		JLabel label_2 = new JLabel("New label");
		label_2.setToolTipText(model.getBadge(4).getName() + "- "+model.getBadge(4).getDescription());
		if (model.getBadge(4).getAchieved()){
			label_2.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Bird.png")));
		}
		else{
			label_2.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 5
		JLabel label_3 = new JLabel("New label");
		label_3.setToolTipText(model.getBadge(5).getName() + "- "+model.getBadge(5).getDescription());
		if (model.getBadge(5).getAchieved()){
			label_3.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Eagle.png")));
		}
		else{
			label_3.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 6
		JLabel label_4 = new JLabel("New label");
		label_4.setToolTipText(model.getBadge(6).getName() + "- "+model.getBadge(6).getDescription());
		if (model.getBadge(6).getAchieved()){
			label_4.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Sword and Shield.png")));
		}
		else{
			label_4.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 7
		JLabel label_5 = new JLabel("New label");
		label_5.setToolTipText(model.getBadge(7).getName() + "- "+model.getBadge(7).getDescription());
		if (model.getBadge(7).getAchieved()){
			label_5.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Baseball.PNG")));
		}
		else{
			label_5.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 8
		JLabel label_6 = new JLabel("New label");
		label_6.setToolTipText(model.getBadge(8).getName() + "- "+model.getBadge(8).getDescription());
		if (model.getBadge(8).getAchieved()){
			label_6.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Joker.png")));
		}
		else{
			label_6.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 9
		JLabel label_7 = new JLabel("New label");
		label_7.setToolTipText(model.getBadge(9).getName() + "- "+model.getBadge(9).getDescription());
		if (model.getBadge(9).getAchieved()){
			label_7.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Wizard.png")));
		}
		else{
			label_7.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup badge 10
		JLabel label_8 = new JLabel("New label");
		label_8.setToolTipText(model.getBadge(10).getName() + "- "+model.getBadge(10).getDescription());
		if (model.getBadge(10).getAchieved()){
			label_8.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Sage.png")));
		}
		else{
			label_8.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		//setup reset badges button
		resetBadges = new JButton("Reset Badges");
		resetBadges.setName("reset");
		resetBadges.addActionListener(new AchievementController(this, model));
		
		//setup the group layout
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(45)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(62)
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGap(85)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(103)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(116)
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(92)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(34)
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(57)
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))))
					.addGap(111))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(842, Short.MAX_VALUE)
					.addComponent(resetBadges)
					.addGap(126))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(78))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(resetBadges)
							.addContainerGap())))
		);
		
		//setup the back button
		back = new JButton("");
		back.setName("back");
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/BackIcon.png")));
		back.setBackground(new Color(255, 204, 0));
		back.setFont(new Font("Tahoma", Font.BOLD, 8));
		back.addActionListener(new AchievementController(this, model));
		
		//title label
		JLabel lblBadges = new JLabel("BADGES");
		lblBadges.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblBadges.setForeground(new Color(255, 250, 205));
		
		//ribbon panel
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(249)
					.addComponent(lblBadges)
					.addContainerGap(354, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBadges)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}

	public MainMenuView getMainView() {
		return mainView;
	}

	public void setMainView(MainMenuView mainView) {
		this.mainView = mainView;
	}
}
