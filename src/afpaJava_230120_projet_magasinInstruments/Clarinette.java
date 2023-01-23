package afpaJava_230120_projet_magasinInstruments;

public class Clarinette extends Vent {
	private String utilisation;
	
	public Clarinette(String nom, int prixVente, int prixAchat, String type, String utilisation) {
		super(nom, prixVente, prixAchat, type);
		this.utilisation = utilisation;
	}
	
	public String getUtilisation() {
		return utilisation;
	}
	
	public String toStr() {
		return super.toStr() + "\tUtil. : " + utilisation; 
	}
}
