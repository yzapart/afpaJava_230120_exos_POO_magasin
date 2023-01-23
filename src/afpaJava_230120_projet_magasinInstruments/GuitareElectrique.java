package afpaJava_230120_projet_magasinInstruments;

public class GuitareElectrique extends Guitare {

	private boolean ampli, effets;
	
	public GuitareElectrique(String nom, int prixVente, int prixAchat, int longueur, int largeur, String type, boolean ampli, boolean effets) {
		super(nom, prixVente, prixAchat, longueur, largeur, type);
		this.ampli = ampli;
		this.effets = effets;
	}
	
	public boolean getAmpli() {
		return ampli;
	}
	
	public boolean getEffets() {
		return effets;
	}

	public String toStr() {
		return super.toStr() + "\tAmpli : " + ampli + "\tEffets : " + effets;
	}

}
