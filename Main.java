
public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		
		while (game.isRunning()) {
			
			try {
				
				placeShips(game);
				Thread.sleep(1);
				
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public static void placeShips(Game game) {
		
		GameBoard board = game.getGameBoard();
		board.updateText("Place your Patrol Boat");
		
	}
}
