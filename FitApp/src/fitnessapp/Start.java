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

	public Start() {
		korisnik = new ArrayList<Korisnik>();
		glavniIzbornik();

	}

	private void glavniIzbornik() {
		System.out.println("****FitApp****");
		System.out.println("Izbornik");
		System.out.println("1. Dnevnik");
		System.out.println("2. Unos hrane");
		System.out.println("3. Unos aktivnosti");
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
		case 4 -> postavkeIzbornik();
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
		System.out.println("Ako želite znati više upišite da, ako se želite vratiti na glavni izbornik upišite ne.");

		switch (Ulaz.daIliNe("Želite li znati više", "Neispravan unos. Možete samo odgovoriti sa da ili ne", "da",
				"ne")) {
		case "da" -> ucitajLink();
		case "ne" -> glavniIzbornik();

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

		System.out.println("Želite li se vratiti na glavni izbornik? (Da/Ne)");
		if (scanner.nextLine().trim().toLowerCase() == "da") {
			glavniIzbornik();
		} else {
			System.out.println("Hvala Vam. Dođite opet!");
		}
	}

	private void postavkeIzbornik() {
		System.out.println("Dali imate kreiran račun? (Da/Ne)");
		String test = scanner.nextLine();
		try {
			if (test.trim().toLowerCase() == "da") {
				// ovdje treba pokazati izbornik sa svim korisnicima
			} else if (test.trim().toLowerCase() == "ne") {
				// Kreiraj račun

			}

		} catch (Exception e) {
			System.out.println("Niste dobro unijeli broj");
		}

	}

	private void izbornikAktivnosti() {

	}
	
	private void izbornikHrane() {
		System.out.println("-------------");
		System.out.println("1. Pregled po danima");
		System.out.println("2. Dodaj hranu u dnevnik");
		System.out.println("3. Brisadnje hrane");
		System.out.println("4. Dodajte hrane u bazu");
		System.out.println("5. Povratak na glavni izbornik");
		akcijaIzbornikHrane();
	}
	
	
	private void akcijaIzbornikHrane() {

		switch (Ulaz.ucitajInt("Odaberite sljedeću akciju", "Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> pregledPoDatumu();
		case 2 -> unosHrane();
		case 3 -> brisanjeHrane();
		case 4 -> dodavanjeHraneUBazu();
		case 5 -> glavniIzbornik();
		}

	}

	private void dodavanjeHraneUBazu() {

		Hrana h = new Hrana();
		h = hranaPostaviVrijednost(h);
		hrana.add(h);
		akcijaIzbornikHrane();
		izbornikHrane();

	}

	private Hrana hranaPostaviVrijednost(Hrana h) {
		h.setImeHrane(Ulaz.ucitajString("Kako se hrana zove", "Niste unijeli ime hrane"));
		h.setKalorije(Ulaz.ucitajInt("Koliko ima kalorija na 100 grama?", "Niste unijeli dobar broj", 0, 910));
		h.setProteini(Ulaz.ucitajInt("Koliko proteina ima na 100g?", "Niste unijeli dobar broj", 0, 410));
		h.setUgljikohidrati(Ulaz.ucitajInt("Koliko ugljikohidrata ima na 100g?", "Niste unijeli dobar broj", 0, 410));
		h.setMasti(Ulaz.ucitajInt("Koliko ima masti na 100 grama?", "Niste unijeli dobar broj", 0, 910));

		return h;
	}

	private void brisanjeHrane() {

	}

	private void unosHrane() {

	}

	private void pregledPoDatumu() {

	}

	private void dnevnikIzbornik() {

	}

	public static void main(String[] args) {
		new Start();

	}

}
