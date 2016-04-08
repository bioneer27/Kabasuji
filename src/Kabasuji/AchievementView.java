package Kabasuji;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AchievementView extends JFrame {
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AchievementView frame = new AchievementView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AchievementView() {
		getContentPane().setBackground(new Color(255, 250, 205));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 89));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		
		table = new JTable();
		table.setToolTipText("This how to get badgeA");
		table.setBackground(new Color(250, 250, 210));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		table_1 = new JTable();
		table_1.setToolTipText("This is how to get badgeC");
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_1.setBackground(new Color(250, 250, 210));
		
		table_2 = new JTable();
		table_2.setToolTipText("This is how to get badgeE");
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.setBackground(new Color(250, 250, 210));
		
		table_3 = new JTable();
		table_3.setToolTipText("This is how to get badgeB");
		table_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_3.setBackground(new Color(250, 250, 210));
		
		table_4 = new JTable();
		table_4.setToolTipText("This is how to get badgeD");
		table_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_4.setBackground(new Color(250, 250, 210));
		
		table_5 = new JTable();
		table_5.setToolTipText("This is how to get badgeF");
		table_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_5.setBackground(new Color(250, 250, 210));
		
		table_6 = new JTable();
		table_6.setToolTipText("This is how to get badgeG");
		table_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_6.setBackground(new Color(250, 250, 210));
		
		table_7 = new JTable();
		table_7.setToolTipText("This is how to get badgeH");
		table_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_7.setBackground(new Color(250, 250, 210));
		
		table_8 = new JTable();
		table_8.setToolTipText("This is how to get badgeI");
		table_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_8.setBackground(new Color(250, 250, 210));
		
		table_9 = new JTable();
		table_9.setToolTipText("This is how to get badgeJ");
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
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuView view = new MainMenuView();
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
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
