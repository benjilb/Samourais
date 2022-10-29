package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonfav, int argent) {
		super(nom, boissonfav, argent);
	}
	public void donner(Commercant beneficiaire) {
		int donneargent = argent/10;
		parler(beneficiaire.getNom() + " prends ces " + donneargent + " sous.");
		beneficiaire.recevoir(donneargent);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
			parler("Je t'ai eu " + adversaire.getNom());
			argent += adversaire.perdre();
		} else {
			honneur--;
			int argentperdu = argent;
			argent = 0;
			parler("J'ai perdu contre ce yakuza mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentperdu);
		}
		
		
	}

}
