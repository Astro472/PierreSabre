package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		//Tests TP4
		
		
		/*Humain prof = new Humain("prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		System.out.println("");
		Commercant marco = new Commercant("Marco",4);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("");
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		System.out.println("");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		System.out.println("");
		roro.provoquer(yakuLeNoir);*/
		
		//Test TP5
		
		Commercant marco = new Commercant("Marco",20);
		Commercant chonin = new Commercant("Chonin",40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yakuLeNoir);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yakuLeNoir.listerConnaissances();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("thé");
		Traitre masako = new Traitre("Masako", "Whisky", 100, "Miyamoto");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yakuLeNoir);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
	}
	
}
