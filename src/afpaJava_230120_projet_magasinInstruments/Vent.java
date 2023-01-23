package afpaJava_230120_projet_magasinInstruments;

public class Vent extends Instrument {

	private String type;

	public Vent(String nom, int prixVente, int prixAchat, String type) {
		super(nom, prixVente, prixAchat);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String getStrClasse() {
		return super.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1);
	}

	public String toStr() {
		return super.toStr() + "\ttype : " + type;
	}

}
