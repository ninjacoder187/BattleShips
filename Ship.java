
public abstract class Ship {
	
	private String name;
	private int size;
	private int hitpoints;
	private boolean alive;

	
	public Ship() {
		name = null;
		alive = true;
	}


	/*
	 * GETTERS & SETTERS
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int cellSize) {
		this.size = cellSize;
	}
	
	public int getHitpoints() {
		return hitpoints;
	}
	
	public void setHitpoints (int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	/*
	 * METHODS
	 */
}
