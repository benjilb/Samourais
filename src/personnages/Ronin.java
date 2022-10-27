package personnages;



public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, String boissonfav, int argent) {
		super(nom, boissonfav, argent);
	}
	public void donner(Commercant beneficiaire) {
		int argentdonne = 10%argent;
		beneficiaire.recevoir(argentdonne);
		
	}

}
