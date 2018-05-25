import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private static List<Card> deck = new ArrayList<Card>();
	
	public static void add(Card card)
	{
		Deck.deck.add(card);
	}

	public static Card draw()
	{
		Card current = Deck.deck.get(0);
		Deck.deck.remove(0);
		return current;
	}
	public static void shuffle() {
		CardFactory.generate();
		Collections.shuffle(Deck.deck);
	}

	public static List<Card> getDeck() {
		return deck;
	}
}
