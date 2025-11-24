package personnages;

import java.util.Random;

public class Grandmere extends Humain{

	private enum TypeHumain {
		HABITANT("habitant"), COMMERCANT("Commerçant"), RONIN("Ronin"), YAKUZA("Yakuza"), SAMOURAI("Samouraï"), GRANDMERE("Grand-mère");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		
		public String getNom() {
			return nom;
		}
		
		@Override
		public String toString() {
			return nom;
		}
	}
	
	public Grandmere(String nom, int argent) {
		super(nom, "tisane", argent);
		memoire = new Humain[5];
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (nbMemoire == 5) {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une autre personne !");
		}
		else {
			memoire[nbMemoire++] = humain;
		}
	}
	
	public String humainHasard() {
		Random random = new Random();
		int rd = random.nextInt(6);
		TypeHumain[] types = TypeHumain.values();
		return types[rd].getNom();
	}
	
	public void ragoter() {
		for (int i=0;i<nbMemoire;i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que " + memoire[i].getNom() + " est un traitre. Petit chenapan !");
			}
			else {
				String type = humainHasard();
				parler("Je crois que " + memoire[i].getNom() + " est un " + type);
			}
		}
	}
}
