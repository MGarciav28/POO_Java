
public class Carros {
private int numSerie; //Este va a ser nuestra llave
private String marca;
private String modelo;
private float precio;


public Carros() {
}


public Carros(int numSerie, String marca, String modelo, float precio) {
	this.numSerie = numSerie;
	this.marca = marca;
	this.modelo = modelo;
	this.precio = precio;
}

//AGREGAMOS CONTRUCTOR CON EL PARAMETRO DE NUESTRA LLAVE
public Carros(int numSerie) {
	this.numSerie = numSerie;
}


@Override
public String toString() {
	return "Carros [numSerie=" + numSerie + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]\n";
}


public int getNumSerie() {
	return numSerie;
}


public void setNumSerie(int numSerie) {
	this.numSerie = numSerie;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public float getPrecio() {
	return precio;
}


public void setPrecio(float precio) {
	this.precio = precio;
}






}
