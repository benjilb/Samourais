package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	private int nbHumainMax = 5;


	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void memoriser(Humain humain) {
		if(nbHumainEnMemoire < nbHumainMax) {
			memoire[nbHumainEnMemoire] = humain;
			nbHumainEnMemoire++;
		}
		else if(nbHumainEnMemoire >= nbHumainMax){
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}	
	}
}
