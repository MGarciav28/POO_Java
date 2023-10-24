import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Coleccion de objetos
		Alumno alu1 = new Alumno("Jose", "Perez", 3000, (float) 0.20, "2do F");
		Alumno alu2 = new Alumno("Juan", "Ordoñez", 2500, (float) 0.70, "6to A");
		Alumno alu3 = new Alumno("Guadalupe", "Hernandez", 2000, (float) 0.15, "1ro A");
		Alumno alu4 = new Alumno("Rosy", "Alvarez", 3500, (float) 0.10, "2do B");
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(alu1);
		listaAlumnos.add(alu2);
		listaAlumnos.add(alu3);
		listaAlumnos.add(alu4);
		
		System.out.println(listaAlumnos);
		
		
		Alumno alumno =null;
		
		//Buscar		
		alumno = listaAlumnos.get(0);
		System.out.println("Encontrado alumno con index 0: " + alumno.nombre +" "+alumno.apellido);
		
		
		//editar un registro
		alumno = listaAlumnos.get(2);
		alumno.setBeca((float) 0.75);
		System.out.println(listaAlumnos);
		
		//Eliminar 
		listaAlumnos.remove(3);
		System.out.println(listaAlumnos);
		
		//Recorrer todos los objetos
		
		for (Alumno alum : listaAlumnos) {			
			System.out.println("El alumno: "+alum.nombre+" Debe pagar la cantidad de :"+(float)alum.colegiatura*(1-alum.beca) );
		}
		

	}

}
