package histoire;

import personnages.*;


public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeux",2);
//		prof.acheter("un kimono",50);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku le Noir","whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro","Shochu",54);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//		yaku.direBonjour();
//		yaku.extorquer(marco);
//		roro.direBonjour();
//		roro.donner(marco);
		roro.provoquer(yaku);
	}

}
