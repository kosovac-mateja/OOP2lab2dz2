package revija;

public class Model {

	private static int br = 0;
	private int id = br++;
	private Velicina vel;
	
	public Model(Velicina vel) {
		this.vel = vel;
	}
	
	public int dohvId() {
		return id;
	}

	public Velicina dohvVelicinu() {
		return vel;
	}

	@Override
	public String toString() {
		return "Model" + id + " (" + vel + ")";
	}

	public static void main(String[] args) {

	}

}
