import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		implementacion imp = new implementacion();
		Scanner lectura = null;
		int numSerie;
		String placa;
		String modelo;
		String marca;
		float precio;

		int menuPrin, indice, subMenu;

		Motos moto = null;

		Motos moto1 = new Motos(15895, "FD412", "Scooter", "Italika", 24500);
		Motos moto2 = new Motos(97451, "AS821", "Biker", "BMW", 204700);
		Motos moto3 = new Motos(77840, "WW236", "Chopper", "Harley Davidson", 385000);
		Motos moto4 = new Motos(96430, "NZ630", "Race", "Yamaha", 54000);

		imp.guardar(moto1);
		imp.guardar(moto2);
		imp.guardar(moto3);
		imp.guardar(moto4);

		do {
			System.out.println("\nMENU PRINCIPAL");
			System.out.println("1... Guardar");
			System.out.println("2... Listar");
			System.out.println("3... Buscar");
			System.out.println("4... Editar");
			System.out.println("5... Eliminar");
			System.out.println("6... Buscar por placa");
			System.out.println("7... Listar por marca");
			System.out.println("8... Eliminar por placa");
			System.out.println("9... Dinero invertido");
			System.out.println("10... Salir");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:
				/*
				 * int numSerie; String placa; String modelo; String marca; float precio;
				 */

				System.out.println("Ingrese el numero de serie");
				lectura = new Scanner(System.in);
				numSerie = lectura.nextInt();

				System.out.println("Ingrese el numero de placa");
				lectura = new Scanner(System.in);
				placa = lectura.nextLine();

				System.out.println("Ingrese el modelo");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				// Guardar
				moto = new Motos(numSerie, placa, modelo, marca, precio);
				imp.guardar(moto);
				break;
			case 2:
				imp.listar();
				break;
			case 3:
				imp.indicaMarca();
				System.out.println("\nIngrese el indice a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				moto = imp.buscar(indice);
				System.out.println("Se encontro el objeto " + moto);

				break;
			case 4:
				imp.indicaMarca();
				System.out.println("\nIngrese el indice a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				moto = imp.buscar(indice);
				System.out.println("Registro a modificar encontrado " + moto);
				do {
					System.out.println("MENU DE DATOS A EDITAR");
					System.out.println("1---Num. Serie");
					System.out.println("2---Placa");
					System.out.println("3---Menu Principal");

					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo nuemro de serie");
						lectura = new Scanner(System.in);
						numSerie = lectura.nextInt();
						
						//Actualizar
						moto.setNumSerie(numSerie);
						imp.editar(indice, moto);
						System.out.println("Se modificó exitosamente");
						break;

					case 2:
						System.out.println("Ingrese la placa nueva");
						lectura = new Scanner(System.in);
						placa = lectura.nextLine();
						
						//Actualizar
						moto.setPlaca(placa);;
						imp.editar(indice, moto);
						System.out.println("Se modificó exitosamente");
						break;
					case 3:

						break;

					default:
						break;
					}
				} while (subMenu < 3);

				break;
			case 5:
				imp.indicaMarca();
				
				System.out.println("Ingresa el indice a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				imp.eliminar(indice);
				break;
			case 6:
				imp.indiPlaca();
				System.out.println("Ingresa la placa a buscar");
				lectura = new Scanner(System.in);
				placa= lectura.nextLine();
				
				moto= imp.buscarPlaca(placa);
				System.out.println("Se encontro el vehiculo con placa: "+placa);
				System.out.println(moto);
				break;
			case 7:
				imp.indicaMarca();
				System.out.println("Ingresa la marca para filtrar");
				lectura = new Scanner(System.in);
				marca= lectura.nextLine();
				imp.ListarMarca(marca);
				break;
			case 8:
				imp.indiPlaca();
				System.out.println("Ingresa la placa de la moto a eliminar");
				lectura = new Scanner(System.in);
				placa= lectura.nextLine();
				imp.eliminarPlaca(placa);
				System.out.println("Se eliminó correctamente");
				break;
			case 9:
				System.out.println("La suma de dinero invertido es: " +imp.suma());
				break;
			case 10:
				break;

			default:
				break;
			}
		} while (menuPrin < 10);

	}

}
