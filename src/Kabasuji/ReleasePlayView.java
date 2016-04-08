package Kabasuji;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;

public class ReleasePlayView extends JFrame {

	private JPanel contentPane;
	private JTextField txtSets;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReleasePlayView frame = new ReleasePlayView();
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
	public ReleasePlayView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		
		JButton btnNewButton = new JButton("^");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnV = new JButton("v");
		btnV.setBackground(new Color(255, 140, 0));
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtSets = new JTextField();
		txtSets.setForeground(new Color(244, 164, 96));
		txtSets.setBackground(new Color(255, 250, 205));
		txtSets.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		txtSets.setText("SETS:\r\n");
		txtSets.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 960, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(72)
							.addComponent(btnNewButton)))
					.addGap(108)
					.addComponent(txtSets, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(247, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(855, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtSets, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
		panel_2.setLayout(new GridLayout(3, 6, 0, 0));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(205, 92, 92));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.setBackground(new Color(50, 205, 50));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton_9);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button = new JButton("<");
		button.setBackground(new Color(255, 140, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenuView view = new MainMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		JButton button_1 = new JButton("<\u0E32");
		button_1.setBackground(new Color(255, 140, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PlayMenuView view = new PlayMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel = new JLabel("LEVEL 3\r\n");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(226)
					.addComponent(lblNewLabel)
					.addContainerGap(415, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGap(7))))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
