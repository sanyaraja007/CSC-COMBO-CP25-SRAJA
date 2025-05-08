import java.util.Scanner;

public class RaceDriver {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String choice;
		int player =1;
		final int END = 30;
		Horse p1 = new Horse();
		System.out.println(p1);
		Horse p2 = new Horse();
		System.out.println(p2);
		
		while(p1.totalDistance() < END &&  p2.totalDistance()< END)
		{
		if (player ==1) {
			System.out.println (p1.getName() + " will you move 10 (10) or take a chance (chance)?");
		
		choice = input.next();
		if(choice.equals("chance"))
		{
			p1.setDistance();
		} 
		else {
			p1.setDistance(10);
		}
		}
		else  {
			System.out.println (p2.getName() + " will you move 10 (10) or take chance (chance)");
		
		choice = input.next();
		if(choice.equals("chance"))
		{
			p2.setDistance();
		} 
		else {
			p2.setDistance(10);
		}
			
		}
		System.out.println(p1.getName() + " went " + p1.totalDistance());
		System.out.println(p2.getName() + " went " + p2.totalDistance());
		player = player % 2 +1;
		
			
	}
		if(p1.totalDistance()>p2.totalDistance()) {
			System.out.println(p1.getName() + " Wins!!! ");
			
		}else {
			System.out.println(p2.getName() + " Wins!!! ");
		}

}}
