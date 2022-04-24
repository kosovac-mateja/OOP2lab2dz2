package revija;

import java.util.LinkedList;
import java.util.List;

public class Kombinacija {
	
	private List<Nosivo> nosivo = new LinkedList<>();
	
	private int kap;

	public Kombinacija(int kap) {
		this.kap = kap;
	}
	
	public Kombinacija dodaj(Nosivo nos) throws GDodavanje {
		if(this.dohvBrStvari()==this.dohvMaxBrStvari()) throw new GDodavanje();
		nosivo.add(nos);
		return this;
	}

	public int dohvMaxBrStvari() {
		return kap;
	}

	public int dohvBrStvari() {
		return nosivo.size();
	}
	
	public Nosivo dohvStvar(int index) throws GIndeks {
		if(index < 0 || index >= dohvBrStvari()) throw new GIndeks();
		return nosivo.get(index);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		int i = 0;
		for(Nosivo nos : nosivo) {
			sb.append(nos);
			if(i != dohvBrStvari()-1) {
				sb.append(',');
			}
			i++;
		}
		sb.append(']');
		return sb.toString();
	}

	public static void main(String[] args) {
		
	}
}
