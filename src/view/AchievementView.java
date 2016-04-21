package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Kabasuji.Kabasuji;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AchievementView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	JButton back;
	Kabasuji model;

	/**
	 * Create the frame.
	 */
	public AchievementView(Kabasuji model) {
		this.model = model;
		initialize();
	}
	
	public void initialize(){
		getContentPane().setBackground(new Color(255, 250, 205));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 89));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		
		table = new JTable();
		table.setToolTipText(model.getBadge(1).getName() + ": " + model.getBadge(1).getDescription());
		table.setBackground(new Color(250, 250, 210));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		table_1 = new JTable();
		table_1.setToolTipText(model.getBadge(3).getName() + ": " + model.getBadge(3).getDescription());
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_1.setBackground(new Color(250, 250, 210));
		
		table_2 = new JTable();
		table_2.setToolTipText(model.getBadge(5).getName() + ": " + model.getBadge(5).getDescription());
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.setBackground(new Color(250, 250, 210));
		
		table_3 = new JTable();
		table_3.setToolTipText(model.getBadge(2).getName() + ": " + model.getBadge(2).getDescription());
		table_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_3.setBackground(new Color(250, 250, 210));
		
		table_4 = new JTable();
		table_4.setToolTipText(model.getBadge(4).getName() + ": " + model.getBadge(4).getDescription());
		table_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_4.setBackground(new Color(250, 250, 210));
		
		table_5 = new JTable();
		table_5.setToolTipText(model.getBadge(6).getName() + ": " + model.getBadge(6).getDescription());
		table_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_5.setBackground(new Color(250, 250, 210));
		
		table_6 = new JTable();
		table_6.setToolTipText(model.getBadge(7).getName() + ": " + model.getBadge(7).getDescription());
		table_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_6.setBackground(new Color(250, 250, 210));
		
		table_7 = new JTable();
		table_7.setToolTipText(model.getBadge(8).getName() + ": " + model.getBadge(8).getDescription());
		table_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_7.setBackground(new Color(250, 250, 210));
		
		table_8 = new JTable();
		table_8.setToolTipText(model.getBadge(9).getName() + ": " + model.getBadge(9).getDescription());
		table_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_8.setBackground(new Color(250, 250, 210));
		
		table_9 = new JTable();
		table_9.setToolTipText(model.getBadge(10).getName() + ": " + model.getBadge(10).getDescription());
		table_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_9.setBackground(new Color(250, 250, 210));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(70)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(table_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(88)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(table_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(93)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(table_9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(50))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(table_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(table_9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(84, Short.MAX_VALUE))
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
