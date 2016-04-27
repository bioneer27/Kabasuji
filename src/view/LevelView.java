package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kabasuji.PieceType;
import model.Level;
import model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.util.Timer;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Controller.LevelController;

import java.awt.Insets;

/**
 * @author Alex Guerra
 *
 */
public class LevelView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Lightning Timer attributes
	private Timer timer = new Timer();
	JTextField timeLeft;
	public JTextField getTimeLeftLabel(){return timeLeft;}
	
	//general attributes, except for release, used for moves and seconds
	private int counter;
	private int curCount;
	
	//views that this view can get to
	private AllLevelsView allView;
	
	//buttons in this view
	JButton back;
	
	//model of the level to get stats from
	private Level level;
	
	Model model;

	/**
	 * Create the frame.
	 */
	public LevelView(Model model, Level level) {
		this.model = model;
		this.setLevel(level);
		this.counter = level.getCounter();
		this.curCount = level.getCurCount();
		initialize();
	}
	
	public void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 250, 205));
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		//remove buttons if doing scrolling, but remove from window builder, not here
		JButton btnScrollDown = new JButton("Scroll Down");
		btnScrollDown.setBackground(Color.PINK);		
		JButton btnScrollUp = new JButton("Scroll Up");
		btnScrollUp.setBackground(Color.PINK);
		
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
		timeLeft.setText("" + (getCounter() - getCurCount()));
		
		getTimer().cancel();
		setCurCount(0);
		setTimer(new Timer());
		getTimer().schedule(new LevelController(this, model), 0, 100);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentX(0.0f);
		panel_2.setAlignmentY(0.0f);
		//Lightning color 100, 149, 237
		//Puzzle color 240, 128, 128
		//Release color 244, 164, 96
		if(getLevel().getType() == PieceType.LIGHTNING)
			panel_2.setBackground(new Color(100, 149, 237));
		else if(getLevel().getType() == PieceType.PUZZLE)
			panel_2.setBackground(new Color(240, 128, 128));
		else if(getLevel().getType() == PieceType.RELEASE)
			panel_2.setBackground(new Color(244, 164, 96));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnScrollDown)
						.addComponent(btnScrollUp, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(793, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(704)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnScrollUp)
					.addGap(398)
					.addComponent(btnScrollDown)
					.addGap(160))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(90)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(224, Short.MAX_VALUE))
		);
		
		JLabel lblLevel = new JLabel("LEVEL " + getLevel().getNumber());
		lblLevel.setForeground(new Color(255, 250, 205));
		lblLevel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("");
		if(level.getStars() >= 1)
			lblNewLabel.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			lblNewLabel.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label = new JLabel("");
		if(level.getStars() >= 2)
			label.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_1 = new JLabel("");
		if(level.getStars() == 3)
			label_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/StarIcon.png")));
		else
			label_1.setIcon(new ImageIcon(LevelView.class.getResource("/Images/NotStarIcon.png")));
		
		//setup back button
		back = new JButton("");
		back.setName("back");
		//set button listener depending on the level type
		back.addActionListener(new LevelController(this, model));
		back.setMargin(new Insets(0, 0, 0, 0));
		back.setAlignmentY(0.0f);
		back.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setIcon(new ImageIcon(LevelView.class.getResource("/Images/BackIcon.png")));
		//Lightning dark color 65, 105, 225
		//puzzle dark color 205, 92, 92
		//release dark 210, 105, 30
		if(level.getType() == PieceType.RELEASE)
			back.setBackground(new Color(210, 105, 30));
		if(level.getType() == PieceType.LIGHTNING)
			back.setBackground(new Color(65, 105, 225));
		if(level.getType() == PieceType.PUZZLE)
			back.setBackground(new Color(205, 92, 92));
				
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(7)
					.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(301)
					.addComponent(lblLevel)
					.addGap(282)
					.addComponent(lblNewLabel)
					.addGap(5)
					.addComponent(label)
					.addGap(5)
					.addComponent(label_1)
					.addGap(73))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(5)
							.addComponent(lblLevel))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(6)
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(label)
								.addComponent(label_1))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		//panel_2.setLayout(gl_panel_2);   HEINEMAN - PUT BACK IN
		contentPane.setLayout(gl_contentPane);
	}

	public AllLevelsView getAllLevelsView() {
		return allView;
	}

	public void setAllLevelsView(AllLevelsView allView) {
		this.allView = allView;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getCurCount() {
		return curCount;
	}

	public void setCurCount(int curCount) {
		this.curCount = curCount;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}
}
