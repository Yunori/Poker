
public class Main {
	public static void main(String[] args) {
		int i;
		int j;
		int nbjoueurs = 4;

		for(i = 1; i <= nbjoueurs; i++) {
			Game.addPlayer(i);
		}
		Deck.shuffle();
		System.out.println(Deck.getDeck().size());
		for(i = 0; i <= 5; i++) {
			for(j = 1; j <= nbjoueurs; j++) {
				Player currentPlayer = Game.getPlayer(j);
				currentPlayer.addCard(Deck.draw());
			}
		}
		for(i = 1; i <= nbjoueurs; i++) {
			System.out.println("CARTES DU JOUEUR " + i);
			for (Card carte : Game.getPlayer(i).getMain())
				System.out.println(carte.getValeur() + " de " + carte.getType());
		}
	}
}
