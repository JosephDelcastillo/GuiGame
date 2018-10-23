import javax.swing.*;
import java.awt.*;

/**
 * Color Panel
 */

@SuppressWarnings("serial")
public class ColorPanel extends JPanel {
	public ColorPanel(Color backColor, int width, int height) {
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));
	}

	public ColorPanel(Color backColor) {
		setBackground(backColor);
	}
}