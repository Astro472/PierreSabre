package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		argent -= don;
		parler(beneficiaire.getNom() + " prends ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (2 * honneur >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza !");
			argent += adversaire.perdre();
			honneur++;
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argent);
			argent = 0;
		}
	}
}
