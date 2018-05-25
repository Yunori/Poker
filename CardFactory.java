import java.util.ArrayList;
import java.util.List;

public class CardFactory {

	public static void generate() {
		List<String> types = new ArrayList<String>();
		types.add("pique");
		types.add("coeur");
		types.add("trefle");
		types.add("carreau");
		int id = 1;
		String couleur;
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j < 15; j++) {
				id++;
				if(i % 2 == 0)
					couleur = "noire";
				else
					couleur = "rouge";
				Card card = new Card(id, j, couleur, types.get(i));
				Deck.add(card);
			}
		}
	}
}
