package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Kabasuji.Puzzle;

public class PuzzlePlayView extends LevelView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel movesLeft;
	Puzzle model;
	private JTextField textField;
	
	public PuzzlePlayView(Puzzle model){
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
		
		JLabel movesLeft = new JLabel("MOVES:");
		movesLeft.setForeground(new Color(240, 128, 128));
		movesLeft.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(new Color(255, 250, 205));
		textField.setBackground(new Color(205, 92, 92));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setText("" + model.getMovesLeft());
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addContainerGap(42, Short.MAX_VALUE)
						.addComponent(movesLeft)
						.addGap(5)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addGap(36))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
						.addGap(24)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(2)
								.addComponent(movesLeft))
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(293, Short.MAX_VALUE))
			);
		panel.setLayout(gl_panel);
		super.initialize(contentPane, panel);
	}
}
