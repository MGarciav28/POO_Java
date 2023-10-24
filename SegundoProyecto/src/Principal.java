import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Coleccion de objetos
		Empleados emp1 = new Empleados(1, "Miguel", "Garcia", "Angel", "miguel@gmail.com", 522144227l);
		Empleados emp2 = new Empleados(2, "Leo", "Perez", "Ortiz", "leo@gmail.com", 524133247l);
		Empleados emp3 = new Empleados(3, "Simon", "Salas", "Rico", "simon@gmail.com", 23009127l);

		// Declarar la lista
		List<Empleados> listaTraba = new ArrayList<Empleados>();

		// Agregar elementos a la lista
		listaTraba.add(emp1);
		listaTraba.add(emp2);
		listaTraba.add(emp3);

		// Mostrar la lista
		System.out.println(listaTraba);

		// Buscar dentro de una lista
		Empleados emp = null; // reserva espacio en memoria

		emp = listaTraba.get(1);
		System.out.println("Se encontro el empleado: " + emp.getNombre());

		// Buscar por nombre

		for (Empleados emplea : listaTraba) {
			if (emplea.nombre.equals("Simon")) {
				emp = emplea;
				break;
			}
		}
		System.out.println("Se encontro el empleado: " + emp.getNombre());

		// Editar un objeto en una lista
		emp = listaTraba.get(1); // buscar el objeto
		// empezar a editar
		emp.setNombre("Leonides");

		// Mostrar nuevamente la lista
		System.out.println(listaTraba);

		// Eliminar elemento
		listaTraba.remove(0);
		System.out.println(listaTraba);
		
		
		//mostrar con ciclo for -- nombre del elemento [0]
		
		for(int i=0; i<listaTraba.size(); i++) {
			System.out.println("Empleado en posicion "+i+": "+listaTraba.get(i).nombre);			
		}
		
		//Iterador para mostrar los registros de la lista
		Iterator<Empleados> iterEmpleados = listaTraba.iterator();
		for(int i=0; i<listaTraba.size(); i++) {
		while(iterEmpleados.hasNext()) {
			System.out.println("La lista contiene "+iterEmpleados.next());
		}
		}
			
	}

}
