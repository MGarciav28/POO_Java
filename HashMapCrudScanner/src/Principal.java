import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int numSerie;
		String marca;
		String modelo;
		float precio;
		
		Carros carro=null;
		Scanner lectura =null;
		//Instancia de clase
		Implementacion imp = new Implementacion();
		
		int menuPrincipal, subMenu;
		
		Carros car1 = new Carros(12345, "TOYOTA", "2020", 50000);
		Carros car2 = new Carros(67891, "TOYOTA", "2020", 50000);
		Carros car3 = new Carros(44725, "TOYOTA", "2020", 50000);
		Carros car4 = new Carros(96398, "TOYOTA", "2020", 50000);
		
		imp.guardar(car1);
		imp.guardar(car2);
		imp.guardar(car3);
		imp.guardar(car4);
		imp.listar();
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1 ... Alta");
			System.out.println("2 ... Buscar");
			System.out.println("3 ... Editar");
			System.out.println("4 ... Eliminar");
			System.out.println("5 ... Listar");
			System.out.println("6 ... salir");
			
			lectura = new Scanner(System.in);
			menuPrincipal=lectura.nextInt();
			
			switch (menuPrincipal) {
			case 1:
				System.out.println("Ingresa el numero de serie del carro");
				lectura = new Scanner(System.in);
				numSerie = lectura.nextInt();
				
				System.out.println("Ingresa la marca del carro");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				System.out.println("Ingresa el modelo");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();
				
				System.out.println("Ingresa el precio del carro");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				//Guardar
				carro = new Carros(numSerie, marca, modelo, precio);
				imp.guardar(carro);
				System.out.println("Se almacenó correctamente");
				break;
			case 2:		
				System.out.println("Ingrese el numero de serie a buscar");
				lectura = new Scanner(System.in);
				numSerie = lectura.nextInt();
				
				//invocando funcion
				carro = new Carros(numSerie);
				carro = imp.buscar(carro);
				System.out.println("Se encontro el " +carro);
				break;
			case 3:
				System.out.println("Ingrese el numero de serie a buscar");
				lectura = new Scanner(System.in);
				numSerie = lectura.nextInt();
				
				//Buscamos
				carro = new Carros(numSerie);
				carro=imp.buscar(carro);
				
				do {
					System.out.println("SUBMENU DE EDITAR");
					System.out.println("1 ... Marca");
					System.out.println("2 ... Precio");
					System.out.println("3 ... Regresar al menu principal");				
					
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					switch (subMenu) {
					case 1:
						System.out.println("Ingresa la nueva marca");
						lectura=new Scanner(System.in);
						marca = lectura.nextLine();
						//Actualizando
						carro.setMarca(marca);
						imp.editar(carro);
						System.out.println("Se editó correctamente la marca");
						
						break;
					case 2:
						System.out.println("Ingresa el nuevo precio");
						lectura=new Scanner(System.in);
						precio = lectura.nextFloat();
						//Actualizando
						carro.setPrecio(precio);
						imp.editar(carro);
						System.out.println("Se editó correctamente el precio");
						
						break;

					default:
						break;
					}
					
				} while (subMenu<3);
				break;
			case 4:
				System.out.println("Ingrese el numero de serie");
				lectura = new Scanner(System.in);
				numSerie = lectura.nextInt();
				//Eliminacion
				carro=new Carros(numSerie);
				carro=imp.buscar(carro);
				
				imp.eliminar(carro);
				System.out.println("Se Elimino el registro con serie: "+numSerie);
				break;
			case 5:		
				imp.listar();
				break;

			default:
				break;
			}
		} while (menuPrincipal<6);

	}
}
