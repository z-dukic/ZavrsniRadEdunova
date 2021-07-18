package fitnessapp;

import java.util.Scanner;

public class Ulaz {

	public static Scanner scanner = new Scanner(System.in);

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

}
