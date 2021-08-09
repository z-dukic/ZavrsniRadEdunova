package fitnessapp;

import java.util.Date;

public class UnosKalorija {
	
	public Korisnik korisnik;
	public Date datum;
	public Hrana hrana;

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public Hrana getHrana() {
		return hrana;
	}

	public void setHrana(Hrana hrana) {
		this.hrana = hrana;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
