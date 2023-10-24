
public class Mascotas {
//Atributos
	String especie;
	String nombre;
	String color;
	int edad;
	String raza;
	
	//Constructor vacio -- Para inicializar las variables del ojeto
	//y para crear las instancias de clase
	public Mascotas() {
	}

	
	//Constructor con todos los parametros
	public Mascotas(String especie, String nombre, String color, int edad, String raza) {
		this.especie = especie;
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.raza = raza;
	}

//Permite convertir a cadena cualquier objeto
	@Override
	public String toString() {
		return "Mascotas [especie=" + especie + ", nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", raza="
				+ raza + "]";
	}


	
	//Encapsulamiento -- get y set
	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	

}
