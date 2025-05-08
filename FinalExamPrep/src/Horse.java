import java.util.Scanner;

public class Horse {
	private String name;
	private int distance;
	private Spinner spinner = new Spinner();
	private Scanner input= new Scanner(System.in);
	
	public Horse() {
		name= buildName();
		distance =0;
	}
	public String buildName() {
		System.out.println("what is the horses name?");
		String name = input.next();
		return name;
	}
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public int getDistance(){
	return spinner.getDistance();
    }
public void setDistance() {
	this.distance +=getDistance();
    }

public void setDistance (int dist) {
	this.distance += dist; 
	
    }
public int totalDistance () {
	return this.distance;
   }

	
	

@Override
public String toString() 
{
	return "Horse \n[name=" + name + ", \ndistance=" + distance + "]";
}
}
