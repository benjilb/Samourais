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
		Traitre masako = new Traitre("Masako","whisky",100);
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
		
		masako.ranconner(kumi);
		masako.ranconner(kumi);
		masako.ranconner(kumi);
		masako.ranconner(kumi);
		
	}
}
