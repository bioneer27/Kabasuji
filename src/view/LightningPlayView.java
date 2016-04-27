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

import model.Lightning;

/**
 * @author Jetro
 *
 */
public class LightningPlayView extends LevelView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Lightning model;
	JTextField timeLeft;
	
	public LightningPlayView(Lightning model){
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
		
		JLabel timeLabel = new JLabel("TIME:");
		timeLabel.setForeground(new Color(100, 149, 237));
		timeLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		timeLeft = new JTextField();
		timeLeft.setEditable(false);
		timeLeft.setForeground(new Color(255, 250, 205));
		timeLeft.setBackground(new Color(65, 105, 225));
		timeLeft.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		timeLeft.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		timeLeft.setColumns(10);
		timeLeft.setText("" + model.getTimeLeft());
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addContainerGap(42, Short.MAX_VALUE)
						.addComponent(timeLabel)
						.addGap(5)
						.addComponent(timeLeft, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addGap(36))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
						.addGap(24)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(2)
								.addComponent(timeLabel))
							.addComponent(timeLeft, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(293, Short.MAX_VALUE))
			);
		panel.setLayout(gl_panel);
		super.initialize(contentPane, panel);
	}
	
	public JTextField getTimeLeftLabel(){return timeLeft;}
}
