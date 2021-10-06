import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame implements ActionListener {

	private static Random random = new Random();

	private static JFrame frame; // +
	private static JButton button;
	private static JLabel text; // +
	private static JTextArea yResult;
	private static JTextArea nResult;
	private static ImageIcon iIcon;
	private static JLabel iButton;

	Frame() {
		frame = new JFrame("Yes or No");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720, 480);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);

		text = new JLabel("Yes or No?", JLabel.CENTER);
		text.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		text.setBounds(245, 20, 200, 50);
		text.setForeground(Color.BLACK);
		frame.add(text);

		String[] buttons = { "GENERATE", "Exit" };
		int garums = 100;
		int starpa = 60;
		int amount = 0;
		for (int i = 0; i < buttons.length; i++) {
			button = new JButton(buttons[i]);
			button.setFont(new Font("Times New Roman", Font.BOLD, 36));
			button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			button.setBounds(210, 150 + (garums + starpa * i), 275, 45);
			button.setForeground(Color.BLACK);
			button.setBackground(Color.GREEN);
			button.addActionListener(this);
			frame.add(button);
			amount++;
		}

		iIcon = new ImageIcon("info.png");
		iButton = new JLabel(iIcon);
		iButton.setBounds(10, 380, 50, 50);
		frame.add(iButton);

		yResult = new JTextArea("YES");
		yResult.setBackground(Color.LIGHT_GRAY);
		yResult.setForeground(Color.ORANGE);
		yResult.setFont(new Font("ARIEL", Font.PLAIN, 60));
		yResult.setEditable(false);
		yResult.setBounds(285, 130, 140, 80);
		yResult.setVisible(false);
		frame.add(yResult);

		nResult = new JTextArea(" NO");
		nResult.setBackground(Color.LIGHT_GRAY);
		nResult.setForeground(Color.RED);
		nResult.setFont(new Font("ARIEL", Font.PLAIN, 60));
		nResult.setEditable(false);
		nResult.setBounds(285, 130, 140, 80);
		nResult.setVisible(false);
		frame.add(nResult);

		frame.setVisible(true);

		iButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Info();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			String buttonText = ((JButton) e.getSource()).getText();
			switch (buttonText) {
			case "GENERATE":
				boolean chance50oftrue = (random.nextInt(2) == 0) ? true : false;
				// boolean chance25oftrue = (random.nextInt(4) == 0) ? true : false;
				// boolean chance40oftrue = (random.nextInt(5) < 2) ? true : false;
				if (chance50oftrue == true) {
					nResult.setVisible(false);
					yResult.setVisible(true);
				} else {
					yResult.setVisible(false);
					nResult.setVisible(true);
				}
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}

	}
}
