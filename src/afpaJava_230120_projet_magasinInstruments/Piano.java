package afpaJava_230120_projet_magasinInstruments;

public class Piano extends Cordes {
	private int nbTouches;
	private String type;

	public Piano(String nom, int prixVente, int prixAchat, int longueur, int largeur, int nbTouches, String type) {
		super(nom, prixVente, prixAchat, longueur, largeur);
		this.type = type;
	}

	public int getNbTouches() {
		return nbTouches;
	}

	public String getType() {
		return type;
	}

}
