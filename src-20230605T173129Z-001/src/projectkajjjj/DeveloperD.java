package projectkajjjj;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeveloperD extends JFrame {

	private Container c;
	private JButton voucher;
	private Font f;
	private JLabel board, l, pial, irfan, moyen, nirjon, tawsif;
	private ImageIcon pialp, irfanp, moyenp, nirjonp, tawsifp;
//	private JButton deatials, back;

	public DeveloperD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 30, 1200, 800); // setLocation+setSize
		setTitle("Developer");
		setResizable(false);
		setFont(new Font("Serif", Font.HANGING_BASELINE, 40));
		initComponent();
	}

	public void initComponent() {

		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(61, 200, 255));

		pial = new JLabel("Jalal Abedin pial");
		pial.setBounds(70, 220, 150, 25);
		pial.setFont(new Font("Serif", Font.BOLD, 20));
		pial.setForeground(Color.BLACK);
		c.add(pial);

		board = new JLabel("Chat");

		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);
		board = new JLabel("Chat");
		board.setBounds(550, 1, 350, 55);
		board.setFont(new Font("Serif", Font.BOLD, 45));
		board.setForeground(Color.BLACK);
		c.add(board);

		pialp = new ImageIcon(getClass().getResource("pial.png"));
		pial = new JLabel(pialp);
		pial.setBounds(30, 5, 210, 210);
		c.add(pial);

		irfanp = new ImageIcon(getClass().getResource("irfu.png"));
		irfan = new JLabel(irfanp);
		irfan.setBounds(260, 5, 210, 210);
		c.add(irfan);

		moyenp = new ImageIcon(getClass().getResource("moin.png"));
		moyen = new JLabel(moyenp);
		moyen.setBounds(490, 5, 210, 210);
		c.add(moyen);

		nirjonp = new ImageIcon(getClass().getResource("nirju.png"));
		nirjon = new JLabel(nirjonp);
		nirjon.setBounds(720, 5, 210, 210);
		c.add(nirjon);

		tawsifp = new ImageIcon(getClass().getResource("tawsif.png"));
		tawsif = new JLabel(tawsifp);
		tawsif.setBounds(950, 5, 210, 210);
		c.add(tawsif);
//
//		back = new JButton("Abouts");
//		back.setBounds(450, 650, 350, 80);
//		back.setForeground(Color.BLACK);
//		back.setBackground(Color.getHSBColor(205, 255, 105));
//		c.setFont(new Font("Arial", Font.BOLD, 25));
//
//		c.add(back);
//
//		voucher.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});

//		back.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});

	}

	public static void Developer1() {
		DeveloperD frame = new DeveloperD();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		Developer1();
	}
}
