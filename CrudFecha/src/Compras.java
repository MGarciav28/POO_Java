import java.time.LocalDate;
import java.time.LocalDateTime;

public class Compras {
private LocalDateTime fechaCompra;
private String producto;
private float precio;
private LocalDate limiteFactura;

public Compras() {
}

public Compras(LocalDateTime fechaCompra, String producto, float precio, LocalDate limiteFactura) {
	this.fechaCompra = fechaCompra;
	this.producto = producto;
	this.precio = precio;
	this.limiteFactura = limiteFactura;
}

@Override
public String toString() {
	return "Compras [fechaCompra=" + fechaCompra + ", producto=" + producto + ", precio=" + precio + ", limiteFactura="
			+ limiteFactura + "]";
}

public LocalDateTime getFechaCompra() {
	return fechaCompra;
}

public void setFechaCompra(LocalDateTime fechaCompra) {
	this.fechaCompra = fechaCompra;
}

public String getProducto() {
	return producto;
}

public void setProducto(String producto) {
	this.producto = producto;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public LocalDate getLimiteFactura() {
	return limiteFactura;
}

public void setLimiteFactura(LocalDate limiteFactura) {
	this.limiteFactura = limiteFactura;
}



	
}
