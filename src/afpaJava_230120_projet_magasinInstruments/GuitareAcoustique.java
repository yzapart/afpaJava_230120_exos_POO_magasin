package afpaJava_230120_projet_magasinInstruments;

public class GuitareAcoustique extends Guitare{
	private String main;
	private int tirant;
	
	public GuitareAcoustique(String nom, int prixVente, int prixAchat, int longueur, int largeur, String type, String main, int tirant) {
		super(nom, prixVente, prixAchat, longueur, largeur, type);
		this.main = main;
		this.tirant = tirant;
		}
	
	public int getTirant() {
		return tirant;
	}
	
	public String getMain() {
		return main;
	}
	
	public String toStr() {
		return super.toStr() + "\t" + main + "\tTirant : " + tirant;
	}
}
	

