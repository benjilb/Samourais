package personnages;

public class Humain {
	private String nom;
	private String boissonfav;
	private int argent;
	
	
	public Humain(String nom, String boissonfav, int argent) {
		this.nom = nom;
		this.boissonfav = boissonfav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}
	
	private void parler(String texte){
		System.out.println("(" + nom + ")" + "< " + texte + " >");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfav);
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonfav + " ! Gloups ! ");
	}
	private void gagnerArgent(int gain) {
		argent = argent + gain;
		
	}
	private void perdreArgent(int perte) {
		argent = argent - perte;
		
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			parler("J'ai " + argent + " je vais pouvoir m'offrir "+ bien + " a " + prix + " sous");
			perdreArgent(prix);
		} else if (prix == argent) {
			parler("J'ai " + argent + " je vais pouvoir m'offrir une boisson " + bien + " a " + prix + " sous");
			perdreArgent(prix);
			parler("Je n'ai plus un sous");
		} else if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous");
		}
		
	}

}
