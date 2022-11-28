package histoire;


import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto","Akimoto","Saké",80);
		Traitre masako = new Traitre("Miyamoto","Masako","whisky",100);
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
//		akimoto.boire("thé");
		
		
//		masako.faireConnaissanceAvec(akimoto);
//		masako.faireConnaissanceAvec(kumi);
//		masako.faireConnaissanceAvec(chonin);
		
		
//		masako.faireLeGentil(kumi);
//		masako.ranconner(kumi);
//		masako.ranconner(chonin);
//		masako.ranconner(marco);
//		akimoto.faireConnaissanceAvec(masako);
//		masako.ranconner(kumi);
//		masako.faireConnaissanceAvec(yaku);
//		masako.faireLeGentil(yaku);
//		masako.faireConnaissanceAvec(roro);
		
		GrandMere grandMere = new GrandMere("Grand-Mere", 10);
		grandMere.faireConnaissanceAvec(akimoto);
	}
}
