
public class Television {
	String marca;
	String id;
	boolean smart;
	double precio;
	double dimension;
	
	
	//Creando constructores
	public Television() {
	}



	public Television(String marca, String id, boolean smart, double precio, double dimension) {
		this.marca = marca;
		this.id = id;
		this.smart = smart;
		this.precio = precio;
		this.dimension = dimension;
	}


// Creando el To string
	@Override
	public String toString() {
		return "Television [marca=" + marca + ", id=" + id + ", smart=" + smart + ", precio=" + precio + ", dimension="
				+ dimension + "]";
	}


//getters y setters
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public boolean isSmart() {
		return smart;
	}



	public void setSmart(boolean smart) {
		this.smart = smart;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getDimension() {
		return dimension;
	}



	public void setDimension(float dimension) {
		this.dimension = dimension;
	}	

}
