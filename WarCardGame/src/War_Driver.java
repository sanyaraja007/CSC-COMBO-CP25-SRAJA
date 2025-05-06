

public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.shuffle();
		
	
	
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0,  25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		
		Pile center = new Pile();
			
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			int diff = c1.getRank() - c2.getRank();
			
			if(diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
				for(int i = 0; i < 5; i++) {
					if(!p2.isEmpty()){
						p1.addCard(p2.popCard());
					}	
				}
			}
			else if(diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
				for(int i = 0; i < 10; i++) {
					if(!p1.isEmpty())
					p2.addCard(p1.popCard());
				}
			}
			else {
				p1.addCard(c1);
				p2.addCard(c2);
			}
			//System.out.println("P1: " + c1 + " | P2: " + c2);
		}
		if(p2.isEmpty()) {
			System.out.println("Player 1 Wins!");
		}
		else{
			System.out.println("Player 2 Wins!");
		}
		
		
	}		
}		
		