package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

/**
 * @author Jetro
 *
 */
public class Application extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	JButton play;
	JButton rules;
	JButton credits;
	JButton achievements;

	/**
	 * Create the frame.
	 */
	public Application(Model model) {
		this.model = model;
		initialize();
	}
	
	public void initialize(){
		setResizable(false);
		setBackground(new Color(255, 250, 205));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbl_title = new JLabel("Kabasuji");
		lbl_title.setFont(new Font("Vivaldi", Font.BOLD, 95));
		
		play = new JButton("PLAY");
		play.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayMenuView view = new PlayMenuView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		play.setForeground(new Color(255, 250, 205));
		play.setBackground(new Color(154, 205, 50));
		play.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		
		achievements = new JButton("");
		achievements.setBorder(null);
		achievements.setFont(new Font("Tahoma", Font.PLAIN, 13));
		achievements.setToolTipText("View Badges");
		achievements.setForeground(new Color(255, 250, 205));
		achievements.setBackground(new Color(255, 250, 205));
		achievements.setIcon(new ImageIcon(Application.class.getResource("/Images/BadgeIcon.png")));
		achievements.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AchievementView view = new AchievementView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
				
			}
		});
		
		rules = new JButton("RULES");
		rules.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		rules.setBackground(new Color(230, 230, 250));
		rules.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		rules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RuleView view = new RuleView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		credits = new JButton("CREDITS");
		credits.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		credits.setBackground(new Color(230, 230, 250));
		credits.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		credits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreditView view = new CreditView(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(achievements, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(play, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rules, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(credits, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
					.addGap(216))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(278, Short.MAX_VALUE)
					.addComponent(lbl_title, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
					.addGap(248))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lbl_title, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(play, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(achievements, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(credits, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(rules, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
