/*
 * 
 */
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.MainMenuController;
import model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

/**
 * @author Jetro
 *
 */
public class MainMenuView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The model. */
	Model model;
	
	/** The play. */
	//buttons for this view
	JButton play;
	
	/** The rules. */
	JButton rules;
	
	/** The credits. */
	JButton credits;
	
	/** The achievements. */
	JButton achievements;
	
	/** The ach view. */
	//all views that this view can get to
	AchievementView achView;
	
	/** The rule view. */
	RuleView ruleView;
	
	/** The cred view. */
	CreditView credView;
	
	/** The play view. */
	PlayMenuView playView;

	/**
	 * Create the frame.
	 */
	public MainMenuView(Model model) {
		this.model = model;
		initialize();
	}
	
	/**
	 * Initialize.
	 */
	public void initialize(){
		//setup the frame
		setResizable(false);
		setBackground(new Color(255, 250, 205));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//title label
		JLabel lbl_title = new JLabel("Kabasuji");
		lbl_title.setFont(new Font("Vivaldi", Font.BOLD, 95));
		
		//setup play button
		play = new JButton("PLAY");
		play.setName("play");
		play.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		play.setForeground(new Color(255, 250, 205));
		play.setBackground(new Color(154, 205, 50));
		play.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		play.addActionListener(new MainMenuController(this, model));
		
		//setup achievements button
		achievements = new JButton("");
		achievements.setName("achievements");
		achievements.setBorder(null);
		achievements.setFont(new Font("Tahoma", Font.PLAIN, 13));
		achievements.setToolTipText("View Badges");
		achievements.setForeground(new Color(255, 250, 205));
		achievements.setBackground(new Color(255, 250, 205));
		achievements.setIcon(new ImageIcon(MainMenuView.class.getResource("/Images/BadgeIcon.png")));
		achievements.addActionListener(new MainMenuController(this, model));
		
		//setup rules button
		rules = new JButton("RULES");
		rules.setName("rules");
		rules.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		rules.setBackground(new Color(230, 230, 250));
		rules.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		rules.addActionListener(new MainMenuController(this, model));
		
		//setup credits button
		credits = new JButton("CREDITS");
		credits.setName("credits");
		credits.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		credits.setBackground(new Color(230, 230, 250));
		credits.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		credits.addActionListener(new MainMenuController(this, model));
		
		//setup group layout
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

	/**
	 * Gets the achievement view.
	 *
	 * @return the achievement view
	 */
	public AchievementView getAchievementView() {
		return achView;
	}

	/**
	 * Sets the achievement view.
	 *
	 * @param achView
	 *            the new achievement view
	 */
	public void setAchievementView(AchievementView achView) {
		this.achView = achView;
	}

	/**
	 * Gets the play view.
	 *
	 * @return the play view
	 */
	public PlayMenuView getPlayView() {
		return playView;
	}

	/**
	 * Sets the play view.
	 *
	 * @param playView
	 *            the new play view
	 */
	public void setPlayView(PlayMenuView playView) {
		this.playView = playView;
	}

	/**
	 * Gets the credit view.
	 *
	 * @return the credit view
	 */
	public CreditView getCreditView() {
		return credView;
	}

	/**
	 * Sets the credit view.
	 *
	 * @param credView
	 *            the new credit view
	 */
	public void setCreditView(CreditView credView) {
		this.credView = credView;
	}

	/**
	 * Gets the rule view.
	 *
	 * @return the rule view
	 */
	public RuleView getRuleView() {
		return ruleView;
	}

	/**
	 * Sets the rule view.
	 *
	 * @param ruleView
	 *            the new rule view
	 */
	public void setRuleView(RuleView ruleView) {
		this.ruleView = ruleView;
	}
}
