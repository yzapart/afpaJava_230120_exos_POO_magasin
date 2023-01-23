package afpaJava_230120_projet_magasinInstruments;

public class Guitare extends Cordes {
	private String type;
	
	public Guitare(String nom, int prixVente, int prixAchat, int longueur, int largeur, String type) {
		super(nom, prixVente, prixAchat, longueur, largeur);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String toStr() {
		return super.toStr() + "\t" + type;
	}
}
