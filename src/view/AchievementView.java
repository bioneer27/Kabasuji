package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

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
	JButton back;
	Model model;
	private JLabel lblNewLabel;

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
		getContentPane().setBackground(new Color(255, 250, 205));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 89));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		
		lblNewLabel = new JLabel("New label");
		if (model.getBadge(1).getAchieved()){
			lblNewLabel.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Electric Shock 2.png")));
		}
		else{
			lblNewLabel.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		JLabel label = new JLabel("New label");
		if (model.getBadge(2).getAchieved()){
			label.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Thunderbird.png")));
		}
		else{
			label.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_1 = new JLabel("New label");
		if (model.getBadge(3).getAchieved()){
			label_1.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Lightning God.png")));
		}
		else{
			label_1.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		JLabel label_2 = new JLabel("New label");
		if (model.getBadge(4).getAchieved()){
			label_2.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Bird.png")));
		}
		else{
			label_2.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_3 = new JLabel("New label");
		if (model.getBadge(5).getAchieved()){
			label_3.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Eagle.png")));
		}
		else{
			label_3.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_4 = new JLabel("New label");
		if (model.getBadge(6).getAchieved()){
			label_4.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Sword and Shield.png")));
		}
		else{
			label_4.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_5 = new JLabel("New label");
		if (model.getBadge(7).getAchieved()){
			label_5.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Baseball.PNG")));
		}
		else{
			label_5.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_6 = new JLabel("New label");
		if (model.getBadge(8).getAchieved()){
			label_6.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Joker.png")));
		}
		else{
			label_6.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_7 = new JLabel("New label");
		if (model.getBadge(9).getAchieved()){
			label_7.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Wizard.png")));
		}
		else{
			label_7.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		
		JLabel label_8 = new JLabel("New label");
		if (model.getBadge(10).getAchieved()){
			label_8.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/Sage.png")));
		}
		else{
			label_8.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/NotStarIcon.png")));
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
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
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addGap(142))
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
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(78))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(66))))
		);
		
		back = new JButton("");
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setIcon(new ImageIcon(AchievementView.class.getResource("/Images/BackIcon.png")));
		back.setBackground(new Color(255, 204, 0));
		back.setFont(new Font("Tahoma", Font.BOLD, 8));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuView view = new MainMenuView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblBadges = new JLabel("BADGES");
		lblBadges.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblBadges.setForeground(new Color(255, 250, 205));
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
}
