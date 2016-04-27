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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

/**
 * @author Jetro
 *
 */
public class RuleView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton back;
	Model model;

	/**
	 * Create the frame.
	 */
	public RuleView(Model model) {
		this.model = model;
		initialize();
	}
	
	public void initialize(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblNewLabel = new JLabel("In Puzzle, you have to fill the board");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel lblGitCommit = new JLabel("In lightning, you need to finish before time runs out");
		lblGitCommit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel lbli = new JLabel("In Release, you need to get the three sets of colors 1-6");
		lbli.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel lblesc = new JLabel("4. 'esc' ':' 'w' 'q'");
		lblesc.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel lblGitPush = new JLabel("5. git push origin master");
		lblGitPush.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel lblGitPull = new JLabel("0. git pull");
		lblGitPull.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(271)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGitPull, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGitPush, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblesc, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGitCommit, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(lbli, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(399, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblGitPull, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGitCommit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbli, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblesc, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGitPush, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(227, Short.MAX_VALUE))
		);
		
		JLabel lblRules = new JLabel("RULES");
		lblRules.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		back = new JButton("");
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setIcon(new ImageIcon(RuleView.class.getResource("/Images/BackIcon.png")));
		back.setFont(new Font("Tahoma", Font.BOLD, 8));
		back.setBackground(new Color(169, 169, 169));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application view = new Application(model);
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(315)
					.addComponent(lblRules)
					.addContainerGap(430, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRules, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
