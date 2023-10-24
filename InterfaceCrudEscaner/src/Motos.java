
public class Motos {
	private int numSerie;
	private String placa;
	private String modelo;
	private String marca;
	private float precio;
	
	public Motos(int numSerie, String placa, String modelo, String marca, float precio) {
		this.numSerie = numSerie;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}
	public Motos() {
	}
	@Override
	public String toString() {
		return "Motos [numSerie=" + numSerie + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca
				+ ", precio=" + precio + "]\n";
	}
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
