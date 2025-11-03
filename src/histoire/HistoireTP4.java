package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		System.out.println("");
		Commercant Marco = new Commercant("Marco",4);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		System.out.println("");
		Yakuza YakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		YakuLeNoir.direBonjour();
		YakuLeNoir.extorquer(Marco);
	}
	
}
