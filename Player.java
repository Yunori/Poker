import java.util.ArrayList;
import java.util.List;

public class Player {
	private int id;
	private List<Card> main = new ArrayList<Card>();

	public Player(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Card> getMain() {
		return main;
	}

	public void addCard(Card card) {
		this.main.add(card);
	}

	public void removeHand() {
		this.main = new ArrayList<Card>();
	}
}
