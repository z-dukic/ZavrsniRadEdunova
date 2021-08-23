package dukicljetnizadatak;

import java.util.Date;

public class PotrosnjaKalorija {

	public Korisnik korisnik;
	public Date datum;
	public Aktivnosti aktivnosti;
	public double trajanjeAktivnosti;


	

	public double getTrajanjeAktivnosti() {
		return trajanjeAktivnosti;
	}

	public void setTrajanjeAktivnosti(double trajanjeAktivnosti) {
		this.trajanjeAktivnosti = trajanjeAktivnosti;
	}

	public Aktivnosti getAktivnosti() {
		return aktivnosti;
	}

	public void setAktivnosti(Aktivnosti aktivnosti) {
		this.aktivnosti = aktivnosti;
	}

	public Korisnik getKorisnik() {
		return korisnik;
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
