

public class Dice {


	private int numSides;  
	private int value;    

	// Default constructor
	public Dice() {
		this.numSides = 6;  
		this.value = 1;     
	}


	public Dice(int numSides) {
		this.numSides = numSides;  
		this.value = 1;            
	}


	public int getNumSides() {
		return numSides;
	}


	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public void roll() {
		value = (int) (Math.random() * numSides) + 1;  }


	@Override
	public String toString() {
		return "Die [numSides=" + numSides + ", value=" + value + "]";
	}
}




































