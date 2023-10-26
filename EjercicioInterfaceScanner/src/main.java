import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner lectura=null;		
		Implementacion imp = new Implementacion();
		String titulo;
		float precio;
		String formato;
		int cantidad;
		String productora;
		
		int menuPrincipal=0, submenu, indice;
		Peliculas peliTemp = null;
				
		Peliculas peli1= new Peliculas("Batman", (float) 323.5, "Blueray", 10, "Warner");
		Peliculas peli2= new Peliculas("Batman", (float) 253.8, "DVD", 20, "Warner");
		Peliculas peli3= new Peliculas("SpiderMan", (float) 331.5, "Blueray", 16, "Sony");
		Peliculas peli4= new Peliculas("El señor de los Anillos", (float) 280.4, "DVD", 10, "New Line");
		Peliculas peli5= new Peliculas("Bambi", (float) 100.0, "VHS", 10, "Disney");
		
		imp.guardar(peli1);
		imp.guardar(peli2);
		imp.guardar(peli3);
		imp.guardar(peli4);
		imp.guardar(peli5);
		
		do {
			String entrada;
			do {
				System.out.println("MENU PRINCIPAL\n");
				System.out.println("1 --- Guardar");
				System.out.println("2 --- Listar");
				System.out.println("3 --- Buscar");
				System.out.println("4 --- Editar");
				System.out.println("5 --- Eliminar");
				System.out.println("6 --- Buscar por titulo");
				System.out.println("7 --- Listar por formato");
				System.out.println("8 --- Eliminar por productora");
				System.out.println("9 --- Total por registro");
				System.out.println("10 --- Salir");
				lectura = new Scanner(System.in);
				entrada = lectura.nextLine();
				
			} while (!(imp.entero(entrada)));
			
			menuPrincipal=Integer.parseInt(entrada);
			try {				
			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingresar el titulo");
					lectura = new Scanner(System.in);
					titulo = lectura.nextLine();
					
					System.out.println("Ingresar el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingresar el formato");
					lectura = new Scanner(System.in);
					formato = lectura.nextLine();
					
					System.out.println("Ingresar la cantidad");
					lectura = new Scanner(System.in);
					cantidad = lectura.nextInt();
					
					System.out.println("Ingresar la productora");
					lectura = new Scanner(System.in);
					productora = lectura.nextLine();
					
					peliTemp = new Peliculas(titulo, precio, formato, cantidad, productora);
					imp.guardar(peliTemp);
					System.out.println("Se almacenó correctamente");
				} catch (Exception e) {
					System.out.println("Error al Guardar");
				}			
				
				break;
			case 2:
				imp.listar();
				break;
			case 3:
				imp.mostrarindiceTitulo();
				System.out.println("Ingrese el indicea buscar");
				try {
					lectura = new Scanner(System.in);
					indice= lectura.nextInt();
					System.out.println(imp.buscar(indice)); 
				} catch (Exception e) {
					System.out.println("Error al buscar");
				}
				
				break;
			case 4:
				imp.mostrarindiceTitulo();
				System.out.println("Ingrese el indice a modificar");
				lectura = new Scanner(System.in);
				indice= lectura.nextInt();
				peliTemp=imp.buscar(indice);				
				do {
					System.out.println("SUB MENU");
					System.out.println("1 --- Modificar precio");
					System.out.println("2 --- Modificar cantidad");
					System.out.println("3 --- Menu Principal");
					lectura = new Scanner(System.in);
					submenu= lectura.nextInt();
					switch (submenu) {
					case 1:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio= lectura.nextFloat();
						peliTemp.setPrecio(precio);
						imp.editar(indice, peliTemp);
						break;
					case 2:
						System.out.println("Ingrese la nueva cantidad");
						lectura = new Scanner(System.in);
						cantidad= lectura.nextInt();
						peliTemp.setCantidad(cantidad);
						imp.editar(indice, peliTemp);
						break;
					case 3:
					break;
					default:
						break;
					}
					
				} while (submenu<3);
				break;
			case 5:	
				imp.mostrarindiceTitulo();
				System.out.println("Ingrese el indice a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				imp.eliminar(indice);
				break;
			case 6:
				imp.mostrarindiceTitulo();
				System.out.println("\nIngrese el titulo a Buscar");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();
				if(imp.buscarTitulo(titulo).size()==0) {
				System.out.println("No hay registros a mostrar");	
				}System.out.println(imp.buscarTitulo(titulo));
				;
				break;
			case 7:		
				imp.mostrarFormato();
				System.out.println("Ingrese el formato a listar");
				lectura = new Scanner(System.in);
				formato = lectura.nextLine();
				imp.listarFormato(formato);
				break;
			case 8:		
				imp.mostrarProductora();
				System.out.println("Ingrese la productora a eliminar");
				lectura = new Scanner(System.in);
				productora = lectura.nextLine();
				imp.eliminarProductora(productora);
				break;
			case 9:	
				imp.total();
				break;
			case 10:				
				break;

			default:
				break;
			}	
				
			} catch (Exception e) {
				System.out.println("Error al capturar opcion");
			}
			
			
		} while(menuPrincipal<10);
	}

}
