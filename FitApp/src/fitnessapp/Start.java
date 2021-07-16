package fitnessapp;

import java.util.List;

public class Start {
	
	private List<Hrana>hrana; 
	private List<Aktivnosti>aktivnosti;

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
		ucitajGlavnuAkciju();

	}

	private void ucitajGlavnuAkciju() {
		switch() {
		case 1 -> dnevnikIzbornik();
		case 2 -> izbornikHrane();
		case 3 -> izbornikAktivnosti();
		case 4 -> postavkeIzbornik();
		case 5 -> oNamaIzbornik();
		}
		
	}

	private void oNamaIzbornik() {

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
