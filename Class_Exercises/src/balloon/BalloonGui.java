package balloon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class BalloonGui extends JFrame {

	private JPanel contentPane;
	private Random rand = new Random();
	private BalloonPanel leftBalloonPanel;
	private BalloonPanel rightBalloonPanel; // make sure they are BallonPanels
	private JLabel lblEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonGui frame = new BalloonGui();
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
	public BalloonGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblLabBalloon = createBalloonLabel();
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);

		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);

		JPanel mainPanel = createMainPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);

	}

	private JPanel createMainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(8, 5, 8, 5));
		mainPanel.setLayout(new GridLayout(0, 2, 10, 0));

		leftBalloonPanel = new BalloonPanel(getRandomBalloon());
		mainPanel.add(leftBalloonPanel);

		rightBalloonPanel = new BalloonPanel(getRandomBalloon());
		mainPanel.add(rightBalloonPanel);

		return mainPanel;
	}

	private Balloon getRandomBalloon() {
		Size[] allSizes = Size.values();
		int randomIndex = rand.nextInt(allSizes.length);
		Size randomSize = allSizes[randomIndex];
		String randomType = rand.nextBoolean() ? "helium" : "air";
		return new Balloon(randomSize, randomType); // TODO
	}

	private JLabel createLblBalloon() {
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setBorder(new EmptyBorder(8, 0, 8, 0));
		lblLabBalloon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		return lblLabBalloon;
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(8, 0, 8, 0));

		JButton btnCompare = createBtnCompare();
		controlPanel.add(btnCompare);

		lblEqual = new JLabel("Equal");
		lblEqual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEqual.setOpaque(true);
		controlPanel.add(lblEqual);

		return controlPanel;
	}

	private void updateLblEqual() {
		boolean equal = leftBalloonPanel.getBalloon().equals(rightBalloonPanel.getBalloon()); // checks if the
																								// two balloons
																								// are equal
		if (equal) {
			lblEqual.setText("EQUAL");
			lblEqual.setBackground(Color.ORANGE);
		} else {
			lblEqual.setText("not equal");
			lblEqual.setBackground(Color.WHITE);
		}
	}

	private JButton createBtnCompare() {
		JButton btnCompare = new JButton("Compare");
		btnCompare.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCompare.addActionListener(new ActionListener() { // creates a class and individual method just for button
			public void actionPerformed(ActionEvent arg0) {
				leftBalloonPanel.update(getRandomBalloon());
				rightBalloonPanel.update(getRandomBalloon());
				updateLblEqual();
			}
		});
		return btnCompare;
	}

	private JLabel createBalloonLabel() {
		JLabel lblLabBalloon = createLblBalloon();
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		return lblLabBalloon;
	}

}
