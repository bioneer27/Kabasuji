package Kabasuji;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MainMenuView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuView frame = new MainMenuView();
					frame.setVisible(true);
					PlayMenuView frame2 = new PlayMenuView();
					frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenuView() {
		setBackground(new Color(255, 250, 205));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblKabasuji = new JLabel("Kabasuji");
		lblKabasuji.setFont(new Font("Vijaya", Font.BOLD, 95));
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayMenuView view = new PlayMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setForeground(new Color(255, 250, 205));
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		
		JButton button = new JButton("");
		button.setToolTipText("View Badges");
		button.setForeground(new Color(255, 250, 205));
		button.setBackground(new Color(255, 250, 205));
		button.setIcon(new ImageIcon("C:\\Users\\SilverX\\Documents\\Eclipse\\Kabasuji\\src\\Images\\BadgeIcon.png"));
		
		JButton btnNewButton_1 = new JButton("RULES");
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnCredits = new JButton("CREDITS");
		btnCredits.setBackground(new Color(230, 230, 250));
		btnCredits.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(321)
					.addComponent(lblKabasuji, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(317, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCredits, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
					.addGap(216))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblKabasuji, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCredits, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
