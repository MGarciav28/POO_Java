import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;
		LocalDateTime fechaCompra;
		String producto;
		float precio;
		LocalDate limiteFactura;
		int menu = 0;

		List<Compras> listaCompras = new ArrayList<Compras>();

		Compras cp1 = new Compras(LocalDateTime.now(), "Refrescos", (float) 35.50, LocalDate.of(2023, 11, 24));
		Compras cp2 = new Compras(LocalDateTime.now(), "Cafe", (float) 86.30, LocalDate.of(2023, 11, 24));
		Compras cp3 = new Compras(LocalDateTime.now(), "Leche", (float) 27.80, LocalDate.of(2023, 11, 24));

		listaCompras.add(cp1);
		listaCompras.add(cp2);
		listaCompras.add(cp3);

		do {
			try {
				System.out.println("INGRESE LA OPCION DESEADA");
				System.out.println("1 --- Alta");
				System.out.println("2 --- Buscar");
				System.out.println("3 --- Editar");
				System.out.println("4 --- Eliminar");
				System.out.println("5 --- Listar");
				System.out.println("6 --- Salir");

				lectura = new Scanner(System.in);
				menu = lectura.nextInt();

				switch (menu) {
				case 1: {
					System.out.println("Favor de ingresar los datos del nuevo producto");
					System.out.println("Ingrese el nombre del producto");
					lectura=new Scanner(System.in);
					producto=lectura.nextLine();
					
					System.out.println("Ingrese el precio del producto");
					lectura=new Scanner(System.in);
					precio=lectura.nextFloat();
					
					System.out.println("Ingrese la fecha limite para facturar en formato aaaa-mm-dd");
					lectura=new Scanner(System.in);
					limiteFactura = LocalDate.parse(lectura.nextLine());
					
					try {
						Compras cpTemp = new Compras(LocalDateTime.now(), producto, precio, limiteFactura);
						listaCompras.add(cpTemp);
						System.out.println("Se ha agregado exitosamente el producto");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Error al agregar ");
					}
					
					break;
				}
				case 2: {
					String busqueda;
					System.out.println("Ingrese el producto que desea buscar");
					lectura = new Scanner(System.in);
					busqueda = lectura.nextLine();
					
					for (Compras compras : listaCompras) {
						if(compras.getProducto().contains(busqueda)) {
						System.out.println(compras);	
						}
					}

					break;
				}
				case 3: {
					int index;
					for (int i=0; i<listaCompras.size();i++) {
						System.out.println(i+" "+listaCompras.get(i).getProducto()+" "+listaCompras.get(i).getPrecio());
					}
										
					
					try {
						System.out.println("Ingrese el indice de producto a editar");
						lectura =new Scanner(System.in);
						index = lectura.nextInt();
						
						System.out.println("Ingrese el nombre del producto");
						lectura=new Scanner(System.in);
						producto=lectura.nextLine();
						
						System.out.println("Ingrese el precio del producto");
						lectura=new Scanner(System.in);
						precio=lectura.nextFloat();
						
						System.out.println("Ingrese la fecha limite para facturar en formato aaaa-mm-dd");
						lectura=new Scanner(System.in);
						limiteFactura = LocalDate.parse(lectura.nextLine());
						
						listaCompras.get(index).setProducto(producto);
						listaCompras.get(index).setPrecio(precio);
						listaCompras.get(index).setLimiteFactura(limiteFactura);
						System.out.println("Se actualizó con exito el registro");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Error al actualizar registro");
					}
					break;
				}
				case 4: {
					int index;
					for (int i=0; i<listaCompras.size();i++) {
						System.out.println(i+" "+listaCompras.get(i).getProducto()+" "+listaCompras.get(i).getPrecio());
					}
					
					System.out.println("Ingrese el indice de producto a eliminar");
					lectura =new Scanner(System.in);
					index = lectura.nextInt();
					try {
						listaCompras.remove(index);
						System.out.println("Se elimino con exito el registro");	
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("error al eliminar");
					}
					
					break;
				}
				case 5: {
					for (Compras compras : listaCompras) {
						System.out.println(compras);
					}
				
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + menu);
				}

			} catch (Exception e) {
				System.out.println("Error con el dato ingresado");
			}

		} while (menu < 6);

	}
}
