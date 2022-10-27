package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}
	public int seFaireExtorquer() {
		int argentvole = argent;
		perdreArgent(argent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentvole;
		
	}
	public void recevoir(int argentdonne) {
		gagnerArgent(argentdonne);
		parler(argentdonne + " sous! Je te remercie genereux donateur!");
	}
}
