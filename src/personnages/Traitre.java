package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;

	public Traitre(String nom, String boissonFav, int argent, String seigneur) {
		super(nom, boissonFav, argent, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("MAis je suis un traitre est mon niveau de traitrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentRancon = commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRancon);
			gagnerArgent(argentRancon);
			niveauTraitrise++;
			parler("Si tu veux mas protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRancon + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		}
		else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		Random random = new Random();
		if (nbMemoire < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int num = random.nextInt(nbMemoire);
			int don = argent * 1/20;
			Humain ami = memoire[num];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			String nom = getNom();
			ami.parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}
}
