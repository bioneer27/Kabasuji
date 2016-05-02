/*
 * 
 */
package builderView;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import builderModel.PieceType;
import builderModel.Level;
import builderModel.LBModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.util.Timer;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import builderController.BoardController;
import builderController.BullpenController;
import builderController.LevelBuilderController;

import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * @author Alex Guerra
 *
 */
public class LevelBuilderView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The timer. */
	//Lightning Timer attributes
	private Timer timer = new Timer();
	
	/** The counter view. */
	JTextField counterView;
	
	/**
	 * Gets the counter label.
	 *
	 * @return the counter label
	 */
	public JTextField getCounterLabel(){return counterView;}
	
	/** The text field. */
	//textfields for release sets
	JTextField textField;
	
	/** The text field_1. */
	JTextField textField_1;
	
	/** The text field_2. */
	JTextField textField_2;
	
	/** The counter. */
	//general attributes, except for release, used for moves and seconds
	private int counter;
	
	/** The cur count. */
	private int curCount;
	
	/** The all view. */
	//views that this view can get to
	private AllLevelsView allView;
	private LevelBuilderMenu menuView;
	
	public LevelBuilderMenu getMenuView() {
		return menuView;
	}

	public void setMenuView(LevelBuilderMenu menuView) {
		this.menuView = menuView;
	}

	/** The back. */
 //buttons in this view
	private JButton back;
	
	private JButton MakeHint;
	
	private JButton ClearAll;
	
	private JButton Publish;

	
	/** The level. */
	//model of the level to get stats from
	private Level level;
	
	/** The model. */
	LBModel model;

	/**
	 * Create the frame.
	 */
	public LevelBuilderView(LBModel model, Level level) {
		this.model = model;
		this.setLevel(level);
		this.counter = level.getCounter();
		this.curCount = level.getCurCount();
		initialize();
	}
	
	/**
	 * Initialize.
	 */
	public void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 250, 205));
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		
		//Lightning color 100, 149, 237
		//Puzzle color 240, 128, 128
		//Release color 244, 164, 96
		JLabel timeLabel = new JLabel("LABLE:");
		if(getLevel().getType() == PieceType.LIGHTNING){
			timeLabel.setText("TIME :");
			timeLabel.setForeground(new Color(100, 149, 237));
		}
		if(getLevel().getType() == PieceType.PUZZLE){
			timeLabel.setText("MOVES :");
			timeLabel.setForeground(new Color(240, 128, 128));
		}
		if(getLevel().getType() == PieceType.RELEASE){
			timeLabel.setText("SETS :");
			timeLabel.setForeground(new Color(244, 164, 96));
		}
		timeLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		//counter textfield for lightning and puzzle levels, hidden in release levels
		counterView = new JTextField();
		if(level.getType() == PieceType.RELEASE)
			counterView.setVisible(false);
		if(level.getType() == PieceType.LIGHTNING)
			counterView.setBackground(new Color(65, 105, 225));
		if(level.getType() == PieceType.PUZZLE)
			counterView.setBackground(new Color(205, 92, 92));
		counterView.setEditable(false);
		counterView.setForeground(new Color(255, 250, 205));
		counterView.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		counterView.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		counterView.setColumns(10);
		counterView.setText("" + (getCounter() - getCurCount()));
		
		//reset area for release levels, hidden for lightning and puzzle levels
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
		
		if(level.getType() != PieceType.RELEASE){
			textField.setVisible(false);
			textField_1.setVisible(false);
			textField_2.setVisible(false);
		}
		
		//start timer for lightning levels

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(timeLabel)
					.addGap(5)
					.addComponent(counterView, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(timeLabel))
						.addComponent(counterView, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
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
		
		BoardView boardView = new BoardView(level.getBoard());
		BullpenView bullpenView = new BullpenView(model.getLevel(level.getType(), level.getNumber()).getBullpen());
		boardView.setSize(new Dimension(80, 80));
		bullpenView.setSize(new Dimension(200, 400));
		boardView.addMouseListener(new BoardController(level.getBoard(), boardView));
		boardView.addMouseMotionListener(new BoardController(level.getBoard(), boardView));
		bullpenView.addMouseListener(new BullpenController(level.getBullpen(), bullpenView));
		
		boardView.setDraggingPiece(level.getBullpen().getSelectedPiece());
		level.getBoard().setBp(level.getBullpen());
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(new Dimension (750, 300));
		scrollPane.setViewportView(bullpenView);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(250);
		
		setMakeHint(new JButton("Make Hint"));
		getMakeHint().setName("Make Hint");
		getMakeHint().addActionListener(new LevelBuilderController(this, model));
		
		setClearAll(new JButton("Clear All"));
		getClearAll().setName("Clear All");
		getClearAll().addActionListener(new LevelBuilderController(this, model));
		
		setPublish(new JButton("Publish"));
		getPublish().setName("Publish");
		getPublish().addActionListener(new LevelBuilderController(this, model));


		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(boardView, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addGap(81)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
						.addComponent(MakeHint)
						.addComponent(ClearAll)
						.addComponent(Publish))
					.addGap(31))
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
								.addComponent(boardView, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(MakeHint)
							.addGap(18)
							.addComponent(ClearAll)
							.addGap(18)
							.addComponent(Publish)))
					.addGap(110))
		);
		
		JLabel lblLevel = new JLabel("LEVEL " + getLevel().getNumber());
		lblLevel.setForeground(new Color(255, 250, 205));
		lblLevel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("");
		if(level.getStars() >= 1)
			lblNewLabel.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/StarIcon.png")));
		else
			lblNewLabel.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label = new JLabel("");
		if(level.getStars() >= 2)
			label.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/StarIcon.png")));
		else
			label.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/NotStarIcon.png")));
		
		JLabel label_1 = new JLabel("");
		if(level.getStars() == 3)
			label_1.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/StarIcon.png")));
		else
			label_1.setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/NotStarIcon.png")));
		
		//setup back button
		setBack(new JButton(""));
		getBack().setName("back");
		//set button listener depending on the level type
		getBack().addActionListener(new LevelBuilderController(this, model));
		getBack().setMargin(new Insets(0, 0, 0, 0));
		getBack().setAlignmentY(0.0f);
		getBack().setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getBack().setIcon(new ImageIcon(LevelBuilderView.class.getResource("/Images/BackIcon.png")));
		//Lightning dark color 65, 105, 225
		//puzzle dark color 205, 92, 92
		//release dark 210, 105, 30
		if(level.getType() == PieceType.RELEASE)
			getBack().setBackground(new Color(210, 105, 30));
		if(level.getType() == PieceType.LIGHTNING)
			getBack().setBackground(new Color(65, 105, 225));
		if(level.getType() == PieceType.PUZZLE)
			getBack().setBackground(new Color(205, 92, 92));
				
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(7)
					.addComponent(getBack(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(getBack(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
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

	public JButton getMakeHint() {
		return MakeHint;
	}

	public void setMakeHint(JButton makeHint) {
		MakeHint = makeHint;
	}

	public JButton getClearAll() {
		return ClearAll;
	}

	public void setClearAll(JButton clearAll) {
		ClearAll = clearAll;
	}

	public JButton getPublish() {
		return Publish;
	}

	public void setPublish(JButton publish) {
		Publish = publish;
	}

	/**
	 * Gets the all levels view.
	 *
	 * @return the all levels view
	 */
	public AllLevelsView getAllLevelsView() {
		return allView;
	}

	/**
	 * Sets the all levels view.
	 *
	 * @param allView
	 *            the new all levels view
	 */
	public void setAllLevelsView(AllLevelsView allView) {
		this.allView = allView;
	}

	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level
	 *            the new level
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * Gets the cur count.
	 *
	 * @return the cur count
	 */
	public int getCurCount() {
		return curCount;
	}

	/**
	 * Sets the cur count.
	 *
	 * @param curCount
	 *            the new cur count
	 */
	public void setCurCount(int curCount) {
		this.curCount = curCount;
	}

	/**
	 * Gets the counter.
	 *
	 * @return the counter
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * Sets the counter.
	 *
	 * @param counter
	 *            the new counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public //buttons in this view
	JButton getBack() {
		return back;
	}

	public void setBack(//buttons in this view
	JButton back) {
		this.back = back;
	}
}
