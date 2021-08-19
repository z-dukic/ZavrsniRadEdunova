package fitnessapp;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start {

	Scanner scanner = new Scanner(System.in);
	private List<Hrana> hrana;
	private List<Aktivnosti> aktivnosti;
	private List<Korisnik> korisnik;
	private List<Dnevnik> datumDnevnika;
	private List<UnosKalorija> unosKcal;
	private List<PotrosnjaKalorija> potrosnjaKcal;
	HashMap<String, String> znanje = new HashMap<String, String>();

	public Start() {

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

		unosKcal = new ArrayList<UnosKalorija>();

		potrosnjaKcal = new ArrayList<PotrosnjaKalorija>();

		korisnik = new ArrayList<Korisnik>();
		bazaKorisnik();

		glavniIzbornik();

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
		System.out.println("--------------");

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

	private void oNamaIzbornik() {
		System.out.println("---------------");
		System.out.println("Help");
		System.out.println("1. Pregled source koda");
		System.out.println("2. Mail s zadnjim updateom aplikacije");
		System.out.println("3. Razgovor s korisničkom službom");
		System.out.println("4. Kontaktirajte nas preko e-maila");
		System.out.println("5. Povratak na glavni izbornik");

		oNamaUcitajAkciju();
	}

	// Šalje na GitHub gdje se vide podaci o FitAppu
	private void oNamaUcitajAkciju() {

		System.out.println("Program je napravio Zoran Đukić za završni rad iz tečaja Jave u Edunovi. ");

		switch (Ulaz.ucitajInt("Izaberite koju želite akciju",
				"Neispravan unos. Možete samo odgovoriti sa brojem jedna ili dva", 1, 4)) {

		case 1 -> ucitajLink();
		case 2 -> devInformacije();
		case 3 -> testBot();
		case 4 -> kontaktViaEmail();
		case 5 -> glavniIzbornik();
		}

	}

	private void kontaktViaEmail() {
		System.out.println(
				"Molimo Vas da ukratko opišete problem koji Vas muči. Probat ćemo Vam odgovoriti u najkraćem mogućem roku.");
		Ulaz send = new Ulaz("perop8406@gmail.com", "Primjedba", scanner.nextLine());
		System.out.println(
				"Hvala Vam na Vašem mailu. Jedan od naših tehničara će Vam se javiti u najkraćem mogućem roku.");
		System.out.println("-----------");
		glavniIzbornik();

	}

	public void testBot() {
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		Ulaz chatbot = new Ulaz();

		System.out.println(
				"Pozdrav, moje ime je Botko. Kako ti mogu pomoći? Zapamti, možeš me uvijek prekinuti da uneseš kraj.");
		while (!userInput.equalsIgnoreCase("kraj")) {
			System.out.print("Korisnik: ");
			userInput = scanner.nextLine().toLowerCase().trim();
			chatbot.odgovoriBota(userInput);
		}
		System.out.println("-----------------");
		glavniIzbornik();
		scanner.close();

	}

	public void treningBota(String pitanje) {
		System.out.println("Bot: Oprosti, ne razumijem pitanje. Kako sam trebao odgovoriti na tvoje pitanje?");
		System.out.println("Korisnik: ");
		String korisnikInput = scanner.nextLine();
		znanje.put(pitanje, korisnikInput);

	}

	private void devInformacije() {
		Korisnik k;
		k = korisnik.get(0);

		Ulaz send = new Ulaz(k.getEmail(), "Hvala Vam što koristite naše usluge - FitApp team.", "Hvala Vam "
				+ k.getNadimak()
				+ " što koriste FitApp. Za više informacija o FitAppu posjetite https://github.com/z-dukic/ZavrsniRadEdunova. Vaš FitApp team. \n"
				+ "Lista stvari koje planiramo implementirati. \n 1. Napraviti konzolu za administratora \n 2. Napraviti da se može unijeti više od jednog dana \n 3. Napraviti da se može unijeti više od jednog korisnika \n 4. Napraviti grafičko sučelje \n 5. Napraviti spajanje na bazu podataka");
		glavniIzbornik();
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
		System.out.println("1. Pregled Vaših postavki");
		System.out.println("2. Promjena podataka korisnika");
		System.out.println("3. Povratak na glavni izbornik");

		KorisnikUcitajAkciju();
	}

	private void KorisnikUcitajAkciju() {

		switch (Ulaz.ucitajInt("Odaberite akciju od 1 do 3", "Pogrešan unos. Možete izabrati samo od 1 do 3", 1, 3)) {
		case 1 -> {
			pregledKorisnika();
			korisnikIzbornik();
		}
		case 2 -> promjenaPodatkaKorisnika();
		case 3 -> glavniIzbornik();

		}

	}

	private void promjenaPodatkaKorisnika() {
		korisnik.remove(0);
		bazaKorisnik();
	}

	// Pregled svih računa
	private void pregledKorisnika() {
		pristupRacunuStavke("Pregled svih računa");
		korisnikIzbornik();
	}

	private void pristupRacunuStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------");
		if (korisnik.isEmpty()) {
			System.out.println("Nema unesenih korisnika");
		} else {
			System.out.println("Ovo su Vaši podaci.");
			Korisnik k;
			for (int i = 0; i < korisnik.size(); i++) {
				k = korisnik.get(i);
				System.out.println("Vaš nadimak: " + k.getNadimak());
				System.out.println("Imate " + k.getDob() + " godina ");
				System.out.println("Vaš e-mail je: " + k.getEmail());
				System.out.println("Vaša visina je: " + k.getVisina() + "cm.");
				System.out.println("Trenutačna težina je: " + k.getTezina() + "kg.");
				System.out.println("Vaša željena težina je: " + k.getZeljenaTezina() + "kg.");
				System.out.println();
			}
		}

	}

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
		System.out.println("4. Blog");
		System.out.println("5. Povratak na glavni izbornik");
		akcijaDnevnikIzbornik();

	}

	private void akcijaDnevnikIzbornik() {
		switch (Ulaz.ucitajInt("Odaberite sljedeću akciju", "Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> dnevnikPregled();
		case 2 -> dodavanjeHraneIliAktivnostiPoDanu();
		case 3 -> brisanjeHraneIliAktivnostiPoDanu();
		case 4 -> blogRecepti();
		case 5 -> glavniIzbornik();

		}

	}

	private void brisanjeHraneIliAktivnostiPoDanu() {

		switch (Ulaz.ucitajInt(
				"Ako želite izbrisati unesenu hranu unesite broj (1), ako želite obrisati aktivnost iz dnevnika upišite (2)",
				"Možete samo unijeti (1) za brisanje unesene hrane ili (2) za brisanje unesene aktivnosti", 1, 2)) {

		case 1 -> {
			dnevnikStavke("Trenutno dostupno u aplikaciji");
			System.out.println("----------------");
			int redniBroj = Ulaz.ucitajInt("Odaberite koju hranu ili aktivnost želite izbaciti",
					"Niste unijeli cijeli broj", 1, unosKcal.size());
			unosKcal.remove(redniBroj - 1);
			dnevnikIzbornik();
		}

		case 2 -> {

			dnevnikStavke("Trenutno dostupno u aplikaciji");
			System.out.println("----------------");
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
		System.out.println();

		// pk.setDatum(Ulaz.ucitajDatum("Unesite datum kad ste napravili aktivnost."));

		pregledBazeAktivnostiZaDnevnik();
		pk.setAktivnosti(aktivnosti.get(Ulaz.ucitajInt("Odaberite aktivnost koju ste napravili",
				"Ne ispravan unos. Pokušajte ponovo.", 1, aktivnosti.size()) - 1));
		System.out.println();
		pk.setTrajanjeAktivnosti(
				Ulaz.ucitajInt("Unesite trajanje aktivnosti", "Aktivnost ne može biti duža od 1h", 0, 60));

		return pk;
	}

	// Unos kalorija za dnevnik
	private UnosKalorija unosKalorijaPostaviVrijednosti(UnosKalorija uk) {

		// uk.setDatum(Ulaz.ucitajDatum("Unesite datum kada ste konzumirali hranu"));

		pregledBazeHraneZaDnevnik();
		System.out.println();
		uk.setHrana(hrana.get(Ulaz.ucitajInt("Odaberite hranu koju ste konzumirali",
				"Ne ispravan unos. Pokušajte ponovo.", 1, hrana.size()) - 1));
		uk.setKolicinaHrane(Ulaz.ucitajInt("Koliko ste " + uk.getHrana().getImeHrane() + " konzumirali u gramima? ",
				"Maksimum možete unijeti 1000g tj. 1kg hrane", 0, 1000));

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
						+ " kcal ");

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

				if (k.isSpol() == true) {
					bmr = 88.362 + 13.397 * k.getTezina();
					bmr1 = 4.799 * k.getVisina();
					bmr2 = -5.677 * k.getDob();
					basicMetablicRate = (int) (bmr1 + bmr2 + bmr);
				}

				if (k.isSpol() == false) {
					bmr = 447.593 + 9.247 * k.getTezina();
					bmr1 = 3.098 * k.getVisina();
					bmr2 = -4.330 * k.getDob();
					basicMetablicRate = (int) (bmr1 + bmr2 + bmr);
				}

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
			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal < 0) {
				System.out.println("Trenutno ste unijeli " + razlikaIzmeduUnesenihKcalIPotrosenihKcal * -1
						+ " kcal više od potreba Vašeg organizma. Ukoliko nastavite ovako jesti to će rezultirati povećanjem Vaše tjelesne težine.");
			}

		}

	}

	private void blogRecepti() {

		System.out.println();
		System.out.println("Naš će Vam sustav predložiti jela na temelju Vaših potreba.");

		Korisnik k;
		k = korisnik.get(0);
		double bmr;
		double bmr2;
		double bmr1;
		int basicMetablicRate = 0;

		if (k.isSpol() == true) {
			bmr = 88.362 + 13.397 * k.getTezina();
			bmr1 = 4.799 * k.getVisina();
			bmr2 = -5.677 * k.getDob();
			basicMetablicRate = (int) (bmr1 + bmr2 + bmr);
		}

		if (k.isSpol() == false) {
			bmr = 447.593 + 9.247 * k.getTezina();
			bmr1 = 3.098 * k.getVisina();
			bmr2 = -4.330 * k.getDob();
			basicMetablicRate = (int) (bmr1 + bmr2 + bmr);
		}

		int kolikoJeDosadUnesenoKalorija = 0;
		for (UnosKalorija uk : unosKcal) {
			kolikoJeDosadUnesenoKalorija += (uk.getKolicinaHrane() / 100) * uk.getHrana().getKalorije();

			int kolikoJeDosadPotrosenoKalorija = 0;
			for (PotrosnjaKalorija pk : potrosnjaKcal) {
				kolikoJeDosadPotrosenoKalorija += (pk.getTrajanjeAktivnosti() / 100)
						* pk.getAktivnosti().getPotroseneKalorijePoSatu();
			}
			int razlikaIzmeduUnesenihKcalIPotrosenihKcal = basicMetablicRate + kolikoJeDosadPotrosenoKalorija
					- kolikoJeDosadUnesenoKalorija;

			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal > 0 && razlikaIzmeduUnesenihKcalIPotrosenihKcal < 250) {
				prijedlogHrane250kcal();
			}

			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal > 0 && razlikaIzmeduUnesenihKcalIPotrosenihKcal < 500) {
				prijedlogHrane500kcal();
			}

			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal > 0 && razlikaIzmeduUnesenihKcalIPotrosenihKcal < 750) {
				prijedlogHrane750kcal();
			}

			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal > 1000) {
				prijedlogHrane1000kcal();
			}
			if (razlikaIzmeduUnesenihKcalIPotrosenihKcal <= 0) {
				System.out.println(
						"Nemate više kalorija za današnji dan. Ako želite povećati broj raspoloživih kalorija možete napraviti neku aktivnost kao npr. hodanje.");
			}

		}
		dnevnikIzbornik();
	}

	private void prijedlogHrane1000kcal() {

		int prijedlog250 = new Random().nextInt(3);
		switch (prijedlog250) {
		case 0 -> recept1();
		case 1 -> recept2();
		case 2 -> recept3();

		default -> System.out.println("Error flag 1.");

		}

	}

	private void prijedlogHrane750kcal() {

		int prijedlog250 = new Random().nextInt(3);
		switch (prijedlog250) {
		case 0 -> recept1();
		case 1 -> recept2();
		case 2 -> recept3();

		default -> System.out.println("Error flag 2.");

		}

	}

	private void prijedlogHrane500kcal() {

		int prijedlog250 = new Random().nextInt(3);
		switch (prijedlog250) {
		case 0 -> recept1();
		case 1 -> recept2();
		case 2 -> recept3();

		default -> System.out.println("Error flag 3.");

		}
	}

	private void prijedlogHrane250kcal() {

		int prijedlog250 = new Random().nextInt(3);
		switch (prijedlog250) {
		case 0 -> recept1();
		case 1 -> recept2();
		case 2 -> recept3();

		default -> System.out.println("Error flag 4.");

		}

	}

	private void recept3() {
		System.out.println("Salata od škampa");

		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI oURL = new URI("https://www.bbcgoodfood.com/recipes/prawn-pink-grapefruit-noodle-salad");
			desktop.browse(oURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ocjenaRecepta("salataOdSkampa");
		dnevnikIzbornik();
	}



	private void recept2() {
		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI oURL = new URI("https://www.bbcgoodfood.com/recipes/indian-chicken-protein-pots");
			desktop.browse(oURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dnevnikIzbornik();
	}

	private void recept1() {
		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI oURL = new URI("https://www.bbcgoodfood.com/recipes/sweet-potato-chestnut-roast-tangy-tomato-sauce");
			desktop.browse(oURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dnevnikIzbornik();
	}
	
	private void ocjenaRecepta(String imeHrane) {
		System.out.println("Kako bi ocijenili ovaj recept?");
		int ocjena = scanner.nextInt();
		int[] arr = new int[ocjena];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

	}

	public static void main(String[] args) {

		new Start();

	}

}
