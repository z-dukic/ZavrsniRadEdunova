package fitnessapp;

import java.awt.Desktop;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Start {

	Scanner scanner = new Scanner(System.in);
	private List<Hrana> hrana;
	private List<Aktivnosti> aktivnosti;
	private List<Korisnik> korisnik;
	private List<Dnevnik> datumDnevnika;
	private List<UnosKalorija> unosKcal;
	private List<PotrosnjaKalorija> potrosnjaKcal;
	


	public Start() {
		datumBaza();
		System.out.println(
				" __          __  _                            _          ______ _ _                          \r\n"
						+ " \\ \\        / / | |                          | |        |  ____(_) |       /\\                \r\n"
						+ "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | |__   _| |_     /  \\   _ __  _ __  \r\n"
						+ "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  |  __| | | __|   / /\\ \\ | '_ \\| '_ \\ \r\n"
						+ "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |    | | |_   / ____ \\| |_) | |_) |\r\n"
						+ "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|    |_|\\__| /_/    \\_\\ .__/| .__/ \r\n"
						+ "                                                                                | |   | |    \r\n"
						+ "                                                                                |_|   |_|   ");

		System.out.println("----------------------");

		hrana = new ArrayList<Hrana>();
		bazaHrane();

		aktivnosti = new ArrayList<Aktivnosti>();
		bazaAktivnosti();

		datumDnevnika = new ArrayList<Dnevnik>();
		datumBaza();

		unosKcal = new ArrayList<UnosKalorija>();

		potrosnjaKcal = new ArrayList<PotrosnjaKalorija>();

		korisnik = new ArrayList<Korisnik>();
		bazaKorisnik();
		
		
		
		

		glavniIzbornik();

	}

	private void datumBaza() {
		
		Date unosHrane;
		Calendar gc = GregorianCalendar.getInstance();
		gc.set(Calendar.YEAR,2021);
		gc.set(Calendar.MONTH, 7);
		gc.set(Calendar.DAY_OF_MONTH, 13);
		unosHrane = gc.getTime();
		SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy.");
		System.out.println(df.format(unosHrane));
		
		try {
			Date drugiDatum = df.parse("20. 08. 2021.");
			Date prviDatum = df.parse("13. 08. 2021.");
			
			long diff = drugiDatum.getTime() - prviDatum.getTime();
			
			System.out.println(diff);
			TimeUnit time = TimeUnit.DAYS;
			long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
	        System.out.println("The difference in days is : "+diffrence);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Date danas = gc.getTime();
		System.out.println(danas);
		System.out.println(df.format(danas));
		
		
	}

	// Dodavanje novog korisnika
	private void bazaKorisnik() {
		Korisnik k = new Korisnik();
		korisnik.add(k);

		k.setNadimak(Ulaz.ucitajString("Odaberite nadimak", "Nadimak koji ste izabrali nije moguće izabrati."));
		k.setEmail(
				Ulaz.ucitajString("Unesite svoj email. Ukoliko unesete krivi email nećete moći pristupi svom računu.",
						"Neispravan format"));
		k.setDob(Ulaz.ucitajInt("Unesite koliko imate godina", "Neispravan unos", 16, 99));
		k.setSpol(Ulaz.ucitajSpol("Unesite svoj spol. Za muški spol upišite \"M\" ili za ženski spol \"F\" "));
		k.setVisina(Ulaz.ucitajInt("Unesite svoju visinu u centimetrima",
				"Neispravan unos. Molimo unosite svoju visinu u centimetrima", 0, 220));
		k.setTezina(Ulaz.ucitajInt("Unesite svoju težinu u kilogramima",
				"Neispravan unos. Molimo unesite svoju kilažu u kilogramima", 0, 200));
		k.setZeljenaTezina(Ulaz.ucitajInt("Unesite svoju željenu težinu u kilogramima",
				"Neispravan unos. Molimo unesite svoju kilažu u kilogramima", 0, 200));

	}

	// Aktivnosti koje su mogu birati
	private void bazaAktivnosti() {
		Aktivnosti trcanje = new Aktivnosti();
		trcanje.setImeAktivnosti("Trcanje");
		trcanje.setPotroseneKalorijePoSatu(600);
		aktivnosti.add(trcanje);

		Aktivnosti nogomet = new Aktivnosti();
		nogomet.setImeAktivnosti("Nogomet");
		nogomet.setPotroseneKalorijePoSatu(500);
		aktivnosti.add(nogomet);

		Aktivnosti skijanje = new Aktivnosti();
		skijanje.setImeAktivnosti("Skijanje");
		skijanje.setPotroseneKalorijePoSatu(350);
		aktivnosti.add(skijanje);

		Aktivnosti bicikliranje = new Aktivnosti();
		bicikliranje.setImeAktivnosti("Bicikliranje");
		bicikliranje.setPotroseneKalorijePoSatu(300);
		aktivnosti.add(bicikliranje);

		Aktivnosti rukomet = new Aktivnosti();
		rukomet.setImeAktivnosti("Rukomet");
		rukomet.setPotroseneKalorijePoSatu(450);
		aktivnosti.add(rukomet);

	}

	// Hrana koja se može birati
	private void bazaHrane() {
		Hrana mrkva = new Hrana();
		mrkva.setImeHrane("Mrkva");
		mrkva.setKalorije(35);
		mrkva.setProteini(0);
		mrkva.setUgljikohidrati(8);
		mrkva.setMasti(0);
		hrana.add(mrkva);

		Hrana jabuka = new Hrana();
		jabuka.setImeHrane("Jabuka");
		jabuka.setKalorije(48);
		jabuka.setProteini(0);
		jabuka.setUgljikohidrati(13);
		jabuka.setMasti(0);
		hrana.add(jabuka);

		Hrana banana = new Hrana();
		banana.setImeHrane("Banana");
		banana.setKalorije(89);
		banana.setProteini(0);
		banana.setUgljikohidrati(23);
		banana.setMasti(0);
		hrana.add(banana);

		Hrana breskva = new Hrana();
		breskva.setImeHrane("Breskva");
		breskva.setKalorije(39);
		breskva.setProteini(10);
		breskva.setUgljikohidrati(0);
		breskva.setMasti(0);
		hrana.add(breskva);

		Hrana luk = new Hrana();
		luk.setImeHrane("Luk");
		luk.setKalorije(40);
		luk.setProteini(0);
		luk.setUgljikohidrati(10);
		luk.setMasti(0);
		hrana.add(luk);

		Hrana cocaCola = new Hrana();
		cocaCola.setImeHrane("Coca-cola");
		cocaCola.setKalorije(41);
		cocaCola.setProteini(0);
		cocaCola.setUgljikohidrati(10);
		cocaCola.setMasti(0);
		hrana.add(cocaCola);

		Hrana cips = new Hrana();
		cips.setImeHrane("Čips");
		cips.setKalorije(547);
		cips.setProteini(7);
		cips.setUgljikohidrati(50);
		cips.setMasti(37);
		hrana.add(cips);

		Hrana bigMac = new Hrana();
		bigMac.setImeHrane("Big Mac");
		bigMac.setKalorije(257);
		bigMac.setProteini(12);
		bigMac.setUgljikohidrati(20);
		bigMac.setMasti(15);
		hrana.add(bigMac);

		Hrana bolognese = new Hrana();
		bolognese.setImeHrane("Špagete Bolognese");
		bolognese.setKalorije(113);
		bolognese.setProteini(7);
		bolognese.setUgljikohidrati(9);
		bolognese.setMasti(7);
		hrana.add(bolognese);

		Hrana sir = new Hrana();
		sir.setImeHrane("Sir gauda");
		sir.setKalorije(356);
		sir.setProteini(25);
		sir.setUgljikohidrati(2);
		sir.setMasti(27);
		hrana.add(sir);

	}

	// Glavni izbornik
	private void glavniIzbornik() {
		System.out.println("****FitApp****");
		System.out.println("Izbornik");
		System.out.println("1. Dnevnik");
		System.out.println("2. Unos hrane u bazu");
		System.out.println("3. Unos aktivnosti u bazu");
		System.out.println("4. Postavke korisnika");
		System.out.println("5. O nama");
		System.out.println("6. Izlazak iz aplikacije");
		ucitajGlavnuAkciju();

	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Izaberite stavku", "Niste unijeli cijeli broj", 1, 6)) {
		case 1 -> dnevnikIzbornik();
		case 2 -> izbornikHrane();
		case 3 -> izbornikAktivnosti();
		case 4 -> korisnikIzbornik();
		case 5 -> oNamaIzbornik();
		case 6 -> izlazIzAplikacije();

		}

	}

	// Izlaz iz aplikacije
	private void izlazIzAplikacije() {

		System.out.println("Dali želite izađi iz aplikacije? (Da/Ne)");

		try {
			while (true) {
				String izlaz = scanner.nextLine().trim().toLowerCase();

				if (izlaz.equals("da")) {
					System.out.println("Hvala Vam. Dođite opet!");
					break;
				} else {
					glavniIzbornik();

				}
			}

		} catch (Exception e) {

		}

	}

	// Šalje na GitHub gdje se vide podaci o FitAppu
	private void oNamaIzbornik() {

		System.out.println("Program je napravio Zoran Đukić za završni rad iz tečaja Jave u Edunovi. ");

		switch (Ulaz.ucitajInt(
				"Ako želite znati više upišite broj 1, ako se želite vratiti na glavni izbornik upišite broj 2.",
				"Neispravan unos. Možete samo odgovoriti sa brojem jedna ili dva", 1, 2)) {

		case 1 -> ucitajLink();
		case 2 -> glavniIzbornik();
		}

	}

	// Učitava link na GitHub
	private void ucitajLink() {
		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI oURL = new URI("https://github.com/z-dukic/ZavrsniRadEdunova");
			desktop.browse(oURL);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--------");
		System.out.println("Vraćamo Vas na glavni izbornik");
		System.out.println("--------");

		glavniIzbornik();

	}

	// Izbornik sa korisnika; Dodati mogućnost promjene korisnika
	private void korisnikIzbornik() {
		System.out.println("---------------");
		System.out.println("Postavke korisnika");
		System.out.println("1. Pregled postavke korisnika");
		System.out.println("2. Unos postavki korisnika");
		System.out.println("3. Brisanje postavki korisnika");
		System.out.println("4. Povratak na glavni izbornik");
		KorisnikUcitajAkciju();
	}

	private void KorisnikUcitajAkciju() {

		switch (Ulaz.ucitajInt("Odaberite akciju od 1 do 4", "Pogrešan unos. Možete izabrati samo od 1 do 4", 1, 4)) {
		case 1 -> {
			pregledKorisnika();
			korisnikIzbornik();
		}
		case 2 -> glavniIzbornik(); // korisnikUnosRacuna();
		case 3 -> brisanjePostavkiKorisnika();
		case 4 -> glavniIzbornik();
		}

	}

	// Pregled svih računa
	private void pregledKorisnika() {
		pristupRacunuStavke("Pregled svih računa");
	}

	private void pristupRacunuStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------");
		if (korisnik.isEmpty()) {
			System.out.println("Nema unesenih korisnika");
		} else {
			Korisnik k;
			for (int i = 0; i < korisnik.size(); i++) {
				k = korisnik.get(i);
				System.out.println((i + 1) + "." + k.getNadimak());
			}
		}

	}

	private void brisanjePostavkiKorisnika() {
		// Pristup racunu ako je imao, ali izgubio

	}

	/*
	 * private void korisnikUnosRacuna() { Korisnik k = new Korisnik(); k =
	 * kreirajRacun(k); korisnik.add(k); korisnikIzbornik();
	 * 
	 * }
	 */
	/*
	 * private Korisnik kreirajRacun(Korisnik k) {
	 * k.setNadimak(Ulaz.ucitajString("Odaberite nadimak",
	 * "Nadimak koji ste izabrali nije moguće izabrati."));
	 * 
	 * k.setEmail( Ulaz.
	 * ucitajString("Unesite svoj email. Ukoliko unesete krivi email nećete moći pristupi svom računu."
	 * , "Neispravan format"));
	 * k.setDob(Ulaz.ucitajInt("Unesite koliko imate godina", "Neispravan unos", 16,
	 * 99)); k.setSpol(Ulaz.ucitajSpol("Unesite spol. (M za muško, F za žensko)",
	 * "Možete samo unijeti M za muško i F za žensko"));
	 * k.setVisina(Ulaz.ucitajInt("Unesite svoju visinu u centimetrima",
	 * "Neispravan unos. Molimo unosite svoju visinu u centimetrima", 0, 220));
	 * k.setTezina(Ulaz.ucitajInt("Unesite svoju težinu u kilogramima",
	 * "Neispravan unos. Molimo unesite svoju kilažu u kilogramima", 0, 200));
	 * return k;
	 * 
	 * }
	 */

	// Izbornik aktivnosti gdje se mogu pregledati aktivnosti, dodati nove, obrisati
	// stare itd.
	private void izbornikAktivnosti() {
		System.out.println("-----------");
		System.out.println("1. Pregledavanje baze aktivnosti");
		System.out.println("2. Dodavanje aktivnosti u bazu");
		System.out.println("3. Brisanje aktivnosti iz baze");
		System.out.println("4. Povratak na glavni izbornik");
		akcijaIzbornikAktivnosti();
	}

	private void akcijaIzbornikAktivnosti() {
		switch (Ulaz.ucitajInt("Odaberite sljedeću akciju", "Niste unijeli cijeli broj", 1, 4)) {
		case 1 -> pregledBazeAktivnosti();
		case 2 -> dodavanjeAktivnostiUBazu();
		case 3 -> brisanjeAktivnostiIzBaze();
		case 4 -> glavniIzbornik();
		}

	}

	// Brisanje aktivnosti
	private void brisanjeAktivnostiIzBaze() {
		aktivnostiStavke("Pregled unesenih aktivnosti");
		int brojAktivnosti = Ulaz.ucitajInt("Odaberite redni broj za brisanje", "Niste unijeli cijeli broj", 1,
				aktivnosti.size());
		aktivnosti.remove(brojAktivnosti - 1);
		izbornikAktivnosti();
	}

	// Dodavanje novih aktivnosti
	private void dodavanjeAktivnostiUBazu() {

		Aktivnosti a = new Aktivnosti();
		a = aktivnostiPostaviVrijednosti(a);
		aktivnosti.add(a);

		izbornikAktivnosti();

	}

	// Postavljanje vrijednosti novih aktivnosti
	private Aktivnosti aktivnostiPostaviVrijednosti(Aktivnosti a) {
		a.setImeAktivnosti(Ulaz.ucitajString("Unesite ime aktivnosti", "Niste unijeli ime aktivnosti"));
		a.setPotroseneKalorijePoSatu(
				Ulaz.ucitajInt("Unesite potrosene kalorije u sat vremena", "Niste dali cijeli broj", 0, 999));
		return a;
	}

	// Pregled svih aktivnosti koji su trenutno u bazi bez vraćanja na izbornik
	private void pregledBazeAktivnostiZaDnevnik() {
		aktivnostiStavke("Pregled unesenih aktivnosti");
	}

	// Pregled svih aktivnosti koji su trenutno u bazi uz vraćanje na izbornik
	private void pregledBazeAktivnosti() {
		aktivnostiStavke("Pregled unesenih aktivnosti");
		izbornikAktivnosti();

	}

	private void aktivnostiStavke(String poruka) {
		System.out.println("-----------");

		if (aktivnosti.size() == 0) {
			System.out.println("Nema unesenih aktivnosti");
		} else {
			Aktivnosti a;

			for (int i = 0; i < aktivnosti.size(); i++) {
				a = aktivnosti.get(i);
				System.out.println((i + 1) + ". " + a.getImeAktivnosti());
			}

		}

	}

	// Izbornik hrane; Dodavanje hrane u bazu, brisanje hrane iz baze, pregled.
	private void izbornikHrane() {
		System.out.println("-------------");
		System.out.println("1. Pregled baze hrane");
		System.out.println("2. Dodavanje hrane u bazu");
		System.out.println("3. Brisanje hrane iz baze");
		System.out.println("4. Povratak na glavni izbornik");
		akcijaIzbornikHrane();
	}

	private void akcijaIzbornikHrane() {

		switch (Ulaz.ucitajInt("Odaberite sljedeću akciju", "Niste unijeli cijeli broj", 1, 4)) {
		case 1 -> pregledBazeHrane();
		case 2 -> dodavanjeHraneUBazu();
		case 3 -> brisanjeHraneIzBaze();
		case 4 -> glavniIzbornik();

		}

	}

	// Dodavanje hrane u bazu
	private void dodavanjeHraneUBazu() {

		Hrana h = new Hrana();
		h = hranaPostaviVrijednost(h);
		hrana.add(h);

		izbornikHrane();

	}

	// Dodavanje vrijednosti hranu u bazi
	private Hrana hranaPostaviVrijednost(Hrana h) {

		h.setImeHrane(Ulaz.ucitajString("Kako se hrana zove", "Niste unijeli ime hrane"));
		h.setKalorije(Ulaz.ucitajInt("Koliko ima kalorija na 100 grama?", "Niste unijeli dobar broj", 0, 910));
		h.setProteini(Ulaz.ucitajInt("Koliko proteina ima na 100g?", "Niste unijeli dobar broj", 0, 100));
		h.setUgljikohidrati(Ulaz.ucitajInt("Koliko ugljikohidrata ima na 100g?", "Niste unijeli dobar broj", 0, 100));
		h.setMasti(Ulaz.ucitajInt("Koliko ima masti na 100 grama?", "Niste unijeli dobar broj", 0, 100));

		return h;
	}

	// Brisanje hrane iz baze
	private void brisanjeHraneIzBaze() {
		hranaStavke("Trenutno dostupno u aplikaciji");
		int brojHrane = Ulaz.ucitajInt("Odaberite redni broj za brisanje", "Niste unijeli cijeli broj", 1,
				hrana.size());
		hrana.remove(brojHrane - 1);
		izbornikHrane();
	}

	// Pregled baze, ali bez vraćanja na izbornik
	private void pregledBazeHraneZaDnevnik() {
		hranaStavke("Pregled unesene hrane");
	}

	// Pregled baze, ali uz vraćanje na izbornik
	private void pregledBazeHrane() {
		hranaStavke("Pregled unesene hrane");
		izbornikHrane();
	}

	// Prikaz hrane u bazi
	private void hranaStavke(String naslov) {
		System.out.println("--------------");

		if (hrana.size() == 0) {

			System.out.println("Nema unesene hrane");
		} else {

			Hrana h;

			for (int i = 0; i < hrana.size(); i++) {
				h = hrana.get(i);

				System.out.println((i + 1) + ". " + h.getImeHrane());
			}
		}

	}

	private void dnevnikIzbornik() {
		System.out.println("-------------");
		System.out.println("1. Pregled unesene hrane po danu");
		System.out.println("2. Dodavanje hrane i/ili aktivnosti");
		System.out.println("3. Brisanje hrane i/ili aktivnosti");
		System.out.println("4. Statistika");
		System.out.println("5. Povratak na glavni izbornik");
		akcijaDnevnikIzbornik();

	}

	private void akcijaDnevnikIzbornik() {
		switch (Ulaz.ucitajInt("Odaberite sljedeću akciju", "Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> dnevnikPregled();
		case 2 -> dodavanjeHraneIliAktivnostiPoDanu();
		case 3 -> brisanjeHraneIliAktivnostiPoDanu();
		case 4 -> pregledStatistike();
		case 5 -> glavniIzbornik();

		}

	}

	private void pregledStatistike() {

		Ulaz send = new Ulaz("zorandjukic.os@gmail.com", "subject", "body" + aktivnosti.size());
		// change receiver email

		dnevnikIzbornik();

	}

	private void brisanjeHraneIliAktivnostiPoDanu() {

		switch (Ulaz.ucitajInt(
				"Ako želite izbrisati unesenu hranu unesite broj (1), ako želite obrisati aktivnost iz dnevnika upišite (2)",
				"Možete samo unijeti (1) za brisanje unesene hrane ili (2) za brisanje unesene aktivnosti", 1, 2)) {

		case 1 -> {
			dnevnikStavke("Trenutno dostupno u aplikaciji");
			int redniBroj = Ulaz.ucitajInt("Odaberite koju hranu ili aktivnost želite izbaciti",
					"Niste unijeli cijeli broj", 1, unosKcal.size());
			unosKcal.remove(redniBroj - 1);
			dnevnikIzbornik();
		}

		case 2 -> {

			dnevnikStavke("Trenutno dostupno u aplikaciji");
			int redniBroj = Ulaz.ucitajInt("Odaberite koju hranu ili aktivnost želite izbaciti",
					"Niste unijeli cijeli broj", 1, potrosnjaKcal.size());
			potrosnjaKcal.remove(redniBroj - 1);
			dnevnikIzbornik();
		}

		}

	}

	private void dodavanjeHraneIliAktivnostiPoDanu() {

		switch (Ulaz.ucitajInt(
				"Ako želite unijeti hranu unesite broj (1), ako želite unijeti aktivnost unesite broj (2) ",
				"Možete samo unijeti (1) za unos hrane i (2) za unos aktivnosti", 1, 2)) {

		case 1 -> {
			UnosKalorija uk = new UnosKalorija();
			uk = unosKalorijaPostaviVrijednosti(uk);
			unosKcal.add(uk);
			dnevnikIzbornik();
		}

		case 2 -> {
			PotrosnjaKalorija pk = new PotrosnjaKalorija();
			pk = potrosnjaKalorijaPostaviVrijednosti(pk);
			potrosnjaKcal.add(pk);
			dnevnikIzbornik();

		}

		}

	}

	private PotrosnjaKalorija potrosnjaKalorijaPostaviVrijednosti(PotrosnjaKalorija pk) {
		pregledBazeAktivnostiZaDnevnik();
		System.out.println();

		// pk.setDatum(Ulaz.ucitajDatum("Unesite datum kad ste napravili aktivnost."));

		while (true) {
			pregledBazeAktivnostiZaDnevnik();
			pk.setAktivnosti(aktivnosti.get(Ulaz.ucitajInt("Odaberite aktivnost koju ste napravili",
					"Ne ispravan unos. Pokušajte ponovo.", 1, aktivnosti.size()) - 1));
			System.out.println();
			pk.setTrajanjeAktivnosti(
					Ulaz.ucitajInt("Unesite trajanje aktivnosti", "Aktivnost ne može biti duža od 1h", 0, 60));
			System.out.println("Dali želite unijeti još aktivnosti?");
			
			if (Ulaz.scanner.nextLine().trim().toLowerCase().equals("da")) {
				continue;
			}
			break;
		}

		return pk;
	}

	// Unos kalorija za dnevnik
	private UnosKalorija unosKalorijaPostaviVrijednosti(UnosKalorija uk) {

		// uk.setDatum(Ulaz.ucitajDatum("Unesite datum kada ste konzumirali hranu"));
		while (true) {
			pregledBazeHraneZaDnevnik();
			System.out.println();
			uk.setHrana(hrana.get(Ulaz.ucitajInt("Odaberite hranu koju ste konzumirali",
					"Ne ispravan unos. Pokušajte ponovo.", 1, hrana.size()) - 1));
			uk.setKolicinaHrane(Ulaz.ucitajInt("Koliko ste " + uk.getHrana().getImeHrane() + " konzumirali u gramima? ",
					"Maksimum možete unijeti 1000g tj. 1kg hrane", 0, 1000));
			System.out.println("Dali želite unijeti još hrane?");
			if (Ulaz.scanner.nextLine().trim().toLowerCase().equals("da")) {
				continue;
			}
			break;
		}

		return uk;
	}

	// Pregled hrane koja je pojedena
	private void dnevnikPregled() {
		dnevnikStavke("Pregled unosa po danima");
		dnevnikIzbornik();

	}

	// Pregled sve hrane, aktivnosti i korisnika koja je korištena
	private void dnevnikStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("-------------------");

		if (unosKcal.isEmpty()) {
			System.out.println("Trenutno nema unosa hrane na Vašem računu");
		} else {

			UnosKalorija uk;

			System.out.println("Danas ste unijeli sljedeću hranu: ");
			for (int i = 0; i < unosKcal.size(); i++) {

				// Hrana koja je unesena
				uk = unosKcal.get(i);

				System.out.println(
						uk.getHrana().getImeHrane() + " " + (uk.getKolicinaHrane() / 100) * uk.getHrana().getKalorije()
								+ " kcal, " + (uk.getKolicinaHrane() / 100) * uk.getHrana().getProteini() + " proteina,"
								+ (uk.getKolicinaHrane() / 100) * uk.getHrana().getUgljikohidrati() + " ugljikohidrata,"
								+ (uk.getKolicinaHrane() / 100) * uk.getHrana().getMasti() + " masti. ");

			}

			System.out.println();
		}

		if (potrosnjaKcal.isEmpty()) {
			System.out.println("Trenutno nema aktivnosti na Vašem računu");
		} else {

			// Aktivnosti koje su unesene
			System.out.println();
			System.out.println("Danas ste obavili sljedeće aktivnosti: ");
			PotrosnjaKalorija pk;
			for (int i = 0; i < potrosnjaKcal.size(); i++) {
				pk = potrosnjaKcal.get(i);

				System.out.println(pk.getAktivnosti().getImeAktivnosti() + " "
						+ (pk.getTrajanjeAktivnosti() / 60) * (pk.getAktivnosti().getPotroseneKalorijePoSatu())
						+ " - kcal ");

			}

		}

		// BMR je koliko hrane čovjek troši samo da održava vitalne funkcije
		int basicMetablicRate = 0;
		if (korisnik.isEmpty()) {
			System.out.println("Trenutno nema unosa na Vašem računu");
		} else {

			System.out.println();
			System.out.print("Vaše dnevne potrebe za kalorijama su: ");
			for (int i = 0; i < korisnik.size(); i++) {

				Korisnik k;
				k = korisnik.get(i);
				double bmr;
				double bmr2;
				double bmr1;

				bmr = 88.362 + 13.397 * k.getTezina();
				bmr1 = 4.799 * k.getVisina();
				bmr2 = -5.677 * k.getDob();
				basicMetablicRate = (int) (bmr1 + bmr2 + bmr);

				System.out.println(basicMetablicRate);

			}
			int kolikoJeDosadUnesenoKalorija = 0;
			for (UnosKalorija uk : unosKcal) {
				kolikoJeDosadUnesenoKalorija += (uk.getKolicinaHrane() / 100) * uk.getHrana().getKalorije();
			}

			// Koliko je dosad unio kalorija kroz hranu
			System.out.println("Dosad ste unijeli: " + kolikoJeDosadUnesenoKalorija + " kcal.");

			int kolikoJeDosadPotrosenoKalorija = 0;
			for (PotrosnjaKalorija pk : potrosnjaKcal) {
				kolikoJeDosadPotrosenoKalorija += (pk.getTrajanjeAktivnosti() / 100)
						* pk.getAktivnosti().getPotroseneKalorijePoSatu();
			}

			// Koliko je dosad potrošio kalorija kroz aktivnosti
			System.out.println("Dosad ste potrošili: " + kolikoJeDosadPotrosenoKalorija + " kcal.");

			int razlikaIzmeduUnesenihKcalIPotrosenihKcal = basicMetablicRate + kolikoJeDosadPotrosenoKalorija
					- kolikoJeDosadUnesenoKalorija;

			// Koliko je korisniku ostalo kalorija u dnevnoj prehrani. Ako pojede više neće
			// smršaviti.
			System.out.println("Danas Vam je ostalo još: " + razlikaIzmeduUnesenihKcalIPotrosenihKcal + " kcal");

		}

	}

	public static void main(String[] args) {

		new Start();

	}

}
