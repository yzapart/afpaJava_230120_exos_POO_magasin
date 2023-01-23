package afpaJava_230120_projet_magasinInstruments;

public class Instrument {
	private String nom;
	private int prixVente, prixAchat;
	
	public Instrument(String nom, int prixVente, int prixAchat) {
		this.nom = nom;
		this.prixVente = prixVente;
		this.prixAchat = prixAchat;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPrixAchat() {
		return prixAchat;
	}
	
	public int getPrixVente() {
		return prixVente;
	}
	
	public String toStr() {
		return nom + "\tPV : " + prixVente + "\tPA : " + prixAchat;
	}
	
	public void ficheTechnique() {
		System.out.println(this.toStr());
	}
}

