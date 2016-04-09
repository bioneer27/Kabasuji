package Kabasuji;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * @author Jetro
 *
 */
public class LightningPlayView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightningPlayView frame = new LightningPlayView();
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
	public LightningPlayView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JPanel BoardPanel = new JPanel();
		
		JPanel Box1 = new JPanel();
		
		JPanel Box2 = new JPanel();
		Box2.setLayout(new GridLayout(6, 6, 0, 0));
		
		JButton button_166 = new JButton("");
		button_166.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_166);
		
		JButton button_167 = new JButton("");
		button_167.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_167);
		
		JButton button_168 = new JButton("");
		button_168.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_168);
		
		JButton button_169 = new JButton("");
		button_169.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_169);
		
		JButton button_170 = new JButton("");
		button_170.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_170);
		
		JButton button_171 = new JButton("");
		button_171.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_171);
		
		JButton button_172 = new JButton("");
		button_172.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_172);
		
		JButton button_173 = new JButton("");
		button_173.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_173);
		
		JButton button_174 = new JButton("");
		button_174.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_174);
		
		JButton button_175 = new JButton("");
		button_175.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_175);
		
		JButton button_176 = new JButton("");
		button_176.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_176);
		
		JButton button_177 = new JButton("");
		button_177.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_177);
		
		JButton button_178 = new JButton("");
		button_178.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_178);
		
		JButton button_179 = new JButton("");
		button_179.setBackground(Color.ORANGE);
		Box2.add(button_179);
		
		JButton button_180 = new JButton("");
		button_180.setBackground(Color.ORANGE);
		Box2.add(button_180);
		
		JButton button_181 = new JButton("");
		button_181.setBackground(Color.ORANGE);
		Box2.add(button_181);
		
		JButton button_182 = new JButton("");
		button_182.setBackground(Color.ORANGE);
		Box2.add(button_182);
		
		JButton button_183 = new JButton("");
		button_183.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_183);
		
		JButton button_184 = new JButton("");
		button_184.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_184);
		
		JButton button_185 = new JButton("");
		button_185.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_185);
		
		JButton button_186 = new JButton("");
		button_186.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_186);
		
		JButton button_187 = new JButton("");
		button_187.setBackground(Color.ORANGE);
		Box2.add(button_187);
		
		JButton button_188 = new JButton("");
		button_188.setBackground(Color.ORANGE);
		Box2.add(button_188);
		
		JButton button_189 = new JButton("");
		button_189.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_189);
		
		JButton button_190 = new JButton("");
		button_190.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_190);
		
		JButton button_191 = new JButton("");
		button_191.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_191);
		
		JButton button_192 = new JButton("");
		button_192.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_192);
		
		JButton button_193 = new JButton("");
		button_193.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_193);
		
		JButton button_194 = new JButton("");
		button_194.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_194);
		
		JButton button_195 = new JButton("");
		button_195.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_195);
		
		JButton button_196 = new JButton("");
		button_196.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_196);
		
		JButton button_197 = new JButton("");
		button_197.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_197);
		
		JButton button_198 = new JButton("");
		button_198.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_198);
		
		JButton button_199 = new JButton("");
		button_199.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_199);
		
		JButton button_200 = new JButton("");
		button_200.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_200);
		
		JButton button_201 = new JButton("");
		button_201.setBackground(Color.LIGHT_GRAY);
		Box2.add(button_201);
		
		JPanel Buttons = new JPanel();
		Buttons.setBackground(Color.LIGHT_GRAY);
		
		JButton btnScrollDown = new JButton("Scroll Down");
		btnScrollDown.setBackground(Color.PINK);
		
		JButton btnScrollUp = new JButton("Scroll Up");
		btnScrollUp.setBackground(Color.PINK);
		
		JPanel Sets = new JPanel();
		
		JLabel lblSets = new JLabel("SETS:");
		lblSets.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 130, 238));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(Box1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
										.addComponent(Box2, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
									.addGap(1)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addGap(1)
									.addComponent(BoardPanel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addGap(1)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblSets)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(Sets, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(42)
									.addComponent(btnScrollUp, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
							.addGap(55)
							.addComponent(Buttons, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(btnScrollDown)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(61)
							.addComponent(lblSets)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Sets, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(Buttons, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnScrollUp)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(BoardPanel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(Box1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
											.addGap(1)
											.addComponent(Box2, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnScrollDown)))
					.addContainerGap())
		);
		
		JButton button_237 = new JButton("<");
		button_237.setContentAreaFilled(false);
		button_237.setBorder(null);
		button_237.setBackground(new Color(255, 0, 255));
		button_237.setFont(new Font("Comic Sans MS", Font.BOLD, 37));
		button_237.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayMenuView view = new PlayMenuView();
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
				dispose();
			}
		});
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(27)
					.addComponent(button_237)
					.addContainerGap(904, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(button_237, GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(new GridLayout(12, 1, 0, 0));
		
		JButton btnNewButton_24 = new JButton("");
		btnNewButton_24.setContentAreaFilled(false);
		btnNewButton_24.setBorderPainted(false);
		btnNewButton_24.setBorder(null);
		btnNewButton_24.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_24);
		
		JButton button_227 = new JButton("");
		button_227.setContentAreaFilled(false);
		button_227.setBorderPainted(false);
		button_227.setBorder(null);
		button_227.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_227);
		
		JButton button_228 = new JButton("");
		button_228.setContentAreaFilled(false);
		button_228.setBorderPainted(false);
		button_228.setBorder(null);
		button_228.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_228);
		
		JButton button_229 = new JButton("");
		button_229.setContentAreaFilled(false);
		button_229.setBorderPainted(false);
		button_229.setBorder(null);
		button_229.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_229);
		
		JButton button_230 = new JButton("");
		button_230.setContentAreaFilled(false);
		button_230.setBorderPainted(false);
		button_230.setBorder(null);
		button_230.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_230);
		
		JButton btnNewButton_23 = new JButton("");
		btnNewButton_23.setContentAreaFilled(false);
		btnNewButton_23.setBorderPainted(false);
		btnNewButton_23.setBorder(null);
		btnNewButton_23.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_23);
		
		JButton button_231 = new JButton("");
		button_231.setContentAreaFilled(false);
		button_231.setBorderPainted(false);
		button_231.setBorder(null);
		button_231.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_231);
		
		JButton button_232 = new JButton("");
		button_232.setContentAreaFilled(false);
		button_232.setBorderPainted(false);
		button_232.setBorder(null);
		button_232.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_232);
		
		JButton button_233 = new JButton("");
		button_233.setContentAreaFilled(false);
		button_233.setBorderPainted(false);
		button_233.setBorder(null);
		button_233.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_233);
		
		JButton button_235 = new JButton("");
		button_235.setContentAreaFilled(false);
		button_235.setBorderPainted(false);
		button_235.setBorder(null);
		button_235.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_235);
		
		JButton button_236 = new JButton("");
		button_236.setContentAreaFilled(false);
		button_236.setBorderPainted(false);
		button_236.setBorder(null);
		button_236.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_236);
		
		JButton button_234 = new JButton("");
		button_234.setContentAreaFilled(false);
		button_234.setBorderPainted(false);
		button_234.setBorder(null);
		button_234.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_234);
		panel.setLayout(new GridLayout(12, 0, 0, 0));
		
		JButton btnNewButton_22 = new JButton("");
		btnNewButton_22.setContentAreaFilled(false);
		btnNewButton_22.setBorderPainted(false);
		btnNewButton_22.setBorder(null);
		btnNewButton_22.setBackground(Color.WHITE);
		panel.add(btnNewButton_22);
		
		JButton button_217 = new JButton("");
		button_217.setContentAreaFilled(false);
		button_217.setBorderPainted(false);
		button_217.setBorder(null);
		button_217.setBackground(Color.WHITE);
		panel.add(button_217);
		
		JButton button_218 = new JButton("");
		button_218.setContentAreaFilled(false);
		button_218.setBorderPainted(false);
		button_218.setBorder(null);
		button_218.setBackground(Color.WHITE);
		panel.add(button_218);
		
		JButton btnNewButton_21 = new JButton("");
		btnNewButton_21.setContentAreaFilled(false);
		btnNewButton_21.setBorderPainted(false);
		btnNewButton_21.setBorder(null);
		btnNewButton_21.setBackground(Color.WHITE);
		panel.add(btnNewButton_21);
		
		JButton button_219 = new JButton("");
		button_219.setContentAreaFilled(false);
		button_219.setBorderPainted(false);
		button_219.setBorder(null);
		button_219.setBackground(Color.WHITE);
		panel.add(button_219);
		
		JButton button_221 = new JButton("");
		button_221.setContentAreaFilled(false);
		button_221.setBorderPainted(false);
		button_221.setBorder(null);
		button_221.setBackground(Color.WHITE);
		panel.add(button_221);
		
		JButton button_222 = new JButton("");
		button_222.setContentAreaFilled(false);
		button_222.setBorderPainted(false);
		button_222.setBorder(null);
		button_222.setBackground(Color.WHITE);
		panel.add(button_222);
		
		JButton button_220 = new JButton("");
		button_220.setContentAreaFilled(false);
		button_220.setBorderPainted(false);
		button_220.setBorder(null);
		button_220.setBackground(Color.WHITE);
		panel.add(button_220);
		
		JButton button_223 = new JButton("");
		button_223.setContentAreaFilled(false);
		button_223.setBorderPainted(false);
		button_223.setBorder(null);
		button_223.setBackground(Color.WHITE);
		panel.add(button_223);
		
		JButton button_225 = new JButton("");
		button_225.setContentAreaFilled(false);
		button_225.setBorderPainted(false);
		button_225.setBorder(null);
		button_225.setBackground(Color.WHITE);
		panel.add(button_225);
		
		JButton button_226 = new JButton("");
		button_226.setContentAreaFilled(false);
		button_226.setBorderPainted(false);
		button_226.setBorder(null);
		button_226.setBackground(Color.WHITE);
		panel.add(button_226);
		
		JButton button_224 = new JButton("");
		button_224.setContentAreaFilled(false);
		button_224.setBorderPainted(false);
		button_224.setBorder(null);
		button_224.setBackground(Color.WHITE);
		panel.add(button_224);
		Sets.setLayout(new GridLayout(6, 3, 0, 0));
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.setBackground(Color.RED);
		Sets.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.setBackground(Color.CYAN);
		Sets.add(btnNewButton_19);
		
		JButton button_202 = new JButton("");
		button_202.setBackground(Color.GREEN);
		Sets.add(button_202);
		
		JButton button_203 = new JButton("");
		button_203.setBackground(Color.RED);
		Sets.add(button_203);
		
		JButton button_204 = new JButton("");
		button_204.setBackground(Color.CYAN);
		Sets.add(button_204);
		
		JButton button_205 = new JButton("");
		button_205.setBackground(Color.GREEN);
		Sets.add(button_205);
		
		JButton button_206 = new JButton("");
		button_206.setBackground(Color.RED);
		Sets.add(button_206);
		
		JButton button_208 = new JButton("");
		button_208.setBackground(Color.CYAN);
		Sets.add(button_208);
		
		JButton button_209 = new JButton("");
		button_209.setBackground(Color.GREEN);
		Sets.add(button_209);
		
		JButton button_210 = new JButton("");
		button_210.setBackground(Color.RED);
		Sets.add(button_210);
		
		JButton button_211 = new JButton("");
		button_211.setBackground(Color.CYAN);
		Sets.add(button_211);
		
		JButton button_212 = new JButton("");
		button_212.setBackground(Color.GREEN);
		Sets.add(button_212);
		
		JButton button_213 = new JButton("");
		button_213.setBackground(Color.RED);
		Sets.add(button_213);
		
		JButton button_214 = new JButton("");
		button_214.setBackground(Color.CYAN);
		Sets.add(button_214);
		
		JButton button_215 = new JButton("");
		button_215.setBackground(Color.GREEN);
		Sets.add(button_215);
		
		JButton button_216 = new JButton("");
		button_216.setBackground(Color.RED);
		Sets.add(button_216);
		
		JButton button_207 = new JButton("");
		button_207.setBackground(Color.CYAN);
		Sets.add(button_207);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.setBackground(Color.GREEN);
		Sets.add(btnNewButton_20);
		Buttons.setLayout(new GridLayout(4, 1, 40, 40));
		
		JButton btnNewButton_14 = new JButton("Make Hint");
		btnNewButton_14.setBackground(Color.ORANGE);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Buttons.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("Publish Level");
		btnNewButton_16.setBackground(Color.MAGENTA);
		Buttons.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("Test Level");
		btnNewButton_15.setBackground(Color.PINK);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Buttons.add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("Clear All");
		btnNewButton_17.setBackground(Color.RED);
		Buttons.add(btnNewButton_17);
		Box1.setLayout(new GridLayout(6, 6, 0, 0));
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setForeground(Color.GRAY);
		btnNewButton_13.setBackground(Color.LIGHT_GRAY);
		Box1.add(btnNewButton_13);
		
		JButton button = new JButton("");
		button.setForeground(Color.GRAY);
		button.setBackground(Color.LIGHT_GRAY);
		Box1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setForeground(Color.GRAY);
		button_1.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_1);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setForeground(Color.GRAY);
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		Box1.add(btnNewButton_8);
		
		JButton button_26 = new JButton("");
		button_26.setForeground(Color.GRAY);
		button_26.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_26);
		
		JButton button_40 = new JButton("");
		button_40.setForeground(Color.GRAY);
		button_40.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setForeground(Color.GRAY);
		button_41.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_41);
		
		JButton button_72 = new JButton("");
		button_72.setForeground(Color.GRAY);
		button_72.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_72);
		
		JButton button_73 = new JButton("");
		button_73.setForeground(Color.GRAY);
		button_73.setBackground(Color.YELLOW);
		Box1.add(button_73);
		
		JButton button_86 = new JButton("");
		button_86.setForeground(Color.GRAY);
		button_86.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_86);
		
		JButton button_87 = new JButton("");
		button_87.setForeground(Color.GRAY);
		button_87.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_87);
		
		JButton button_110 = new JButton("");
		button_110.setForeground(Color.GRAY);
		button_110.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_110);
		
		JButton button_111 = new JButton("");
		button_111.setForeground(Color.GRAY);
		button_111.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_111);
		
		JButton button_124 = new JButton("");
		button_124.setForeground(Color.GRAY);
		button_124.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_124);
		
		JButton button_125 = new JButton("");
		button_125.setForeground(Color.GRAY);
		button_125.setBackground(Color.YELLOW);
		Box1.add(button_125);
		
		JButton button_138 = new JButton("");
		button_138.setForeground(Color.GRAY);
		button_138.setBackground(Color.YELLOW);
		Box1.add(button_138);
		
		JButton button_139 = new JButton("");
		button_139.setForeground(Color.GRAY);
		button_139.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_139);
		
		JButton button_152 = new JButton("");
		button_152.setForeground(Color.GRAY);
		button_152.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_152);
		
		JButton button_154 = new JButton("");
		button_154.setForeground(Color.GRAY);
		button_154.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_154);
		
		JButton button_155 = new JButton("");
		button_155.setForeground(Color.GRAY);
		button_155.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_155);
		
		JButton button_156 = new JButton("");
		button_156.setForeground(Color.GRAY);
		button_156.setBackground(Color.YELLOW);
		Box1.add(button_156);
		
		JButton button_157 = new JButton("");
		button_157.setForeground(Color.GRAY);
		button_157.setBackground(Color.YELLOW);
		Box1.add(button_157);
		
		JButton button_158 = new JButton("");
		button_158.setForeground(Color.GRAY);
		button_158.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_158);
		
		JButton button_159 = new JButton("");
		button_159.setForeground(Color.GRAY);
		button_159.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_159);
		
		JButton button_160 = new JButton("");
		button_160.setForeground(Color.GRAY);
		button_160.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_160);
		
		JButton button_161 = new JButton("");
		button_161.setForeground(Color.GRAY);
		button_161.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_161);
		
		JButton button_162 = new JButton("");
		button_162.setForeground(Color.GRAY);
		button_162.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_162);
		
		JButton button_163 = new JButton("");
		button_163.setForeground(Color.GRAY);
		button_163.setBackground(Color.YELLOW);
		Box1.add(button_163);
		
		JButton button_164 = new JButton("");
		button_164.setForeground(Color.GRAY);
		button_164.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_164);
		
		JButton button_165 = new JButton("");
		button_165.setForeground(Color.GRAY);
		button_165.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_165);
		
		JButton button_153 = new JButton("");
		button_153.setForeground(Color.GRAY);
		button_153.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_153);
		
		JButton button_44 = new JButton("");
		button_44.setForeground(Color.GRAY);
		button_44.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setForeground(Color.GRAY);
		button_45.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_45);
		
		JButton button_58 = new JButton("");
		button_58.setForeground(Color.GRAY);
		button_58.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setForeground(Color.GRAY);
		button_59.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_59);
		
		JButton button_27 = new JButton("");
		button_27.setForeground(Color.GRAY);
		button_27.setBackground(Color.LIGHT_GRAY);
		Box1.add(button_27);
		BoardPanel.setLayout(new GridLayout(12, 12, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BoardPanel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_7);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_1);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(Color.BLACK);
		btnNewButton_12.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.BLACK);
		btnNewButton_10.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBackground(Color.BLACK);
		btnNewButton_11.setForeground(Color.YELLOW);
		BoardPanel.add(btnNewButton_11);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.BLACK);
		button_2.setForeground(Color.YELLOW);
		BoardPanel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.BLACK);
		button_3.setForeground(Color.YELLOW);
		BoardPanel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.BLACK);
		button_4.setForeground(Color.YELLOW);
		BoardPanel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.BLACK);
		button_5.setForeground(Color.YELLOW);
		BoardPanel.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.BLACK);
		button_6.setForeground(Color.YELLOW);
		BoardPanel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBackground(Color.BLACK);
		button_7.setForeground(Color.YELLOW);
		BoardPanel.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(Color.BLACK);
		button_8.setForeground(Color.YELLOW);
		BoardPanel.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBackground(Color.BLACK);
		button_9.setForeground(Color.YELLOW);
		BoardPanel.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBackground(Color.BLACK);
		button_10.setForeground(Color.YELLOW);
		BoardPanel.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBackground(Color.BLACK);
		button_11.setForeground(Color.YELLOW);
		BoardPanel.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBackground(Color.BLACK);
		button_12.setForeground(Color.YELLOW);
		BoardPanel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBackground(Color.BLACK);
		button_13.setForeground(Color.YELLOW);
		BoardPanel.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBackground(Color.BLACK);
		button_14.setForeground(Color.YELLOW);
		BoardPanel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBackground(Color.BLACK);
		button_15.setForeground(Color.YELLOW);
		BoardPanel.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBackground(Color.BLACK);
		button_16.setForeground(Color.YELLOW);
		BoardPanel.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(Color.BLACK);
		button_17.setForeground(Color.YELLOW);
		BoardPanel.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBackground(Color.BLACK);
		button_18.setForeground(Color.YELLOW);
		BoardPanel.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(Color.BLACK);
		button_19.setForeground(Color.YELLOW);
		BoardPanel.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBackground(Color.BLACK);
		button_20.setForeground(Color.YELLOW);
		BoardPanel.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.BLACK);
		button_21.setForeground(Color.YELLOW);
		BoardPanel.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.BLACK);
		button_22.setForeground(Color.YELLOW);
		BoardPanel.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.BLACK);
		button_23.setForeground(Color.YELLOW);
		BoardPanel.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBackground(Color.BLACK);
		button_24.setForeground(Color.YELLOW);
		BoardPanel.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(Color.BLACK);
		button_25.setForeground(Color.YELLOW);
		BoardPanel.add(button_25);
		
		JButton button_28 = new JButton("");
		button_28.setBackground(Color.BLACK);
		button_28.setForeground(Color.YELLOW);
		BoardPanel.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBackground(Color.BLACK);
		button_29.setForeground(Color.YELLOW);
		BoardPanel.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBackground(Color.BLACK);
		button_30.setForeground(Color.YELLOW);
		BoardPanel.add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBackground(Color.BLACK);
		button_31.setForeground(Color.YELLOW);
		BoardPanel.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBackground(Color.BLACK);
		button_32.setForeground(Color.YELLOW);
		BoardPanel.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBackground(Color.BLACK);
		button_33.setForeground(Color.YELLOW);
		BoardPanel.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBackground(Color.BLACK);
		button_34.setForeground(Color.YELLOW);
		BoardPanel.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(Color.BLACK);
		button_35.setForeground(Color.YELLOW);
		BoardPanel.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBackground(Color.BLACK);
		button_36.setForeground(Color.YELLOW);
		BoardPanel.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(Color.BLACK);
		button_37.setForeground(Color.YELLOW);
		BoardPanel.add(button_37);
		
		JButton button_42 = new JButton("");
		button_42.setBackground(Color.BLACK);
		button_42.setForeground(Color.YELLOW);
		BoardPanel.add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBackground(Color.BLACK);
		button_43.setForeground(Color.YELLOW);
		BoardPanel.add(button_43);
		
		JButton button_46 = new JButton("");
		button_46.setBackground(Color.BLACK);
		button_46.setForeground(Color.YELLOW);
		BoardPanel.add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.BLACK);
		button_47.setForeground(Color.YELLOW);
		BoardPanel.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.BLACK);
		button_48.setForeground(Color.YELLOW);
		BoardPanel.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.BLACK);
		button_49.setForeground(Color.YELLOW);
		BoardPanel.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBackground(Color.BLACK);
		button_50.setForeground(Color.YELLOW);
		BoardPanel.add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBackground(Color.BLACK);
		button_51.setForeground(Color.YELLOW);
		BoardPanel.add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBackground(Color.BLACK);
		button_52.setForeground(Color.YELLOW);
		BoardPanel.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(Color.BLACK);
		button_53.setForeground(Color.YELLOW);
		BoardPanel.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBackground(Color.BLACK);
		button_54.setForeground(Color.YELLOW);
		BoardPanel.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBackground(Color.BLACK);
		button_55.setForeground(Color.YELLOW);
		BoardPanel.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBackground(Color.BLACK);
		button_56.setForeground(Color.YELLOW);
		BoardPanel.add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBackground(Color.BLACK);
		button_57.setForeground(Color.YELLOW);
		BoardPanel.add(button_57);
		
		JButton button_60 = new JButton("");
		button_60.setBackground(Color.BLACK);
		button_60.setForeground(Color.YELLOW);
		BoardPanel.add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBackground(Color.BLACK);
		button_61.setForeground(Color.YELLOW);
		BoardPanel.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBackground(Color.BLACK);
		button_62.setForeground(Color.YELLOW);
		BoardPanel.add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBackground(Color.BLACK);
		button_63.setForeground(Color.YELLOW);
		BoardPanel.add(button_63);
		
		JButton button_64 = new JButton("");
		button_64.setBackground(Color.BLACK);
		button_64.setForeground(Color.YELLOW);
		BoardPanel.add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBackground(Color.BLACK);
		button_65.setForeground(Color.YELLOW);
		BoardPanel.add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBackground(Color.BLACK);
		button_66.setForeground(Color.YELLOW);
		BoardPanel.add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBackground(Color.BLACK);
		button_67.setForeground(Color.YELLOW);
		BoardPanel.add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBackground(Color.BLACK);
		button_68.setForeground(Color.YELLOW);
		BoardPanel.add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBackground(Color.BLACK);
		button_69.setForeground(Color.YELLOW);
		BoardPanel.add(button_69);
		
		JButton button_70 = new JButton("");
		button_70.setBackground(Color.BLACK);
		button_70.setForeground(Color.YELLOW);
		BoardPanel.add(button_70);
		
		JButton button_71 = new JButton("");
		button_71.setBackground(Color.BLACK);
		button_71.setForeground(Color.YELLOW);
		BoardPanel.add(button_71);
		
		JButton button_74 = new JButton("");
		button_74.setBackground(Color.BLACK);
		button_74.setForeground(Color.YELLOW);
		BoardPanel.add(button_74);
		
		JButton button_75 = new JButton("");
		button_75.setBackground(Color.BLACK);
		button_75.setForeground(Color.YELLOW);
		BoardPanel.add(button_75);
		
		JButton button_76 = new JButton("");
		button_76.setBackground(Color.BLACK);
		button_76.setForeground(Color.YELLOW);
		BoardPanel.add(button_76);
		
		JButton button_77 = new JButton("");
		button_77.setBackground(Color.BLACK);
		button_77.setForeground(Color.YELLOW);
		BoardPanel.add(button_77);
		
		JButton button_78 = new JButton("");
		button_78.setBackground(Color.BLACK);
		button_78.setForeground(Color.YELLOW);
		BoardPanel.add(button_78);
		
		JButton button_79 = new JButton("");
		button_79.setBackground(Color.BLACK);
		button_79.setForeground(Color.YELLOW);
		BoardPanel.add(button_79);
		
		JButton button_80 = new JButton("");
		button_80.setBackground(Color.BLACK);
		button_80.setForeground(Color.YELLOW);
		BoardPanel.add(button_80);
		
		JButton button_81 = new JButton("");
		button_81.setBackground(Color.BLACK);
		button_81.setForeground(Color.YELLOW);
		BoardPanel.add(button_81);
		
		JButton button_82 = new JButton("");
		button_82.setBackground(Color.BLACK);
		button_82.setForeground(Color.YELLOW);
		BoardPanel.add(button_82);
		
		JButton button_83 = new JButton("");
		button_83.setBackground(Color.BLACK);
		button_83.setForeground(Color.YELLOW);
		BoardPanel.add(button_83);
		
		JButton button_84 = new JButton("");
		button_84.setBackground(Color.BLACK);
		button_84.setForeground(Color.YELLOW);
		BoardPanel.add(button_84);
		
		JButton button_85 = new JButton("");
		button_85.setBackground(Color.BLACK);
		button_85.setForeground(Color.YELLOW);
		BoardPanel.add(button_85);
		
		JButton button_88 = new JButton("");
		button_88.setBackground(Color.BLACK);
		button_88.setForeground(Color.YELLOW);
		BoardPanel.add(button_88);
		
		JButton button_89 = new JButton("");
		button_89.setBackground(Color.BLACK);
		button_89.setForeground(Color.YELLOW);
		BoardPanel.add(button_89);
		
		JButton button_90 = new JButton("");
		button_90.setBackground(Color.BLACK);
		button_90.setForeground(Color.YELLOW);
		BoardPanel.add(button_90);
		
		JButton button_91 = new JButton("");
		button_91.setBackground(Color.BLACK);
		button_91.setForeground(Color.YELLOW);
		BoardPanel.add(button_91);
		
		JButton button_92 = new JButton("");
		button_92.setBackground(Color.BLACK);
		button_92.setForeground(Color.YELLOW);
		BoardPanel.add(button_92);
		
		JButton button_93 = new JButton("");
		button_93.setBackground(Color.BLACK);
		button_93.setForeground(Color.YELLOW);
		BoardPanel.add(button_93);
		
		JButton button_94 = new JButton("");
		button_94.setBackground(Color.BLACK);
		button_94.setForeground(Color.YELLOW);
		BoardPanel.add(button_94);
		
		JButton button_95 = new JButton("");
		button_95.setBackground(Color.BLACK);
		button_95.setForeground(Color.YELLOW);
		BoardPanel.add(button_95);
		
		JButton button_96 = new JButton("");
		button_96.setBackground(Color.BLACK);
		button_96.setForeground(Color.YELLOW);
		BoardPanel.add(button_96);
		
		JButton button_97 = new JButton("");
		button_97.setBackground(Color.BLACK);
		button_97.setForeground(Color.YELLOW);
		BoardPanel.add(button_97);
		
		JButton button_38 = new JButton("");
		button_38.setBackground(Color.BLACK);
		button_38.setForeground(Color.YELLOW);
		BoardPanel.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(Color.BLACK);
		button_39.setForeground(Color.YELLOW);
		BoardPanel.add(button_39);
		
		JButton button_98 = new JButton("");
		button_98.setBackground(Color.BLACK);
		button_98.setForeground(Color.YELLOW);
		BoardPanel.add(button_98);
		
		JButton button_99 = new JButton("");
		button_99.setBackground(Color.BLACK);
		button_99.setForeground(Color.YELLOW);
		BoardPanel.add(button_99);
		
		JButton button_100 = new JButton("");
		button_100.setBackground(Color.BLACK);
		button_100.setForeground(Color.YELLOW);
		BoardPanel.add(button_100);
		
		JButton button_101 = new JButton("");
		button_101.setBackground(Color.BLACK);
		button_101.setForeground(Color.YELLOW);
		BoardPanel.add(button_101);
		
		JButton button_102 = new JButton("");
		button_102.setBackground(Color.BLACK);
		button_102.setForeground(Color.YELLOW);
		BoardPanel.add(button_102);
		
		JButton button_103 = new JButton("");
		button_103.setBackground(Color.BLACK);
		button_103.setForeground(Color.YELLOW);
		BoardPanel.add(button_103);
		
		JButton button_104 = new JButton("");
		button_104.setBackground(Color.BLACK);
		button_104.setForeground(Color.YELLOW);
		BoardPanel.add(button_104);
		
		JButton button_105 = new JButton("");
		button_105.setBackground(Color.BLACK);
		button_105.setForeground(Color.YELLOW);
		BoardPanel.add(button_105);
		
		JButton button_106 = new JButton("");
		button_106.setBackground(Color.BLACK);
		button_106.setForeground(Color.YELLOW);
		BoardPanel.add(button_106);
		
		JButton button_107 = new JButton("");
		button_107.setBackground(Color.BLACK);
		button_107.setForeground(Color.YELLOW);
		BoardPanel.add(button_107);
		
		JButton button_108 = new JButton("");
		button_108.setBackground(Color.BLACK);
		button_108.setForeground(Color.YELLOW);
		BoardPanel.add(button_108);
		
		JButton button_109 = new JButton("");
		button_109.setBackground(Color.BLACK);
		button_109.setForeground(Color.YELLOW);
		BoardPanel.add(button_109);
		
		JButton button_112 = new JButton("");
		button_112.setBackground(Color.BLACK);
		button_112.setForeground(Color.YELLOW);
		BoardPanel.add(button_112);
		
		JButton button_113 = new JButton("");
		button_113.setBackground(Color.BLACK);
		button_113.setForeground(Color.YELLOW);
		BoardPanel.add(button_113);
		
		JButton button_114 = new JButton("");
		button_114.setBackground(Color.BLACK);
		button_114.setForeground(Color.YELLOW);
		BoardPanel.add(button_114);
		
		JButton button_115 = new JButton("");
		button_115.setBackground(Color.BLACK);
		button_115.setForeground(Color.YELLOW);
		BoardPanel.add(button_115);
		
		JButton button_116 = new JButton("");
		button_116.setBackground(Color.BLACK);
		button_116.setForeground(Color.YELLOW);
		BoardPanel.add(button_116);
		
		JButton button_117 = new JButton("");
		button_117.setBackground(Color.BLACK);
		button_117.setForeground(Color.YELLOW);
		BoardPanel.add(button_117);
		
		JButton button_118 = new JButton("");
		button_118.setBackground(Color.BLACK);
		button_118.setForeground(Color.YELLOW);
		BoardPanel.add(button_118);
		
		JButton button_119 = new JButton("");
		button_119.setBackground(Color.BLACK);
		button_119.setForeground(Color.YELLOW);
		BoardPanel.add(button_119);
		
		JButton button_120 = new JButton("");
		button_120.setBackground(Color.BLACK);
		button_120.setForeground(Color.YELLOW);
		BoardPanel.add(button_120);
		
		JButton button_121 = new JButton("");
		button_121.setBackground(Color.BLACK);
		button_121.setForeground(Color.YELLOW);
		BoardPanel.add(button_121);
		
		JButton button_122 = new JButton("");
		button_122.setBackground(Color.BLACK);
		button_122.setForeground(Color.YELLOW);
		BoardPanel.add(button_122);
		
		JButton button_123 = new JButton("");
		button_123.setBackground(Color.BLACK);
		button_123.setForeground(Color.YELLOW);
		BoardPanel.add(button_123);
		
		JButton button_126 = new JButton("");
		button_126.setBackground(Color.BLACK);
		button_126.setForeground(Color.YELLOW);
		BoardPanel.add(button_126);
		
		JButton button_127 = new JButton("");
		button_127.setBackground(Color.BLACK);
		button_127.setForeground(Color.YELLOW);
		BoardPanel.add(button_127);
		
		JButton button_128 = new JButton("");
		button_128.setBackground(Color.BLACK);
		button_128.setForeground(Color.YELLOW);
		BoardPanel.add(button_128);
		
		JButton button_129 = new JButton("");
		button_129.setBackground(Color.BLACK);
		button_129.setForeground(Color.YELLOW);
		BoardPanel.add(button_129);
		
		JButton button_130 = new JButton("");
		button_130.setBackground(Color.BLACK);
		button_130.setForeground(Color.YELLOW);
		BoardPanel.add(button_130);
		
		JButton button_131 = new JButton("");
		button_131.setBackground(Color.BLACK);
		button_131.setForeground(Color.YELLOW);
		BoardPanel.add(button_131);
		
		JButton button_132 = new JButton("");
		button_132.setBackground(Color.BLACK);
		button_132.setForeground(Color.YELLOW);
		BoardPanel.add(button_132);
		
		JButton button_133 = new JButton("");
		button_133.setBackground(Color.BLACK);
		button_133.setForeground(Color.YELLOW);
		BoardPanel.add(button_133);
		
		JButton button_134 = new JButton("");
		button_134.setBackground(Color.BLACK);
		button_134.setForeground(Color.YELLOW);
		BoardPanel.add(button_134);
		
		JButton button_135 = new JButton("");
		button_135.setBackground(Color.BLACK);
		button_135.setForeground(Color.YELLOW);
		BoardPanel.add(button_135);
		
		JButton button_136 = new JButton("");
		button_136.setBackground(Color.BLACK);
		button_136.setForeground(Color.YELLOW);
		BoardPanel.add(button_136);
		
		JButton button_137 = new JButton("");
		button_137.setBackground(Color.BLACK);
		button_137.setForeground(Color.YELLOW);
		BoardPanel.add(button_137);
		
		JButton button_140 = new JButton("");
		button_140.setBackground(Color.BLACK);
		button_140.setForeground(Color.YELLOW);
		BoardPanel.add(button_140);
		
		JButton button_141 = new JButton("");
		button_141.setBackground(Color.BLACK);
		button_141.setForeground(Color.YELLOW);
		BoardPanel.add(button_141);
		
		JButton button_142 = new JButton("");
		button_142.setBackground(Color.BLACK);
		button_142.setForeground(Color.YELLOW);
		BoardPanel.add(button_142);
		
		JButton button_143 = new JButton("");
		button_143.setBackground(Color.BLACK);
		button_143.setForeground(Color.YELLOW);
		BoardPanel.add(button_143);
		
		JButton button_144 = new JButton("");
		button_144.setBackground(Color.BLACK);
		button_144.setForeground(Color.YELLOW);
		BoardPanel.add(button_144);
		
		JButton button_145 = new JButton("");
		button_145.setBackground(Color.BLACK);
		button_145.setForeground(Color.YELLOW);
		BoardPanel.add(button_145);
		
		JButton button_146 = new JButton("");
		button_146.setBackground(Color.BLACK);
		button_146.setForeground(Color.YELLOW);
		BoardPanel.add(button_146);
		
		JButton button_147 = new JButton("");
		button_147.setBackground(Color.BLACK);
		button_147.setForeground(Color.YELLOW);
		BoardPanel.add(button_147);
		
		JButton button_148 = new JButton("");
		button_148.setBackground(Color.BLACK);
		button_148.setForeground(Color.YELLOW);
		BoardPanel.add(button_148);
		
		JButton button_149 = new JButton("");
		button_149.setBackground(Color.BLACK);
		button_149.setForeground(Color.YELLOW);
		BoardPanel.add(button_149);
		
		JButton button_150 = new JButton("");
		button_150.setBackground(Color.BLACK);
		button_150.setForeground(Color.YELLOW);
		BoardPanel.add(button_150);
		
		JButton button_151 = new JButton("");
		button_151.setBackground(Color.BLACK);
		button_151.setForeground(Color.YELLOW);
		BoardPanel.add(button_151);
		contentPane.setLayout(gl_contentPane);
	}
}
