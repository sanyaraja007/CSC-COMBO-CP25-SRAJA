package GOLPackage;

import javax.swing.JFrame;

public class GolDriver {

	public static void main(String[] args) {
		//game size
		int rows = 50;
		int cols = 50; 
		int size = 20; //size in pixels of each cell
		
		//title for game
		String title = "Sanya's Game of Life";
		
		Conway game = new Conway(rows, cols, size);
		
		//sets the frame for the game
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.getGrid());
		frame.pack();
		frame.setVisible(true);
		
		
		//runs main loop in Conway
		game.mainloop();
		
		
		
	}  // em

	
	
}  // ec
