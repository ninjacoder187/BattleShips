import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameBoard extends JFrame {

	private final int MIN_WIDTH = 700;
	private final int MIN_HEIGHT = 720;
	
	private GameGrid mGrid;
	private JLabel lblInfo;
	
	
	public GameBoard() {
		
		this.setTitle("Battleships");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
		this.setLocationRelativeTo(null);
		
		
		//Game instruction / information:
		lblInfo = new JLabel();
		lblInfo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblInfo.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));
		
		//Game grid:
		mGrid = new GameGrid();
		this.add(mGrid);
		this.pack();
		
		//Set layout of the JFrame:
		this.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(lblInfo, gc);
		
		gc.gridy = 1;
		this.add(mGrid, gc);
		
	}
	
	
	
	public void updateText (String pText) {
		lblInfo.setText(pText);
	}
	
	
	
	public void placeShip (Ship pShip) {
		
		mGrid.showPlacement(pShip.getSize());
	}


}
