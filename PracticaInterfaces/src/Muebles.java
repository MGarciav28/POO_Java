
public class Muebles {
private String tipo, material;
private float precio;

public Muebles() {
}

public Muebles(String tipo, String material, float precio) {
	this.tipo = tipo;
	this.material = material;
	this.precio = precio;
}

@Override
public String toString() {
	return "Muebles [tipo=" + tipo + ", material=" + material + ", precio=" + precio + "]\n";
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}



}
