package balloon;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Size {
	XS(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon20.jpg"))), S(
			new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon40.jpg"))), M(
					new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon60.jpg"))), L(
							new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon80.jpg"))), XL(
									new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon100.jpg")));

	// enum constants that are simply what they are. I.E. seasons. Only add semi
	// colons when more stuff than enums are present (icon)

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private Size(Icon icon) { // constructors for enums MUST be PRIVATE
		this.icon = icon;
	}

}
