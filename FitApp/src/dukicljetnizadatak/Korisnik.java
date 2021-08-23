package dukicljetnizadatak;

public class Korisnik {

	private int sifra;
	private String nadimak;
	private String lozinka;
	private String email;
	private int visina;
	private int tezina;
	private int zeljenaTezina;
	private int dob;
	private boolean spol;
	

	public int getZeljenaTezina() {
		return zeljenaTezina;
	}

	public void setZeljenaTezina(int zeljenaTezina) {
		this.zeljenaTezina = zeljenaTezina;
	}

	public boolean isSpol() {
		return spol;
	}

	public void setSpol(boolean spol) {
		this.spol = spol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

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

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

}
