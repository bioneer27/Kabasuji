package Kabasuji;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ReleaseLevelView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReleaseLevelView window = new ReleaseLevelView();
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
	public ReleaseLevelView() {
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
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.setForeground(new Color(255, 250, 205));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReleasePlayView view = new ReleasePlayView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);
			}
		});
		
		JButton button = new JButton("2");
		button.setForeground(new Color(255, 250, 205));
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button.setBackground(new Color(244, 164, 96));
		
		JButton button_1 = new JButton("3");
		button_1.setForeground(new Color(255, 250, 205));
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_1.setBackground(new Color(244, 164, 96));
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setForeground(new Color(255, 250, 205));
		button_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_2.setBackground(new Color(244, 164, 96));
		
		JButton button_3 = new JButton("5");
		button_3.setForeground(new Color(255, 250, 205));
		button_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		button_3.setBackground(new Color(244, 164, 96));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		
		JButton button_4 = new JButton("<");
		button_4.setForeground(new Color(255, 250, 205));
		button_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_4.setBackground(new Color(244, 164, 96));
		
		JButton button_5 = new JButton(">");
		button_5.setForeground(new Color(255, 250, 205));
		button_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_5.setBackground(new Color(244, 164, 96));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(146)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(191)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(259)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(171)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(284, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		
		JLabel lblPuzzle = new JLabel("RELEASE\r\n");
		lblPuzzle.setForeground(new Color(255, 248, 220));
		lblPuzzle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblPuzzle.setBackground(new Color(233, 150, 122));
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayMenuView view = new PlayMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				getFrame().setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(218, 165, 32));
		btnNewButton_1.setForeground(new Color(255, 250, 205));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(273)
					.addComponent(lblPuzzle))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblPuzzle))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}

