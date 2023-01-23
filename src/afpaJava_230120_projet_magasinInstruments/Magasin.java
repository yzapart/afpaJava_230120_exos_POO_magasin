package afpaJava_230120_projet_magasinInstruments;
import java.util.Random;
public class Magasin {
	static Random random = new Random();
	
	public static void main(String[] args) {
		Cordes i1 = new Cordes("guitare  AAA", 300, 200, 96, 45);
		
		System.out.println(i1.toStr());
		
		
		PianoNumerique p1 = new PianoNumerique("paino num", 500, 300, 123, 60, 88, "numérique", true, 3);
		GuitareAcoustique g1 = new GuitareAcoustique("Cort C130", 130, 100, 95, 55, "acoustique", "Droitier", 3);
		System.out.println(p1.getPrixAchat());
		System.out.println(p1.toStr());
		System.out.println("---");

		p1.ficheTechnique();
		i1.ficheTechnique();
		g1.ficheTechnique();
		
		
	}
	

	public void genererInstruments(int n) {
		int PA = random.nextInt(50, 999);
		int PV = PA + random.nextInt(50, 300);
		
		new Clarinette(null, n, PV, null, null)
	
	
	
	}

	
	public static String nomAleatoire() {
		String l[] = {"Truc","Machin","Chose","MM","Mars","Venus","SoundE","MusicM","Cort","Yamaha","R&R","Stradi","Music","EPB","Ka"};
		String apb = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return l[random.nextInt(l.length)] + " " + apb.charAt(random.nextInt(apb.length())) + random.nextInt(1, 200);
	}
}



