
public class Card {
	private int id;
	private int valeur;
	private String couleur;
	private String type;

	public Card(int id, int valeur, String couleur, String type) {
		super();
		this.id = id;
		this.valeur = valeur;
		this.couleur = couleur;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
