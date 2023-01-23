package afpaJava_230120_projet_magasinInstruments;

public class PianoDroit extends Piano {
	private String typeCordes;
	private boolean silencieux;

	public PianoDroit(String nom, int prixVente, int prixAchat, int longueur, int largeur, int nbTouches, String type,
			String typeCordes, boolean silencieux) {
		super(nom, prixVente, prixAchat, longueur, largeur, nbTouches, type);
		this.typeCordes = typeCordes;
		this.silencieux = silencieux;
	}
	
	public String getTypeCordes() {
		return typeCordes;
	}
	
	public boolean getSilencieux() {
		return silencieux;
	}

	public String toStr() {
		return super.toStr() + "\tCordes " + typeCordes + "\tSil. : " + silencieux;
	}
}
