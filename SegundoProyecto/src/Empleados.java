
public class Empleados {
	//Atributos
	int numTrabajador;
	String nombre;
	String apePaterno;
	String apeMaterno;
	String correo;
	long numCelular;
	
	
	//Constructores
	public Empleados(int numTrabajador, String nombre, String apePaterno, String apeMaterno, String correo,
			long numCelular) {
		this.numTrabajador = numTrabajador;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.correo = correo;
		this.numCelular = numCelular;
	}
	public Empleados() {
	}
	@Override
	public String toString() {
		return "Empleados [numTrabajador=" + numTrabajador + ", nombre=" + nombre + ", apePaterno=" + apePaterno
				+ ", apeMaterno=" + apeMaterno + ", correo=" + correo + ", numCelular=" + numCelular + "]";
	}
	public int getNumTrabajador() {
		return numTrabajador;
	}
	public void setNumTrabajador(int numTrabajador) {
		this.numTrabajador = numTrabajador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public long getNumCelular() {
		return numCelular;
	}
	public void setNumCelular(long numCelular) {
		this.numCelular = numCelular;
	}
	

	

}
