package afpaJava_230120_projet_magasinInstruments;

public class PianoQueue extends Piano{
	private String taille;

	public PianoQueue(String nom, int prixVente, int prixAchat, int longueur, int largeur, int nbTouches, String type, String taille) {
		super(nom, prixVente, prixAchat, longueur, largeur, nbTouches, type);
		this.taille = taille;
	}
	
	
	public String getTaille() {
		return taille;
	}
	
	public String toStr() {
		return super.toStr() + "\taille : " + taille;
	}
}
