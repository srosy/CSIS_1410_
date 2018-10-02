package guiDraw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private final Color[] colors = { Color.RED, Color.PINK, Color.YELLOW, Color.BLUE, Color.CYAN };
	private final Random rand = new Random();

	/**
	 * Create the panel.
	 */
	public DrawingPanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		// Transformation Practice
		// for (int i = 0; i < 10; i++) {
		// if (i % 2 == 0) {
		// g.setColor(Color.RED);
		// } else {
		// g.setColor(Color.ORANGE);
		// }
		// g.fillOval(15 * i + 100, 15 * i + 100, 150 - i * 14, 150 - i * 14);
		// }

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 10; j++) {
				// toggleColor(g, j);
				g.setColor(getRandomColor());
				g.fillOval((15 * j + 100), (150 * i + 50), 150, 150);
			}
		}
	}

	private Color getRandomColor() {
		int randomIndex = rand.nextInt(colors.length);
		return colors[randomIndex];
	}

	private void toggleColor(Graphics g, int j) {
		if (j % 2 == 0) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.ORANGE);
		}
	}
}
