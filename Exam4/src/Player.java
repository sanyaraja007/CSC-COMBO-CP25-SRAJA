

public class Player {

	private String name; 
	private Dice die;     

	public Player(String name, Dice die) {
		this.name = name;
		this.die = die;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dice getDie() {
		return die;
	}

	public void setDie(Dice die) {
		this.die = die;
	}

	public void rollDie() {
		die.roll();
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", die=" + die + "]";
	}
}
