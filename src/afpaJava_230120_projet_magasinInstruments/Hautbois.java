package afpaJava_230120_projet_magasinInstruments;

public class Hautbois extends Vent {
	private boolean trilles;
	private int qAcoutique;
	
	public Hautbois(String nom, int prixVente, int prixAchat, String type, boolean trilles, int qAcoustique) {
		super(nom, prixVente, prixAchat, type);
		this.trilles = trilles;
		this.qAcoutique = qAcoustique;
		
	}
	
	public boolean getTrilles() {
		return trilles;
	}
	
	public int getqAcoutique() {
		return qAcoutique;
	}
	
	public String toStr() {
		return super.toStr() + "\tTrilles : " + trilles +"\tQA : " + qAcoutique; 
	}
}
