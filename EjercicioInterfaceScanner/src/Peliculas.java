
public class Peliculas {
private String titulo;
private float precio;
private String formato;
private int cantidad;
private String productora;

public Peliculas() {
}



public Peliculas(String titulo, float precio, String formato, int cantidad, String productora) {
	this.titulo = titulo;
	this.precio = precio;
	this.formato = formato;
	this.cantidad = cantidad;
	this.productora = productora;
}



@Override
public String toString() {
	return "Peliculas [titulo=" + titulo + ", precio=" + precio + ", formato=" + formato + ", cantidad=" + cantidad
			+ ", productora=" + productora + "]\n";
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getFormato() {
	return formato;
}

public void setFormato(String formato) {
	this.formato = formato;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public String getProductora() {
	return productora;
}

public void setProductora(String productora) {
	this.productora = productora;
}





}
