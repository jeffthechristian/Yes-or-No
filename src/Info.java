import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Info {

	private static JFrame info_frame;
	private static JLabel shrek;
	private static ImageIcon shreksy;
	private static JLabel text;

	Info() {
		info_frame = new JFrame("Yes or No");
		info_frame.setSize(720, 480);
		info_frame.setResizable(false);
		info_frame.setLayout(null);
		info_frame.getContentPane().setBackground(Color.LIGHT_GRAY);

		text = new JLabel("There is nothing to know!", JLabel.RIGHT);
		text.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		text.setBounds(390, 20, 300, 75);
		text.setForeground(Color.BLACK);
		info_frame.add(text);

		shreksy = new ImageIcon("shrek.jpg");
		shrek = new JLabel();
		shrek.setBounds(-15, 0, 720, 480);
		shrek.setIcon(shreksy);
		info_frame.add(shrek);

		info_frame.setVisible(true);
	}
}
