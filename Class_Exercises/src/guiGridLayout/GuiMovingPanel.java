package guiGridLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GuiMovingPanel extends JFrame {

	private static final Color TITLE_BACKGROUND = new Color(128, 0, 0);
	private static final Color MOVING_BACKGROUND = Color.ORANGE;
	private int currentIndex = 0;
	private int nextIndex = 0;

	private JPanel contentPane;
	private JButton[] tiles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMovingPanel frame = new GuiMovingPanel();
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
	public GuiMovingPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 8));
		setContentPane(contentPane);

		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.WEST);

		JPanel displayPanel = createDisplayPanel();
		contentPane.add(displayPanel, BorderLayout.CENTER);

	}

	private JPanel createDisplayPanel() {
		JPanel displayPanel = new JPanel();
		displayPanel.setBorder(new EmptyBorder(8, 0, 8, 8));
		displayPanel.setLayout(new GridLayout(0, 4, 8, 0));

		JButton btn1 = new JButton("1");
		initializeButton(btn1);
		displayPanel.add(btn1);

		JButton btn2 = new JButton("2");
		initializeButton(btn2);
		displayPanel.add(btn2);

		JButton btn3 = new JButton("3");
		initializeButton(btn3);
		displayPanel.add(btn3);

		JButton btn4 = new JButton("4");
		initializeButton(btn4);
		displayPanel.add(btn4);

		tiles = new JButton[] { btn1, btn2, btn3, btn4 };
		tiles[0].setBackground(MOVING_BACKGROUND);

		return displayPanel;
	}

	private void initializeButton(JButton btn) {
		btn.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn.setForeground(new Color(220, 220, 220));
		btn.setBackground(TITLE_BACKGROUND);
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
		controlPanel.setLayout(new GridLayout(4, 0, 0, 8));

		JButton btnRight = new JButton("==>");
		btnRight.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				nextIndex = (currentIndex + 1) % tiles.length; // checks if int can be length of tiles array
				tiles[currentIndex].setBackground(TITLE_BACKGROUND);
				tiles[nextIndex].setBackground(MOVING_BACKGROUND);
				currentIndex = nextIndex;
			}
		});
		controlPanel.add(btnRight);
		{
			JButton btnLeft = new JButton("<==");
			btnLeft.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nextIndex = currentIndex > 0 ? (currentIndex - 1) : 3; // checks if int can be
																			// length of tiles
					// array
					tiles[currentIndex].setBackground(TITLE_BACKGROUND);
					tiles[nextIndex].setBackground(MOVING_BACKGROUND);
					currentIndex = nextIndex;
				}
			});
			controlPanel.add(btnLeft);
		}
		return controlPanel;
	}

	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Demo Layout");
		lblTitle.setForeground(new Color(245, 245, 245));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(128, 128, 0));
		lblTitle.setBorder(new EmptyBorder(12, 0, 12, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
		return lblTitle;
	}

}
