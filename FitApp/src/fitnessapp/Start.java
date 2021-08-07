package fitnessapp;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Start {

	Scanner scanner = new Scanner(System.in);
	private List<Hrana> hrana;
	private List<Aktivnosti> aktivnosti;
	private List<Korisnik> korisnik;
	private List<Dnevnik> datumDnevnika;

	public Start() {
		hrana = new ArrayList<Hrana>();
		bazaHrane();

		aktivnosti = new ArrayList<Aktivnosti>();
		bazaAktivnosti();

		datumDnevnika = new ArrayList<Dnevnik>();

		korisnik = new ArrayList<Korisnik>();
		bazaKorisnik();

		glavniIzbornik();

	}

	private void bazaKorisnik() {
		Korisnik k = new Korisnik();
		korisnik.add(k);

		k.setNadimak(Ulaz.ucitajString("Odaberite nadimak", "Nadimak koji ste izabrali nije moguće izabrati."));

		k.setEmail(
				Ulaz.ucitajString("Unesite svoj email. Ukoliko unesete krivi email nećete moći pristupi svom računu.",
						"Neispravan format"));
		k.setDob(Ulaz.ucitajInt("Unesite koliko imate godina", "Neispravan unos", 16, 99));
		k.setSpol(Ulaz.ucitajSpol("Unesite spol. (M za muško, F za žensko)",
				"Možete samo unijeti M za muško i F za žensko"));
		k.setVisina(Ulaz.ucitajInt("Unesite svoju visinu u centimetrima",
				"Neispravan unos. Molimo unosite svoju visinu u centimetrima", 0, 220));
		k.setTezina(Ulaz.ucitajInt("Unesite svoju težinu u kilogramima",
				"Neispravan unos. Molimo unesite svoju kilažu u kilogramima", 0, 200));

	}

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

		Aktivnosti nista = new Aktivnosti();
		nista.setImeAktivnosti("Nema novih aktivnosti");
		aktivnosti.add(nista);

	}

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

		Hrana nista = new Hrana();
		nista.setImeHrane("Nema nove hrane");
		hrana.add(nista);

	}

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

		System.out.println("Program je napravio Zoran Đukić za završni rad iz tečaja Jave u Edunovi. ");

		switch (Ulaz.ucitajInt(
				"Ako želite znati više upišite broj 1, ako se želite vratiti na glavni izbornik upišite broj 2.",
				"Neispravan unos. Možete samo odgovoriti sa brojem jedna ili dva", 1, 2)) {

		case 1 -> ucitajLink();
		case 2 -> glavniIzbornik();
		}

	}

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

	private void brisanjeAktivnostiIzBaze() {
		aktivnostiStavke("Pregled unesenih aktivnosti");
		int brojAktivnosti = Ulaz.ucitajInt("Odaberite redni broj za brisanje", "Niste unijeli cijeli broj", 1,
				aktivnosti.size());
		aktivnosti.remove(brojAktivnosti - 1);
		izbornikAktivnosti();
	}

	private void dodavanjeAktivnostiUBazu() {

		Aktivnosti a = new Aktivnosti();
		a = aktivnostiPostaviVrijednosti(a);
		aktivnosti.add(a);

		izbornikAktivnosti();

	}

	private Aktivnosti aktivnostiPostaviVrijednosti(Aktivnosti a) {
		a.setImeAktivnosti(Ulaz.ucitajString("Unesite ime aktivnosti", "Niste unijeli ime aktivnosti"));
		a.setPotroseneKalorijePoSatu(
				Ulaz.ucitajInt("Unesite potrosene kalorije u sat vremena", "Niste dali cijeli broj", 0, 999));
		return a;
	}

	private void pregledBazeAktivnosti() {
		aktivnostiStavke("Pregled unesenih aktivnosti");

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

	private void dodavanjeHraneUBazu() {

		Hrana h = new Hrana();
		h = hranaPostaviVrijednost(h);
		hrana.add(h);

		izbornikHrane();

	}

	private Hrana hranaPostaviVrijednost(Hrana h) {

		h.setImeHrane(Ulaz.ucitajString("Kako se hrana zove", "Niste unijeli ime hrane"));
		h.setKalorije(Ulaz.ucitajInt("Koliko ima kalorija na 100 grama?", "Niste unijeli dobar broj", 0, 910));
		h.setProteini(Ulaz.ucitajInt("Koliko proteina ima na 100g?", "Niste unijeli dobar broj", 0, 100));
		h.setUgljikohidrati(Ulaz.ucitajInt("Koliko ugljikohidrata ima na 100g?", "Niste unijeli dobar broj", 0, 100));
		h.setMasti(Ulaz.ucitajInt("Koliko ima masti na 100 grama?", "Niste unijeli dobar broj", 0, 100));

		return h;
	}

	private void brisanjeHraneIzBaze() {
		hranaStavke("Trenutno dostupno u aplikaciji");
		int brojHrane = Ulaz.ucitajInt("Odaberite redni broj za brisanje", "Niste unijeli cijeli broj", 1,
				hrana.size());
		hrana.remove(brojHrane - 1);
		izbornikHrane();
	}

	private void pregledBazeHrane() {
		hranaStavke("Pregled unesene hrane");

	}

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

	}

	private void brisanjeHraneIliAktivnostiPoDanu() {
		dnevnikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite koju hranu ili aktivnost želite izbaciti",
				"Niste unijeli cijeli broj", 1, datumDnevnika.size());
		datumDnevnika.remove(redniBroj - 1);
		dnevnikIzbornik();
	}

	private void dodavanjeHraneIliAktivnostiPoDanu() {
		Dnevnik d = new Dnevnik();
		d = dnevnikPostaviVrijednosti(d);
		datumDnevnika.add(d);
		dnevnikIzbornik();
	}

	private Dnevnik dnevnikPostaviVrijednosti(Dnevnik d) {
		// d.setDatum(Ulaz.ucitajDatum("Unesi datum pocetka"));

		pregledBazeHrane();
		d.setHrana(hrana.get(Ulaz.ucitajInt("Odaberite hranu koju ste konzumirali",
				"Ne ispravan unos. Pokušajte ponovo.", 1, hrana.size()) - 1));

		pregledBazeAktivnosti();
		d.setAktivnost(aktivnosti.get(Ulaz.ucitajInt("Odaberite aktivnost koju ste napravili",
				"Ne ispravan unos. Pokušajte ponovo.", 1, aktivnosti.size()) - 1));

		return d;

	}

	private void dnevnikPregled() {
		dnevnikStavke("Pregled unosa po danima");
		dnevnikIzbornik();

	}

	private void dnevnikStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("-------------------");
		if (datumDnevnika.isEmpty()) {
			System.out.println("Trenutno nema unosa na Vašem računu");
		} else {
			Dnevnik d;

			System.out.println("Danas ste unijeli sljedeću hranu: ");
			for (int i = 0; i < datumDnevnika.size(); i++) {
				d = datumDnevnika.get(i);

				System.out.println(d.getHrana().getImeHrane() + " " + +d.getHrana().getKalorije() + " kcal, "
						+ d.getHrana().getProteini() + " proteina," + +d.getHrana().getUgljikohidrati()
						+ " ugljikohidrata," + d.getHrana().getMasti() + " masti. ");

			}
			System.out.println();
			System.out.println("Danas ste obavili sljedeće aktivnosti: ");
			for (int i = 0; i < datumDnevnika.size(); i++) {
				d = datumDnevnika.get(i);

				System.out.println(d.getAktivnost().getImeAktivnosti() + " "
						+ d.getAktivnost().getPotroseneKalorijePoSatu() + " - kcal ");

			}

			System.out.println();
			System.out.print("Vaše dnevne potrebe za kalorijama su: ");
			for (int i = 0; i < datumDnevnika.size(); i++) {
				d = datumDnevnika.get(i);
				Korisnik k;
				k = korisnik.get(i);
				double bmr;
				double bmr2;
				double bmr1;
				int bmr3;
				bmr = 88.362 + 13.397 * k.getTezina();
				bmr1 = 4.799 * k.getVisina();
				bmr2 = -5.677 * k.getDob();
				bmr3 = (int) (bmr1 + bmr2 + bmr);

				System.out.println(bmr3);

			}
		}

	}

	/*
	 * private void izbornikDatuma() { LocalDate danas = LocalDate.now(); String
	 * formatiraniDanas = danas.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	 * System.out.println(formatiraniDanas);
	 * 
	 * LocalDate jucer = danas.minusDays(1); String formatiraniJucer =
	 * jucer.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	 * System.out.println(formatiraniJucer);
	 * 
	 * LocalDate prekjucer = danas.minusDays(2); String formatiraniPrekjucer =
	 * prekjucer.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	 * System.out.println(formatiraniPrekjucer);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new Start();

	}

}
