import java.util.ArrayList;
import java.util.List;

public class Game {
	private static List<Player> joueurs = new ArrayList<Player>();

	public static void addPlayer(int id) {
		Player joueur = new Player(id);
		Game.joueurs.add(joueur);
	}

	public static Player getPlayer(int id) {
		for (Player player : Game.joueurs) {
			if(player.getId() == id)
				return player;
		}
		return null;
	}
}
