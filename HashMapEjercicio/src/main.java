import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nombre;
		float precio;
		String tamanio;
		String complementos;
		
		Hamburgesa hamburgesa = null;
		Implementacion imp = new Implementacion();
		Scanner lectura = null;
		
		int menuPrincipal, subMenu;
		
		do {
			System.out.println("MENU PRINCIPAL McCALLE");
			System.out.println("1...Alta");
			System.out.println("2...Buscar");
			System.out.println("3...Actualizar");
			System.out.println("4...Eliminar");
			System.out.println("5...Listar");
			System.out.println("6...Salir");
			
			lectura = new Scanner(System.in);
			menuPrincipal=lectura.nextInt();
			
			/*
			 * lectura = new Scanner(System.in);
				=lectura;*/
			switch (menuPrincipal) {
			case 1:
				System.out.println("Ingresa el nombre de la hamburgesa");
				lectura = new Scanner(System.in);
				nombre=lectura.nextLine();
				
				System.out.println("Ingresa el precio");
				lectura = new Scanner(System.in);
				precio=lectura.nextFloat();
				
				System.out.println("Ingresa el tamaño");
				lectura = new Scanner(System.in);
				tamanio=lectura.nextLine();
				
				System.out.println("Ingresa los complementos");
				lectura = new Scanner(System.in);
				complementos=lectura.nextLine();
				
				//Creando objeto
				hamburgesa= new Hamburgesa(nombre, precio, complementos, tamanio);
				imp.agregar(hamburgesa);
				System.out.println("Se ha regsitrado correctamente");
				imp.listar();
				break;
			case 2:		
				System.out.println("Ingresa el nombre de la hamburgesa a buscar");
				lectura = new Scanner(System.in);
				nombre=lectura.nextLine();
				
				hamburgesa=new Hamburgesa(nombre);
				hamburgesa=imp.buscar(hamburgesa);
				System.out.println(hamburgesa);
				break;
			case 3:
				System.out.println("Ingresa el nombre a modificar");
				lectura = new Scanner(System.in);
				nombre=lectura.nextLine();
				
				hamburgesa=new Hamburgesa(nombre);
				hamburgesa=imp.buscar(hamburgesa);
				
				do {
					System.out.println("MENU DE EDITAR");
					System.out.println("1 ... Precio");
					System.out.println("2 ... Complementos");
					System.out.println("3 ... Regresar");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio=lectura.nextFloat();
						hamburgesa.setPrecio(precio);
						imp.actualizar(hamburgesa);
						System.out.println("Se actualizo correctamente el precio");
						break;
					case 2:
						System.out.println("Ingrese los complementos");
						lectura = new Scanner(System.in);
						complementos=lectura.nextLine();
						hamburgesa.setComplementos(complementos);
						imp.actualizar(hamburgesa);
						System.out.println("Se actualizo correctamente los complementos");
						break;
					case 3:						
						break;

					default:
						break;
					}
				} while (subMenu<3);
				break;
			case 4:
				System.out.println("Ingresa el nombre del producto a eliminar");
				lectura = new Scanner(System.in);
				nombre=lectura.nextLine();
				
				hamburgesa = new Hamburgesa(nombre);
				hamburgesa = imp.buscar(hamburgesa);
				
				imp.eliminar(hamburgesa);
				System.out.println("registro eliminado");
				break;
			case 5:		
				imp.listar();
				break;
			case 6:				
				break;			
			default:
				break;
			}
			
		} while (menuPrincipal<6);
	}

}
