
public class Tacos {
private int cantidad;
private String ingredientes;
private String tipo;
private float precio;
private String tamanio;

public Tacos(int cantidad, String ingredientes, String tipo, float precio, String tamanio) {
	this.cantidad = cantidad;
	this.ingredientes = ingredientes;
	this.tipo = tipo;
	this.precio = precio;
	this.tamanio = tamanio;
}

public Tacos() {
}

@Override
public String toString() {
	return "Tacos [cantidad=" + cantidad + ", ingredientes=" + ingredientes + ", tipo=" + tipo + ", precio=" + precio
			+ ", tamanio=" + tamanio + "]\n";
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public String getIngredientes() {
	return ingredientes;
}

public void setIngredientes(String ingredientes) {
	this.ingredientes = ingredientes;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getTamanio() {
	return tamanio;
}

public void setTamanio(String tamanio) {
	this.tamanio = tamanio;
}




}
