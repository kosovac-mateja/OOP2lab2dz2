package revija;

public class Velicina {
	
	public enum Oznaka {
		S(1), M(2), L(3);
		private int vred;
		Oznaka(int vred) {
			this.vred = vred;
		}
		public int vrednost() {
			return vred;
		}
	}
	
	private Oznaka oznaka;

	public Velicina(Oznaka oznaka) {
		this.oznaka = oznaka;
	}

	public Oznaka dohvOznaku() {
		return oznaka;
	}

	public boolean manja(Velicina v) {
		return this.dohvOznaku().vrednost() < v.dohvOznaku().vrednost();
	}
	
	@Override
	public String toString() {
		return oznaka.toString();
	}

	public static void main(String[] args) {
		Velicina vel = new Velicina(Velicina.Oznaka.M);
		
		System.out.println(vel.manja(new Velicina(Velicina.Oznaka.L)));
	}

}
