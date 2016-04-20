package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Kabasuji.Release;

public class ReleasePlayView extends LevelView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel timeLeft;
	Release model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public ReleasePlayView(Release model){
		super(model);
		this.model = model;
		initialize();
	}
	
	public void initialize(){
		JPanel contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 250, 205));
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		
		JLabel sets = new JLabel("SETS:");
		sets.setForeground(new Color(244, 164, 96));
		sets.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(new Color(255, 250, 205));
		textField.setBackground(new Color(205, 92, 92));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 250, 205));
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBackground(new Color(65, 105, 225));
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 250, 205));
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBackground(new Color(34, 139, 34));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addComponent(sets)
					.addGap(100))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(sets)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(190, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		super.initialize(contentPane, panel);
	}
}
