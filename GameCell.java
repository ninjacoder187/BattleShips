import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;


public class GameCell extends JPanel {
	
	private int xPos;
	private int yPos;
	private Color defaultColour;
	
	GameCell() {
		
		//Change cell colour when hovered over:
		this.addMouseListener(new MouseAdapter() {
			
			@Override 
			public void mousePressed(MouseEvent e) {
				
				char coord = (char) (xPos + 65);
				System.out.println(coord + Integer.toString(yPos));
			}
			
			@Override 
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.BLUE);
			}
			
			@Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultColour);
            }
		});
	}
	
	
	/*
	 * GETTERS & SETTERS
	 */
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	

	
	/*
	 * METHODS
	 */
	//Size of each cell:
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50);
    }
}
