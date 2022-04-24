package revija;

public class Odeca implements Nosivo {

	private String naziv;
	private Velicina vel;
	
	public Odeca(String naziv, Velicina vel) {
		this.naziv = naziv;
		this.vel = vel;
	}
	
	public String dohvNaziv() {
		return naziv;
	}

	public Velicina dohvVelicinu() {
		return vel;
	}

	@Override
	public boolean odgovara(Model m) {
		return !vel.manja(m.dohvVelicinu());
	}
	
	@Override
	public String toString() {
		return "odeća " + naziv + " " + vel;
	}

	public static void main(String[] args) {
	}

}
