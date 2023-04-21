package thegameoflife.gui;

import javax.swing.JPanel;
import thegameoflife.Grid;

public class Controls extends JPanel {
	public Controls(final Grid grid, final Canvas canvas, final Window window) {
		add(new ToggleButton(window));
		add(new ResetButton(grid, canvas));
	}
}