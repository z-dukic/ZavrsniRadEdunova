package fitnessapp;

import java.util.Scanner;

public class Ulaz {

	public static Scanner scanner = new Scanner(System.in);

	public static String ucitajSpol(String poruka, String greska ) {
		String spolString = "";
		
		while(true) {
			System.out.println(poruka);
			try {
				spolString = scanner.nextLine().trim().toLowerCase();
				if(spolString.equals("M") || spolString.equals("F")) {
					System.out.println("Možete odgovoriti samo sa M(Muško) ili F(Žensko)");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(greska);
			}
		}

		return spolString;
	}

	public static int ucitajInt(String poruka, String greska, int min, int max) {
		int broj = 0;
		while (true) {
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(scanner.nextLine());
				if (broj < min || broj > max) {
					System.out.println("Broj ne smije biti manji od: " + min + " ili veći od " + max);
					continue;
				}
				break;

			} catch (Exception e) {
				System.out.println(greska);
			}
		}

		return broj;
	}

	public static String daIliNe(String poruka, String greska, String da, String ne) {
		String izjava = "";

		while (true) {
			try {
				izjava = scanner.nextLine().trim().toLowerCase();
				if (izjava == "da" || izjava == "ne") {
					System.out.println("Možete odgovoriti samo sa da ili ne");
					continue;
				}
				break;

			} catch (Exception e) {
				System.out.println(greska);
			}
		}

		return izjava;
	}

	public static String ucitajString(String poruka, String greska) {
		String string = "";
		while (true) {
			System.out.println(poruka);
			string = scanner.nextLine();
			if (string.trim().equals("")) {
				System.out.println(greska);
				continue;
			}
			break;
		}

		return string;
	}

}
