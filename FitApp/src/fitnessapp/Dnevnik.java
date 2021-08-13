package fitnessapp;

import java.util.Date;


public class Dnevnik {
	
	
	private Date datum;
	private Aktivnosti aktivnost;
	
	private Hrana hrana;
	private Korisnik korisnik;

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Aktivnosti getAktivnost() {
		return aktivnost;
	}

	public void setAktivnost(Aktivnosti aktivnost) {
		this.aktivnost = aktivnost;
	}

	public Hrana getHrana() {
		return hrana;
	}

	public void setHrana(Hrana hrana) {
		this.hrana = hrana;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	
	
}
