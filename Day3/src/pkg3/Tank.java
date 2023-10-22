package pkg3;

public class Tank {
	private int level;
	private int capacity;
	
	public Tank() {
		System.out.println("Default const get called");
		capacity=50;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}



}
