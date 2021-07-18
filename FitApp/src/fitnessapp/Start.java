package fitnessapp;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class Start {

	private List<Hrana> hrana;
	private List<Aktivnosti> aktivnosti;

	public Start() {

		glavniIzbornik();

	}

	private void glavniIzbornik() {
		System.out.println("****FitApp****");
		System.out.println("Izbornik");
		System.out.println("1. Dnevnik");
		System.out.println("2. Unos hrane");
		System.out.println("3. Unos aktivnosti");
		System.out.println("4. Postavke");
		System.out.println("5. O nama");
		System.out.println("6. Izlazak iz aplikacije");
		ucitajGlavnuAkciju();

	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Izaberite stavku", "Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> dnevnikIzbornik();
		case 2 -> izbornikHrane();
		case 3 -> izbornikAktivnosti();
		case 4 -> postavkeIzbornik();
		case 5 -> oNamaIzbornik();
		case 6 -> izlazIzAplikacije();
		}

	}

	private void izlazIzAplikacije() {

	}

	private void oNamaIzbornik() {

		System.out.println("Program je napravio Zoran Đukić za završni rad iz tečaja Jave u Edunovi. ");
		System.out.println("Ako želite znati više upišite da, ako se želite vratiti na glavni izbornik upišite ne.5");

		switch (Ulaz.daIliNe("Želite li znati više", "Neispravan unos. Možete samo odgovoriti sa da ili ne", "da",
				"ne")) {
		case "da" -> ucitajLink();
		case "ne" -> ucitajGlavnuAkciju();

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
	}

	private void postavkeIzbornik() {

	}

	private void izbornikAktivnosti() {

	}

	private void izbornikHrane() {

	}

	private void dnevnikIzbornik() {

	}

	public static void main(String[] args) {
		new Start();

	}

}
