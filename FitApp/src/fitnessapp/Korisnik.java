package fitnessapp;

public class Korisnik {

	private int sifra;
	private String nadimak;
	private int visina;
	private String tezina;
	private boolean spol;

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNadimak() {
		return nadimak;
	}

	public void setNadimak(String nadimak) {
		this.nadimak = nadimak;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String getTezina() {
		return tezina;
	}

	public void setTezina(String tezina) {
		this.tezina = tezina;
	}

	public boolean isSpol() {
		return spol;
	}

	public void setSpol(boolean spol) {
		this.spol = spol;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	private int dob;

}
