import java.util.ArrayList;


public class Player {
	
	private int score;
	private ArrayList<Ship> ships;
	
	
	public Player() {
		this.score = 0;
		ships = new ArrayList<Ship>();
		createShips();
	}
	
	
	/*
	 * METHODS 
	 */
	/**
	 * Calculates the number of ships a player has remaining
	 * @return number of ships remaining
	 */
	public int shipsRemaining() {

		int remaining = ships.size();
		
		for (Ship ship : ships) {
			if (ship.getHitpoints() == 0) {
				remaining--;
			}
		}
		return remaining;
	}
	
	
	public void fire (int x, int y) {
		//player selects a space to fire at 
	}
	
	
	
	/**
	 * Method creates ships upon game start
	 */
	private void createShips() {
		if (ships.size() > 0) {
			ships.clear();
		}
		
		ships.add(new PatrolBoat()); // 2 patrol boats
		ships.add(new PatrolBoat());
		ships.add(new Battleship()); // 2 battleships
		ships.add(new Battleship());
		ships.add(new Submarine()); // 1 Submarine
		ships.add(new Destroyer()); // 1 Destroyer
		ships.add(new Carrier()); //1 Carrier
	}
}
