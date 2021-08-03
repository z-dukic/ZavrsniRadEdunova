package fitnessapp;

public class Dnevnik {

	private String datum;
	private Aktivnosti aktivnost;
	private Hrana hrana;

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

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

}
