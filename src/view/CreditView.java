package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

/**
 * @author Jetro
 *
 */
public class CreditView extends JFrame {

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
	public CreditView(Model model) {
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
		
		JLabel lblCredits = new JLabel("CREDITS\r\n");
		lblCredits.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		back = new JButton("");
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setIcon(new ImageIcon(CreditView.class.getResource("/Images/BackIcon.png")));
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
					.addGap(24)
					.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(312)
					.addComponent(lblCredits)
					.addContainerGap(384, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCredits, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblMe = new JLabel("Alex, Anne, Himanjal, Jetro,  Xavier, Yoryos");
		lblMe.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 942, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblMe)
					.addGap(439))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addComponent(lblMe)
					.addContainerGap(357, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
