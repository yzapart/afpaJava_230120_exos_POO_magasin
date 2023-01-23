package afpaJava_230120_projet_magasinInstruments;

public class Cordes extends Instrument {
	private int largeur, longueur;

	public Cordes(String nom, int prixVente, int prixAchat, int longueur, int largeur) {

		super(nom, prixVente, prixAchat);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public int getLongueur() {
		return longueur;
	}
	
	public String toStr() {
		return super.toStr() + "\tlong : " + longueur + "\tlarg : " + largeur;
	}
}
