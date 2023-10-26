
public class Hamburgesa {
	private String nombre;
	private float precio;
	private String complementos;
	private String tamanio;
	
	public Hamburgesa(String nombre, float precio, String complementos, String tamanio) {
		this.nombre = nombre;
		this.precio = precio;
		this.complementos = complementos;
		this.tamanio = tamanio;
	}
	
	public Hamburgesa(String nombre) {
		this.nombre = nombre;
	}

	public Hamburgesa() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getComplementos() {
		return complementos;
	}

	public void setComplementos(String complementos) {
		this.complementos = complementos;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Hamburgesa [nombre=" + nombre + ", precio=" + precio + ", complementos=" + complementos + ", tamanio="
				+ tamanio + "]\n";
	}
	
	
	
	

}
