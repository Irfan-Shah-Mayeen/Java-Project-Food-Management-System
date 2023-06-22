package projectkajjjj;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chat extends JFrame {
	private Container c;
	private JLabel board;
	private JTextArea showdeatils;
	private JTextField chatf;
	private JButton logout, text;
	private Font f;

	chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 30, 1200, 800);
		setTitle("Online Payment");

		setResizable(false);
		initComponent();
	}

	public void initComponent() {
		c = this.getContentPane();
		c.setLayout(null);

		c.setBackground(new Color(61, 200, 255));

		f = new Font("Arial", Font.BOLD, 20);

		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);

		showdeatils = new JTextArea();
		showdeatils.setBounds(400, 60, 400, 555);
		showdeatils.setFont(f);
		c.add(showdeatils);

		chatf = new JTextField();
		chatf.setBounds(400, 650, 250, 35);
		chatf.setFont(f);
		c.add(chatf);

		sent = new JButton("Text");
		text.setBounds(700, 650, 100, 35);
		text.setForeground(Color.BLACK);
		text.setFont(new Font("Serif", Font.BOLD, 20));
		text.setBackground(Color.getHSBColor(205, 255, 105));
		c.add(text);

		logout = new JButton("End");
		logout.setBounds(540, 700, 150, 45);
		logout.setForeground(Color.BLACK);
		logout.setFont(new Font("Serif", Font.BOLD, 20));
		logout.setBackground(Color.getHSBColor(205, 255, 105));
		c.add(logout);

		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	public static void main(String[] args) {
		chat1();
	}

	public static void chat1() {
		chat frame = new chat();
		frame.setVisible(true);
	}
}