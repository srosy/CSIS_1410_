package recursionFractal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	/**
	 * Create the panel.
	 */
	public DrawingPanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		fractal(g, 6, 0, 0, 512);
	}

	private void fractal(Graphics g, int level, int x, int y, int size) {
		int newSize = size / 2;
		int midX = x + newSize;
		int midY = y + newSize;
		if (level == 1) {

			g.setColor(Color.RED);
			g.fillRect(0, 0, newSize, newSize);
			g.fillRect(midX, 0, newSize, newSize);
			g.fillRect(midX, midY, newSize, newSize);
		} else {
			fractal(g, (level - 1), x, y, newSize);
			fractal(g, (level - 1), midX, y, newSize);
			fractal(g, (level - 1), midX, midY, newSize);
		}
	}
}
