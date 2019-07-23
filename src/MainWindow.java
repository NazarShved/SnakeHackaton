import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class MainWindow extends JFrame {
	
	public MainWindow() {
		Dimension  screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2 - 480/2;
		int y = screenSize.height/2 - 480/2;
		setTitle("Snake");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(480,480);
		setLocation(x,y);
		add(new GameField());
		setVisible(true);
	}
	public static void main(String[] args) {
		MainWindow mw = new MainWindow();
	}

}
