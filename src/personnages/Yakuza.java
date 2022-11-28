package personnages;

public class Yakuza extends Humain{
	private int reputation=4;
	private String clan;
	
	public Yakuza(String nom, String boissonfav, int argent, String clan) {
		super(nom, boissonfav, argent);
		this.clan = clan;
	}
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfav);
		parler("Mon clan est " + clan);
	}
	
	protected int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse !");
		int argentvole = victime.seFaireExtorquer();
		gagnerArgent(argentvole);
		reputation++;
		parler("J'ai pique les " + argentvole + "sous de " + victime.getNom() + " ce qui me fait " +  getArgent() + " sous dans ma poche");
	}
	
	public int perdre() {
		int argentperdu = argent;
		argent = 0;
		reputation--;
		parler("J'ai perdu mon duel et mes " + argentperdu + " sous, snif... J'ai deshonore le clan de " + clan);
		return argentperdu;
	}
	
	
	public void gagner(int gain) {
		argent+= gain;
		reputation++;
		parler("Ce ronin pensait vraiment battre "+ nom + " du clan de " + clan + "? Je l'ai depouille de ses " + gain + " sous.");
	}

	
}
