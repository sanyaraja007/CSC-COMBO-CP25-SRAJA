import java.util.Random;

public class Spinner {
	Random rand = new Random();
	int distance;
	int low = 1;
	int high = 20;
	
	public int getDistance()
	{
		return rand.nextInt(high-low) + low;
	}

	public Spinner()
	{
		super();
	}
	

}
