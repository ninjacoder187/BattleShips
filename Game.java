
public class Game {

	
	private final int ROWS = 3;
	private final int COLS = 3;
	
	private Player player1;
	private Player player2;
	private boolean isRunning;
	private boolean gameOver;
	private int grid[][];
	private GameBoard gameBoard;
	
	
	public Game() {
		isRunning = true;
		gameOver = false;
		grid = new int[ROWS][COLS];
		gameBoard = new GameBoard();
		player1 = new Player();
		player2 = new Player();
	}
	
	
	/*
	 * GETTERS & SETTERS
	 */
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public boolean isRunning() {
		return isRunning;
	}
	
	public boolean setIsRunning (boolean isRunning) {
		return this.isRunning = isRunning;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	public int[][] getGameGrid() {
		return grid;
	}
	
	public GameBoard getGameBoard() {
		return gameBoard;
	}
	
	
	
	/*
	 * METHODS
	 */
	/**
	 * Method initializes the game. Loading each player with ships.
	 */
	
	
	
	public void drawBoard() {
		
		for (int rows = ROWS - 1; rows >= 0 ; rows--) {
			System.out.println("\n");
			for (int cols = 0; cols < COLS; cols++) {
				
				char col = (char) (cols + 65);
				
				System.out.print(col + Integer.toString(rows + 1) + "   ");
			}
		}
	}
}
