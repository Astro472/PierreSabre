package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	protected Humain[] memoire = new Humain[30];
	protected int nbMemoire = 0;
	
	public Humain(String nom, String boissonFav, int argent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			argent -= prix;
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		 argent -= perte;
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
	}
	
	private void memoriser(Humain humain) {
		if (nbMemoire == 30) {
			for (int i=0;i<nbMemoire-1;i++) {
				memoire[i] = memoire[i+1];
			}
			nbMemoire--;
		}
		memoire[nbMemoire++] = humain;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		autreHumain.memoriser(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissances() {
		System.out.print("Je connais beaucoup de monde dont : ");
		for (int i=0;i<nbMemoire-1;i++) {
			System.out.print(memoire[i].getNom() + ", ");
		}
		System.out.println(memoire[nbMemoire-1].getNom());
	}
}
