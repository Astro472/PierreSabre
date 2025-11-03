package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int res = argent;
		argent = 0;
		return res;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur !");
		this.argent += argent;
	}
}
