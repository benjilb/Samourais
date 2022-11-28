package personnages;

public class Humain {
	protected String nom;
	protected String boissonfav;
	protected int argent;
	protected Humain[] memoire;
	protected int nbHumainEnMemoire = 0;
	private int nbHumainMax = 30;
	
	
	public Humain(String nom, String boissonfav, int argent) {
		this.nom = nom;
		this.boissonfav = boissonfav;
		this.argent = argent;
		this.memoire = new Humain[nbHumainMax];
	}

	protected String getNom() {
		return nom;
	}


	protected int getArgent() {
		return argent;
	}
	
	protected void parler(String texte){
		System.out.println("(" + getNom() + ")" + "< " + texte + " >");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfav);
	}
	protected void boire() {
		parler("Mmmm, un bon verre de " + boissonfav + " ! Gloups ! ");
	}
	protected void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	protected void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			parler("J'ai " + argent + " je vais pouvoir m'offrir "+ bien + " a " + prix + " sous");
			perdreArgent(prix);
		} else if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous");
		}
		
	}
	
	
	protected void memoriser(Humain humain) {
		if(nbHumainEnMemoire < nbHumainMax) {
			memoire[nbHumainEnMemoire] = humain;
			nbHumainEnMemoire++;
		}
		else if(nbHumainEnMemoire == nbHumainMax){
//			Humain current = memoire[nbHumainEnMemoire-1];
//			memoire[nbHumainEnMemoire-1] = humain;
			for(int i=0; i < nbHumainMax-1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbHumainMax -1] = humain;
		}	
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String affichage = "Je connais beaucoup de monde dont: ";
		for(int i=0; i < nbHumainEnMemoire; i++) {
			affichage += memoire[i].getNom() + ", ";
		}
		parler(affichage);
	}

}
