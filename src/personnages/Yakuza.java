package personnages;

public class Yakuza extends Humain{
	private int reputation=0;
	private String clan;
	
	public Yakuza(String nom, String boissonfav, int argent, String clan) {
		super(nom, boissonfav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse !");
		int argentvole = victime.seFaireExtorquer();
		gagnerArgent(argentvole);
		reputation++;
		parler("J'ai pique les " + argentvole + "sous de " + victime.getNom() + " ce qui me fait " +  getArgent() + " sous dans ma poche");
	}
}
