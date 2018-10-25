
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GuiOutput {

	public static void Test() {
		String inputStr = JOptionPane.showInputDialog("Enter Radius","0");
		if(inputStr == null) {
			return;
		}
		double rad = Double.parseDouble(inputStr);
		if(rad < 0) {
			JOptionPane.showMessageDialog(null, "Error: Radius mus be >= 0");
		} else {
			double area = Math.PI * Math.pow(rad, 2);
			JOptionPane.showMessageDialog(null, "The area is " + area);
		}
	}
	
	public static void GuiTest() {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("GUI Example");
		
		String inputStr = JOptionPane.showInputDialog("Number of rows", "5");
		if(inputStr == null) return;
		int rows = Integer.parseInt(inputStr);
		
		inputStr = JOptionPane.showInputDialog("Number of columns", "5");
		if(inputStr == null) return;
		int cols = Integer.parseInt(inputStr);
		
		theGUI.setSize(cols * 50, rows * 50);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(rows, cols));
		
		Random gen = new Random();
		for(int i = 1; i <= rows * cols; i++) {
			int red = gen.nextInt(256);
			int blue = gen.nextInt(256);
			int green = gen.nextInt(256);
			Color backColor = new Color(red, green, blue);
			ColorPanel panel = new ColorPanel(backColor);
			pane.add(panel);
		}
		
		theGUI.setVisible(true);
	}
	
	public static void InitGui() {
		JFrame gui = new JFrame("GuiGame Thing");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label nameLabel = new Label("Name:");
		TextField nameInput = new TextField();
		JButton nameConfirm = new JButton("Confirm");
		
		gui.add(nameLabel);
		gui.add(nameInput);
		gui.add(nameConfirm);
		
		
		
		gui.setLayout(new GridLayout(1,3));
		gui.setSize(300, 65);
		
		gui.setVisible(true);
	}
	

}
