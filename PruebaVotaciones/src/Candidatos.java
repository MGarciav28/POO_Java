
public class Candidatos implements Comparable<Candidatos>{
	private String nombre;
	private int id;
	private int votos;
	
	public Candidatos() {
	}

	public Candidatos(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Candidatos [nombre=" + nombre + ", id=" + id + ", votos=" + votos + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	@Override
	public int compareTo(Candidatos o) {
		if (this.getVotos()<o.getVotos()) {
			return 1;
		}else if(this.getVotos()>o.getVotos()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	
}
