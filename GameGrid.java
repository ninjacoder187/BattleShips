import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


public class GameGrid extends JPanel {
	
	private final int ROWS = 10;
	private final int COLS = 10;
	private GameCell[][] cells;
	private Point selectedCell;
	
	GameGrid() {
		
		cells = new GameCell [ROWS][COLS];
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		this.setBorder(new MatteBorder(0,0,1,0, Color.GRAY));
		
		for (int y = 0; y < ROWS; y++) {
			for (int x = 0; x < COLS; x++) {
				
				gbc.gridx = x;  
				gbc.gridy = ROWS - y;
				
				GameCell cell = new GameCell();
				cell.setxPos(x);
				cell.setyPos(y + 1);
				cells[x][y] = cell;
				
				
				Border border;
				//Determine colour of borders:
				if (y < ROWS + 1) {
					if (x < COLS - 1) {
						border = new MatteBorder(1, 1, 0, 0, Color.GRAY);
					}
					else {
						border = new MatteBorder(1, 1, 0, 1, Color.GRAY);
					}
				}
				else {
					if (x < COLS - 1) {
                        border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
                    } else {
                        border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
                    }
				}
				
				
				cell.setBorder(border);
				this.add(cell, gbc);
				
			}
		}
		
		
		//Set mouse listener:
		addMouseListener(new MouseAdapter() {
			@Override 
			public void mouseEntered(MouseEvent e) {
				//setBackground(Color.BLUE);
			}
			
			@Override
            public void mouseExited(MouseEvent e) {
                //setBackground(defaultColour);
            }
		});
	}
	
	
	
	public void drawBoard() {
		
		for (int rows = ROWS - 1; rows >= 0 ; rows--) {
			System.out.println("\n");
			for (int cols = 0; cols < COLS; cols++) {
				
				char col = (char) (cols + 65);
				
				System.out.print(col + Integer.toString(rows + 1) + "   ");
			}
		}
	}
	
	
	public void showPlacement (int shipSize) {
		
	}
}
