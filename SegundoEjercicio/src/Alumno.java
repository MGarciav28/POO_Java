
public class Alumno {
String nombre;
String apellido;
float colegiatura;
float beca;
String grupo;


public Alumno(String nombre, String apellido, float colegiatura, float beca, String grupo) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.colegiatura = colegiatura;
	this.beca = beca;
	this.grupo = grupo;
}



public Alumno() {
}



@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", colegiatura=" + colegiatura + ", beca=" + beca
			+ ", grupo=" + grupo + "]";
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellido() {
	return apellido;
}



public void setApellido(String apellido) {
	this.apellido = apellido;
}



public float getColegiatura() {
	return colegiatura;
}



public void setColegiatura(float colegiatura) {
	this.colegiatura = colegiatura;
}



public float getBeca() {
	return beca;
}



public void setBeca(float beca) {
	this.beca = beca;
}



public String getGrupo() {
	return grupo;
}



public void setGrupo(String grupo) {
	this.grupo = grupo;
}


	
}
