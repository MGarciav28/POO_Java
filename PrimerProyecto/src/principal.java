
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascotas obj1 = new Mascotas();
		
		obj1.especie ="perro";
		obj1.nombre="Duque";
		obj1.color="negro";
		obj1.edad=3;
		obj1.raza="Schnauzer";
		
		System.out.println("Caracteristicas de la mascota");
		System.out.println("Nombre: "+obj1.nombre);
		System.out.println("Edad: "+obj1.edad);
		System.out.println("Raza: "+obj1.raza);
		
		//Instancia de clase con encapsulamiento
		
		Mascotas mascota2 = new Mascotas();
		
		mascota2.setEspecie("gato");
		mascota2.setColor("Gris");
		mascota2.setNombre("Tom");
		mascota2.setEdad(1);
		mascota2.setRaza("Siames");
		
		System.out.println("Informacion de la mascota 2");
		System.out.println("Especie: "+mascota2.getEspecie());
		System.out.println("Nombre: "+mascota2.getNombre());
		System.out.println("Edad: "+mascota2.getEdad());
		System.out.println("Raza: "+mascota2.getRaza());
		
		//Instancia de clase con constructor con todos los parametros
		Mascotas mascota3 = new Mascotas("Ave", "Polly", "Verde", 1, "Perico Australiano");
		System.out.println(mascota3.toString());
	}

	
	
}
