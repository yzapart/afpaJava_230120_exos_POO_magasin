package afpaJava_230120_projet_magasinInstruments;

public class PianoNumerique extends Piano {
	private boolean toucherLourd;
	private int qEchantillonnage;
	
	public PianoNumerique(String nom, int prixVente, int prixAchat, int longueur, int largeur, int nbTouches, String type, boolean toucherLourd, int qEchantillonnage) {
		super(nom, prixVente, prixAchat, longueur, largeur, nbTouches, type);
		this.toucherLourd = toucherLourd;
		this.qEchantillonnage = qEchantillonnage;
	}
	
	public int getqEchantillonnage() {
		return qEchantillonnage;
	}
	
	public boolean getToucherLourd() {
		return toucherLourd;
	}
	
	public String toStr() {
		return super.toStr() + "\tlourd: " + toucherLourd + "\tQech. : " + qEchantillonnage;
	}
	
}
