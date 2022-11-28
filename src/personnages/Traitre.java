package personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	
	
	public Traitre(String seigneur, String nom, String boissonfav, int argent) {
		super(seigneur, nom, boissonfav, argent);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfav);
		parler("Je suis fier de servir le seigneur " + getSeigneur());
		parler("Mais je suis un traitre et mon niveau de traitrise est " + niveauTraitrise);
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi "
					+ argentRanconner + " sous ou gare à toi!");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			niveauTraitrise++;
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer! ");
		}
	}
	
	public void faireLeGentil(Humain ami) {
		if (nbHumainEnMemoire < 1) {
			parler("Je ne peux faire ami ami avec personne car je connais personne!");
		} else {
			int don = argent * 1/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom());
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + nom + " . Vous etes quelqu'un de bien.");
			if(niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
		
	}
}
