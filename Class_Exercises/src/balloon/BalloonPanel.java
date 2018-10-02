package balloon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class BalloonPanel extends JPanel {

	private Balloon balloon;
	private JButton btnBalloon;
	private JLabel lblType;

	/**
	 * Create the panel.
	 */
	public BalloonPanel(Balloon balloon) {
		this.balloon = balloon; // initialize field balloon

		setLayout(new BorderLayout(0, 0));
		setBackground(Color.WHITE);

		btnBalloon = new JButton();
		btnBalloon.setIcon(balloon.getSize().getIcon());
		btnBalloon.setBackground(Color.WHITE);
		add(btnBalloon, BorderLayout.CENTER);

		lblType = createLblType();
		add(lblType, BorderLayout.SOUTH);

	}

	private JLabel createLblType() {
		JLabel lblType = new JLabel(balloon.getType());
		lblType.setBorder(new EmptyBorder(12, 0, 6, 0));
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		return lblType;
	}

	/**
	 * Assigns new balloon to the field, displays the corresponding image of the
	 * balloon and the corresponding type.
	 * 
	 * @param balloon
	 */
	public void update(Balloon balloon) {
		this.balloon = balloon; // now my field is the new balloon
		btnBalloon.setIcon(balloon.getSize().getIcon()); // update the size of the icon on the button
		lblType.setText(balloon.getType()); // gets the parameter balloon's type "helium" or "air", updates text

	}

	public Balloon getBalloon() {
		return balloon;
	}

}
